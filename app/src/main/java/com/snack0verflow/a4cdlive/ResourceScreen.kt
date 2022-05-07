package com.snack0verflow.a4cdlive

import android.graphics.Paint
import android.net.Uri
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.platform.UriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.snack0verflow.a4cdlive.ui.theme.ClubGreen
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

            Box(
                modifier = Modifier
                    .padding(start = 30.dp, end = 30.dp)
                    .fillMaxWidth()
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(15.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    //Put composables in their respective columns
                    Column (
                        verticalArrangement = Arrangement.spacedBy(15.dp),
                            ) {
                        Calendar()
                        FinancialAid()
                        Counseling()
                        Tutoring()


                    }
                    Column (
                        verticalArrangement = Arrangement.spacedBy(15.dp)
                            ) {
                        TransferResources()
                        Clubs()

                    }
                }
            }
        }
    }
}
@Composable
fun Calendar () {
    var uri = ""
    var uriHandler = LocalUriHandler.current
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            //.padding(start = 30.dp, end = 15.dp)
            //.size(height = 100.dp, width = 175.dp)
            .shadow(elevation = 5.dp, shape = RoundedCornerShape(25.dp))
            .background(HomeWhite)
            .fillMaxWidth(.5f)
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
            style = MaterialTheme.typography.h3,
            modifier = Modifier
                .padding(start = 15.dp)
        )
        Text(
            text = "Calendar",
            style = MaterialTheme.typography.h3,
            modifier = Modifier
                .padding(start = 15.dp, bottom = 10.dp)
        )
    }
}

