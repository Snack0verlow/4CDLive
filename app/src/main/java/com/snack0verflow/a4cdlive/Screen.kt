package com.snack0verflow.a4cdlive

//class holding various screen objects used in Navigation.kt
sealed class Screen(val route: String) {
    object HomeScreen : Screen("home_screen")
    object RmpScreen : Screen("rmp_screen")
    object ResourceScreen : Screen("resource_screen")
}

