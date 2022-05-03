package com.snack0verflow.a4cdlive

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController

@Composable
fun MainView (
    profList: MutableList<Professors>
){
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            Box(
                modifier = Modifier
                    .padding(start = 15.dp, end = 15.dp)
                    .shadow(elevation = 5.dp, shape = RoundedCornerShape(30.dp))
                    .fillMaxWidth()
                    .alpha(.9f)
            ){
                BottomNavigationBar(items = listOf(
                    BottomNavItem(
                        name = "Home",
                        route = Screen.HomeScreen.route,
                        icon = Icons.Default.Home
                    ),
                    BottomNavItem(
                        name = "RMP",
                        route = Screen.RmpScreen.route,
                        icon = Icons.Default.Face
                    ),
                    BottomNavItem(
                        name = "Resources",
                        route = Screen.ResourceScreen.route,
                        icon = Icons.Default.Info
                    ),
                ),
                    navController = navController,
                    onItemClick = {navController.navigate(it.route)}
                )
            }
        }

    ) {
        Navigation(navController = navController, profList)
    }
}