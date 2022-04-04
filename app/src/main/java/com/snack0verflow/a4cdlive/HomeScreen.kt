package com.snack0verflow.a4cdlive

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.NavController
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
            MainBox()
            Box { //box needed to overlap elements
                BottomLeftSplash()
                BoxRow()
            }
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
//TODO: add composables for two small boxes, bottom nav bar, bottom left splash

@Composable
fun MainBox (

){
    //map to DVC - ?z=17 is zoom level (close enough to see building titles)
    //an Intent signifies that a URI should be opened in another app
    val gmmIntentUri = Uri.parse("geo:37.96871966995606, -122.07120734663494?z=17")
    val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
    val context = LocalContext.current
    mapIntent.setPackage("com.google.android.apps.maps")

    Row(
        verticalAlignment = Alignment.Bottom,
        modifier = Modifier
            .padding(start = 30.dp, end = 30.dp, bottom = 10.dp)
            .shadow(elevation = 5.dp, shape = RoundedCornerShape(30.dp))
            .clip(RoundedCornerShape(30.dp))
            .background(HomeWhite)
            .fillMaxWidth()
            .clickable(
                onClick = {
                    //starts Google Maps
                    startActivity(context, mapIntent, null)
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
@Composable
fun BoxRow (

){
    var uri = ""
    val uriHandler = LocalUriHandler.current
    Row(
        modifier = Modifier
            .padding(start = 30.dp, top = 10.dp, bottom = 10.dp, end = 30.dp)
            .fillMaxWidth()
    ) {
        Box(

            modifier = Modifier
                .padding(end = 30.dp)
                .shadow(elevation = 5.dp, shape = RoundedCornerShape(30.dp))
                .size(160.dp)
                .background(HomeWhite)
                .fillMaxWidth()
                .clickable(
                    onClick = {
                        uri = "https://dvc.libcal.com/reserve/sr"
                        uriHandler.openUri(uri)
                    }
                )
        ) {
            Image(painter = painterResource(
                id = R.drawable.bookswhtback),
                contentDescription = "Books for Study Room Tile",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.fillMaxSize()
            )
            Text(
                text = "Reserve a Study Room",
                style = MaterialTheme.typography.h2,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(10.dp)

            )
        }
        Box(
            modifier = Modifier
                .shadow(elevation = 5.dp, shape = RoundedCornerShape(30.dp))
                .size(160.dp)
                .background(HomeWhite)
                .fillMaxWidth()
                .clickable(
                    onClick = {
                        //TODO: change to actual RMP page in our app? right now just opens RMP
                        uri = "https://www.ratemyprofessors.com/campusRatings.jsp?sid=1245"
                        uriHandler.openUri(uri)
                    }
                )
        ) {
            Image(
                painter = painterResource(id = R.drawable.bookswhtback),
                contentDescription = "Twig for RMP",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.fillMaxSize()
            )
            Text(
                text = "Rate My Professor",
                style = MaterialTheme.typography.h2,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(10.dp)

            )
        }
    }
}

@Composable
fun BottomLeftSplash (

){
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.BottomStart
    ) {
        Image(
            painter = painterResource(id = R.drawable.btmleftsplash),
            contentDescription = "Bottom Left Splash",
            contentScale = ContentScale.FillBounds, //needed to fill box parameters
            modifier = Modifier
                .size(300.dp)
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