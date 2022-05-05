package com.snack0verflow.a4cdlive

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.snack0verflow.a4cdlive.ui.theme.HomeWhite

@Composable
fun ResourceScreen () {
    //defining url handlers
    var uri = ""
    var uriHandler = LocalUriHandler.current
    //home screen background color
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(HomeWhite)
    ) {
        //Splash for top corner
        Column(verticalArrangement = Arrangement.spacedBy(100.dp)
        ) {
            TopSplash()
            BottomLeftSplash()
        }
        Column(){
            Text(
                text = "Resources",
                style = MaterialTheme.typography.h1,
                modifier = Modifier
                    .padding(30.dp)
            )
            Box() {
                Row() {
                    Column() {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .padding(start = 30.dp)
                                .size(height = 150.dp, width = 200.dp)
                                .shadow(elevation = 5.dp, shape = RoundedCornerShape(30.dp))
                                .background(HomeWhite)
                                .clickable(
                                    onClick = {
                                        uri = "https://www.dvc.edu/academics/calendars/index.html"
                                        uriHandler.openUri(uri)
                                    }
                                        )
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.calendar),
                                contentDescription = "Academic Calendar",
                                modifier = Modifier
                                    .size(50.dp)
                                    .padding(start = 15.dp)
                            )
                            Text(
                                text = "Academic",
                                style = MaterialTheme.typography.h2,
                                modifier = Modifier
                                    .padding(start = 15.dp, top = 10.dp)
                            )
                            Text(
                                text = "Calendar",
                                style = MaterialTheme.typography.h2,
                                modifier = Modifier
                                    .padding(start = 15.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}