package com.snack0verflow.a4cdlive

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.snack0verflow.a4cdlive.ui.theme.HomeGreen
import com.snack0verflow.a4cdlive.ui.theme.HomeWhite

@Composable
fun HomeScreen (navController: NavController) { //navController will be used
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
//TODO: each button on any HomeScreen composable should have an onClick function that passes
//      a route to navController.  These composable functions needs a navController: navController arg