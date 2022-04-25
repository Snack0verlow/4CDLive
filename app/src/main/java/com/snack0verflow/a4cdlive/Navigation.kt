package com.snack0verflow.a4cdlive

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation (
navController : NavHostController
) {
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        composable(Screen.HomeScreen.route) {
            HomeScreen()
        }

        composable(Screen.RmpScreen.route) {
            RmpScreen()
        }

        composable(Screen.ResourceScreen.route) {
            ResourceScreen()
        }



        //TODO: add more composables for other screens (resources, etc)
    }
}
