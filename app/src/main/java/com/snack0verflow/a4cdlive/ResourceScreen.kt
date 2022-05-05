package com.snack0verflow.a4cdlive

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.snack0verflow.a4cdlive.ui.theme.HomeWhite

@Composable
fun ResourceScreen () {
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
        }
    }
}