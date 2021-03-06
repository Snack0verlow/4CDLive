package com.snack0verflow.a4cdlive.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.snack0verflow.a4cdlive.R

val Custom = FontFamily(
    Font(R.font.jost_medium, FontWeight.Medium),
    Font(R.font.inter_extrabold, FontWeight.ExtraBold)
)

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    h1 = TextStyle(
        fontFamily = Custom,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 40.sp

    ),
    h2 = TextStyle(
        fontFamily = Custom,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 20.sp

    ),
    h3 = TextStyle(
        fontFamily = Custom,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 17.sp

    ),
    h4 = TextStyle(
        fontFamily = Custom,
        fontWeight = FontWeight.Medium,
        fontSize = 13.sp,
        color = Color.Gray
)



    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
        caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp

    */
)