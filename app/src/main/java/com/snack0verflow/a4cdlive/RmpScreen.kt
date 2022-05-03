package com.snack0verflow.a4cdlive

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.snack0verflow.a4cdlive.ui.theme.HomeWhite

@Composable
fun RmpScreen (profList: MutableList<Professors>) {
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
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                items(items = profList) { professor ->

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .shadow(elevation = 5.dp, shape = RoundedCornerShape(30.dp))
                            .background(HomeWhite)
                            .fillMaxWidth()
                    ) {
                        Column() {
                            Text(
                                text = professor.name,
                                style = MaterialTheme.typography.h2,
                                modifier = Modifier.padding(start = 15.dp)
                            )
                            Text(
                                text = professor.subject,
                                style = MaterialTheme.typography.caption,
                                modifier = Modifier.padding(start = 15.dp)
                            )

                        }
                        Text(
                            text = professor.rating,
                            modifier = Modifier.padding(end  = 10.dp)
                        )
                        Text(
                            text = professor.difficulty,
                            modifier = Modifier.padding(end = 10.dp)
                        )

                    }
                }
            }
        }
    }
}
