package com.geeksforgeeks.jcscreenorientation

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyCustomContent()
        }
    }
}

@Composable
fun MyCustomContent() {
    Scaffold(
        topBar = { TopAppBar(title = { Text("GFG | Screen Orientation", color = Color.White) }, backgroundColor = Color(0xff0f9d58)) },
        content = {
            Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {

                val configuration = LocalConfiguration.current
                when (configuration.orientation) {
                    Configuration.ORIENTATION_LANDSCAPE -> {
                        Text("Landscape")
                    }
                    else -> {
                        Text("Portrait")
                    }
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyCustomContent()
}
