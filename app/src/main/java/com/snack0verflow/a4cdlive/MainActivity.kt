package com.snack0verflow.a4cdlive

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.snack0verflow.a4cdlive.ui.theme.CDLiveTheme
import com.snack0verflow.a4cdlive.ui.theme.HomeGreen
import com.snack0verflow.a4cdlive.ui.theme.DarkHomeGreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CDLiveTheme {
                // A surface container using the 'background' color from the theme
                HomeScreen()
            }
        }
    }
}



//test test 1234