package com.snack0verflow.a4cdlive

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.snack0verflow.a4cdlive.ui.theme.HomeGreen
import com.snack0verflow.a4cdlive.ui.theme.HomeWhite

@Composable
fun HomeScreen (navController: NavController) {
    //home screen background color
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(HomeWhite)
    ) {
        //Splash for top corner
        TopSplash()

        //this column will hold the other composables
        Column {
            LogoSection()
            MainBox(navController = navController)
        }

    }
}
//composes the DVC Logo
@Composable
fun LogoSection (

) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 30.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.dvclogotransparent),
            contentDescription = "DVC Logo",
            modifier = Modifier
                .size(150.dp),
            alpha = .7f //FIXME: do we want slight transparency or no?
        )

    }

}
//composes the Top Right Splash
@Composable
fun TopSplash (

){
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.TopEnd
    ) {
        Image(
            painter = painterResource(id = R.drawable.toprightsplash),
            contentDescription = "Top Right Splash",
            contentScale = ContentScale.FillBounds, //needed to fill box parameters
            modifier = Modifier
                .size(300.dp)
        )
    }
}
//TODO: add composables for the main box, two small boxes, bottom nav bar, bottom left splash

@Composable
fun MainBox (
    navController: NavController
){
    Row( //FIXME: Needs map screen (crashes when clicked w/o)
        verticalAlignment = Alignment.Bottom,
        modifier = Modifier
            .padding(30.dp)
            .shadow(elevation = 5.dp, shape = RoundedCornerShape(30.dp))
            .clip(RoundedCornerShape(30.dp))
            .background(HomeWhite)
            .fillMaxWidth()
            .clickable (
                onClick = {
                    navController.navigate(Screen.MapScreen.route)
                }
                    )
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(30.dp)
        ) {
            Text(
                text = "Navigate",
                style = MaterialTheme.typography.h1,
            )
            Text(
                text = "view the campus map"
            )
        }

        Image(
            painter = painterResource(id = R.drawable.avatarhome2),
            contentDescription = "HomeScreen Avatar",
            modifier = Modifier
                .size(225.dp)
                .padding(top = 30.dp, start = 10.dp, bottom = 10.dp),
            alignment = Alignment.BottomStart
        )


    }
}

/* SCRAP CODE
@Composable
fun MainBox (
    navController: NavController
){
    Box(
        modifier = Modifier
            .padding(30.dp)
            .shadow(elevation = 5.dp, shape = RoundedCornerShape(30.dp))
            .clip(RoundedCornerShape(30.dp))
            .background(HomeWhite)
            .fillMaxWidth()
    ){
        Row(
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Start
        ) {

            Image(
                painter = painterResource(id = R.drawable.avatarhome2),
                contentDescription = "HomeScreen Avatar",
                modifier = Modifier
                    .size(205.dp)
                    .padding(top = 30.dp, start = 10.dp, bottom = 10.dp),
                alignment = Alignment.BottomStart
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .padding(10.dp)
            ) {
                Text(
                    text = "Navigation",
                    style = MaterialTheme.typography.h1
                )
                Text(
                    text = "view the campus map"
                )
            }

        }

    }
}
 */