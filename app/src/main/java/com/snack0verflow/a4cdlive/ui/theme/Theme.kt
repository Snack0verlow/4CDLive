package com.snack0verflow.a4cdlive.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = DarkHomeGreen,
    primaryVariant = DarkHomeGreen,
    secondary = DarkHomeGreen
)

private val LightColorPalette = lightColors(
    primary = HomeGreen,
    primaryVariant = HomeGreen,
    secondary = HomeGreen

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun CDLiveTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        //colors = colors, //not using atm, uncommenting may cause bugs
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}