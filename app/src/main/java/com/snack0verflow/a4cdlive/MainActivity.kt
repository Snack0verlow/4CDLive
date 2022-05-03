package com.snack0verflow.a4cdlive

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.R
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import androidx.navigation.compose.rememberNavController
import com.snack0verflow.a4cdlive.ui.theme.CDLiveTheme
import com.snack0verflow.a4cdlive.ui.theme.HomeGreen
import com.snack0verflow.a4cdlive.ui.theme.DarkHomeGreen
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //removes status bar padding, transparency set in themes.xml (v23)
        //WindowCompat.setDecorFitsSystemWindows(window, false) //FIXME: had set to fill window but navbar doesn't show when set

        fun readerCSV (): MutableList<Professors> {
            val input: InputStream = resources.openRawResource(R.raw.rmp2)
            val bufferedReader = BufferedReader(InputStreamReader(input))
            var line: String
            var professorList = mutableListOf<Professors>()

            //put number of professors + 1 from RMPscraper -> for (i in 1..#) - (indicates end of file)
            //replaced while(bufferedReader.readLine() != null) because was causing crash with rmp2
            //but not with rmp1 -- unsure why, perhaps worth exploring later
            for (i in 1..1609) {
                line = bufferedReader.readLine()
                var profList: List<String> = line.split(',')
                val name = profList[0]
                val rating = profList[1]
                val subject = profList[2]
                val difficulty = profList[3]
                val link = profList[4]
                val professor = Professors(name, rating, subject, difficulty, link)
                professorList.add(professor)
            }
            professorList.removeAt(0) //remove header
            professorList.sortBy { it.name } //sort by first name alphabetically
            return professorList
        }
        setContent {
            CDLiveTheme {
                //composables for screens go in navigation.kt
                //Navigation starts on HomeScreen
                //MainView Displays all screens
                MainView(readerCSV())
            }
        }
    }
}