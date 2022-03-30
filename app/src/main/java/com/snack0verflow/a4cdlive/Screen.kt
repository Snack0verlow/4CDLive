package com.snack0verflow.a4cdlive

//class holding various screen objects used in Navigation.kt
sealed class Screen(val route: String) {
    object HomeScreen : Screen("home_screen")
    object MapScreen : Screen("map_screen")
}

