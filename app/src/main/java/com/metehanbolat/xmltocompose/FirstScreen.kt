package com.metehanbolat.xmltocompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource

@Composable
fun FirstScreen() {

    var control by remember { mutableStateOf(false) }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "This is Compose")
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null
        )
        Text(text =  if (control) {
            "This is a Lion!"
        } else {
            "Hello Compose!"
        })
        Button(
            onClick = { control = !control }
        ) {
            Text(text = "Button")
        }
    }
}