@Composable
fun FinancialAid () {
    var uri = ""
    var uriHandler = LocalUriHandler.current
    Column(
        modifier = Modifier
            //.padding(start = 30.dp, top = 10.dp, end = 15.dp)
            //.size(height = 65.dp, width = 150.dp)
            .shadow(elevation = 5.dp, shape = RoundedCornerShape(25.dp))
            .background(HomeWhite)
            .fillMaxWidth(.5f)
            .clickable(
                onClick = {
                    uri = "https://studentaid.gov/h/apply-for-aid/fafsa"
                    uriHandler.openUri(uri)
                }
            )
    ){
        Image(
            painter = painterResource(id = R.drawable.financialaid),
            contentDescription = "Financial Aid",
            modifier = Modifier
                .size(45.dp)
                .padding(start = 15.dp, top = 15.dp, bottom = 5.dp)
        )
        Text(
            text = "Financial Aid",
            style = MaterialTheme.typography.h3,
            modifier = Modifier
                .padding(start = 15.dp, bottom = 10.dp)
        )
    }
}
@Composable
fun Tutoring () {
    var uri = ""
    var uriHandler = LocalUriHandler.current

    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            //.padding(start = 30.dp, top = 10.dp, end = 15.dp)
            //.size(height = 90.dp, width = 150.dp)
            .shadow(elevation = 5.dp, shape = RoundedCornerShape(25.dp))
            .background(HomeWhite)
            .fillMaxWidth(.5f)
            .clickable(
                onClick = {
                    uri =
                        "https://www.dvc.edu/current/student-centers/index.html"
                    uriHandler.openUri(uri)
                }
            )
    ){
        Image(
            painter = painterResource(id = R.drawable.tutoring),
            contentDescription = "Tutoring",
            modifier = Modifier
                .size(50.dp)
                .padding(start = 15.dp)
        )
        Text(
            text = "Tutoring",
            style = MaterialTheme.typography.h3,
            modifier = Modifier
                .padding(start = 15.dp)
        )
        Text(
            text = "Find Tutors",
            style = MaterialTheme.typography.h4,
            modifier = Modifier
                .padding(start = 15.dp, bottom = 10.dp)
        )

    }
}
@Composable
fun Clubs () {
    var uri = ""
    var uriHandler = LocalUriHandler.current

    Column(
        modifier = Modifier
            //.padding(top = 10.dp, end = 30.dp)
            //.size(height = 120.dp, width = 140.dp)
            .shadow(elevation = 5.dp, shape = RoundedCornerShape(25.dp))
            .background(ClubGreen)
            .fillMaxWidth()
            .clickable(
                onClick = {
                    uri = "https://dvc.campuslabs.com/engage/organizations"
                    uriHandler.openUri(uri)
                }
            )
    ){
        Image(
            painter = painterResource(id = R.drawable.studentorganization),
            contentDescription = "Clubs, Programs & Organizations",
            modifier = Modifier
                .padding(start = 15.dp, top = 10.dp, bottom = 10.dp)
                .size(30.dp)
        )
        Text(
            text = "Clubs, Programs",
            style = MaterialTheme.typography.h3,
            color = Color.White,
            modifier = Modifier
                .padding(start = 15.dp)
        )
        Text(
            text = "& Organizations",
            style = MaterialTheme.typography.h3,
            color = Color.White,
            modifier = Modifier
                .padding(start = 15.dp)
        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(bottom = 10.dp)
                .fillMaxWidth()
        ){
            Text(
                text = "Learn more",
                style = MaterialTheme.typography.h4,
                color = Color.White,
                modifier = Modifier
                    .padding(start = 15.dp)
            )
            Image (
                painter = painterResource(id = R.drawable.arrow),
                contentDescription = "Arrow",
                modifier = Modifier
                    .padding(top = 3.dp, end = 10.dp)
                    .size(10.dp)
            )
        }
    }
}
@Composable
fun TransferResources () {
    var uri = ""
    var uriHandler = LocalUriHandler.current

    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            //.padding(end = 30.dp)
            //.size(height = 65.dp, width = 140.dp)
            .fillMaxWidth()
            .shadow(elevation = 5.dp, shape = RoundedCornerShape(25.dp))
            .background(HomeWhite)
            .clickable(
                onClick = {
                    uri = "https://www.dvc.edu/enrollment/transfer/"
                    uriHandler.openUri(uri)
                }
            )
    ) {
        Image(
            painter = painterResource(id = R.drawable.transferresources),
            contentDescription = "Transfer Resources",
            modifier = Modifier
                .size(50.dp)
                .padding(start = 15.dp)
        )
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Transfer",
                style = MaterialTheme.typography.h3,
                modifier = Modifier
                    .padding(start = 15.dp,top = 5.dp,end = 10.dp)

            )
            Text(
                text = "Resources",
                style = MaterialTheme.typography.h3,
                modifier = Modifier
                    .padding(start = 15.dp,end = 10.dp)
            )
            Text(
                text = "View Services",
                style = MaterialTheme.typography.h4,
                modifier = Modifier
                    .padding(start = 15.dp, bottom = 5.dp,end = 10.dp)
            )
        }

    }
}
@Composable
fun Counseling(){
    var uri=""
    var uriHandler= LocalUriHandler.current
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier=Modifier
            //.padding(start=30.dp,end=15.dp)
            //.size(height = 100.dp, width = 140.dp)
            .shadow(elevation = 5.dp,shape = RoundedCornerShape(25.dp))
            .background(HomeWhite)
            .fillMaxWidth(.5f)
            .clickable(
            onClick={
                uri ="https://www.dvc.edu/enrollment/counseling/index.html"
                uriHandler.openUri(uri)
            }
        )
    )
    {
        Image(
            painter = painterResource(id=R.drawable.counselling),
            contentDescription = "Counseling",
            modifier = Modifier
                .size(50.dp)
                .padding(start = 15.dp)
        )
        Text(
            text = "Counseling",
            style = MaterialTheme.typography.h3,
            modifier = Modifier
                .padding(start = 15.dp, bottom = 15.dp)
        )
        Column(
            //TODO: horizontalAlignment = Alignment.CenterHorizontally?
        ){
            Box(
                modifier = Modifier
                    .padding(bottom = 10.dp)
                    .size(height = 40.dp, width = 120.dp)
                    .shadow(elevation = 10.dp,shape = RoundedCornerShape(25.dp))
                    .background(ClubGreen)
                    .fillMaxWidth(.5f)

            ) {
                Text(
                    text = "Book An Appointment",
                    style = MaterialTheme.typography.h4,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier=Modifier
                        .padding()
                )
            }
        }
    }
}