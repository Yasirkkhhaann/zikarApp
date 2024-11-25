package org.example.project

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import zikarapp.composeapp.generated.resources.Res
import zikarapp.composeapp.generated.resources.compose_multiplatform

@Composable

fun SplashScreen() {
    //Splash screen content


    Column(modifier = Modifier.fillMaxSize().background(color = Color.DarkGray)) {
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {

            Text(
                "Azkar List",
                color = Color.White,
                style = TextStyle(fontSize = 16.sp), modifier = Modifier.
                padding(top = 20.dp, bottom = 10.dp, start = 20.dp, end = 50.dp)
            )

        }
    }
}
