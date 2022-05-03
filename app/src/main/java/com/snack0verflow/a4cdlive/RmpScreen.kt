package com.snack0verflow.a4cdlive

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.snack0verflow.a4cdlive.ui.theme.*

@Composable
fun RmpScreen (profList: MutableList<Professors>) {

    var uri = ""
    val uriHandler = LocalUriHandler.current
    var isExpanded by remember { mutableStateOf(false)}

    //home screen background color
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(HomeWhite)
    ) {

        //Background
        Column(verticalArrangement = Arrangement.spacedBy(100.dp)
        ) {
            TopSplash()
            BottomLeftSplash()
        }
        Column(
            modifier = Modifier
                .padding(15.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = "Ratings",
                style = MaterialTheme.typography.h1,
                modifier = Modifier.padding(bottom = 10.dp)
            )
            LazyColumn(
                state = rememberLazyListState(),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                items(items = profList) { professor ->

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .shadow(elevation = 5.dp, shape = RoundedCornerShape(20.dp))
                            .background(HomeWhite)
                            .fillMaxWidth()
                            .pointerInput(Unit) {
                                detectTapGestures(
                                    onTap = {
                                        uri += professor.link
                                        uriHandler.openUri(uri)
                                    },
                                    onLongPress = {
                                        isExpanded = !isExpanded
                                    }
                                )
                            }

                    ) {
                        Column() {
                            Text(
                                text = professor.name,
                                style = MaterialTheme.typography.h2,
                                modifier = Modifier.padding(start = 15.dp, top = 5.dp)
                            )
                            Text(
                                text = professor.subject,
                                style = MaterialTheme.typography.caption,
                                modifier =
                                if (isExpanded) {
                                    Modifier.padding(start = 15.dp)
                                }
                                else {
                                    Modifier.padding(start = 15.dp, bottom = 5.dp)
                                }
                            )
                            if (isExpanded){
                                Text(
                                    text = "Difficulty: " + professor.difficulty,
                                    modifier = Modifier.padding(start = 15.dp, bottom = 5.dp)
                                )
                            }

                        }
                        Row() {
                            var rating = professor.rating.toDouble()
                            Box(
                                modifier = Modifier
                                    .padding(end = 5.dp)
                                    .size(35.dp)
                                    .shadow(elevation = 5.dp, shape = RoundedCornerShape(10.dp))
                                    .clip(RoundedCornerShape(10.dp))
                                    .background(
                                        if (rating == 0.0) {
                                            Color.LightGray
                                        } else if (rating <= 1.6) {
                                            RedRating
                                        } else if (rating >= 3.2) {
                                            GreenRating
                                        } else {
                                            YellowRating
                                        }
                                    )

                            ) {
                                Text(
                                    text = professor.rating,
                                    style = MaterialTheme.typography.h2,
                                    modifier = Modifier
                                        .align(Alignment.Center)
                                )
                            }
                            Text(
                                text = "/5.0",
                                modifier = Modifier
                                    .padding(end = 20.dp, top = 8.dp)
                                    .alpha(.3f)
                            )
                        }

                    }
                }
            }
        }
    }
}
