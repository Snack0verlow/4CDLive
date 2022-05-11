package com.snack0verflow.a4cdlive

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

//Change layout according to different screen sizes
//Currently I haven't applied any of these codes in other files
//Hopefully, we can use it when we work on making it responsive for varying screen sizes

@Composable
fun rememberWindowInfo(): WindowInfo{
    val configuration = LocalConfiguration.current
    return WindowInfo(
        screenWidthInfo = when {
            configuration.screenWidthDp == 360 -> WindowInfo.WindowType.Pixel2
            else -> WindowInfo.WindowType.Pixel3
        },
        screenHeightInfo = when {
            configuration.screenHeightDp == 640 -> WindowInfo.WindowType.Pixel2
            else -> WindowInfo.WindowType.Pixel3
        },
        screenWidth = configuration.screenWidthDp.dp,
        screenHeight = configuration.screenHeightDp.dp
    )

}

data class WindowInfo(
    val screenWidthInfo: WindowType,
    val screenHeightInfo: WindowType,
    val screenWidth: Dp,
    val screenHeight: Dp,

) {
    sealed class WindowType{
        object Pixel2: WindowType()
        object Pixel3: WindowType()
    }
}