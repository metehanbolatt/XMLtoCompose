package com.metehanbolat.xmltocompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.text.style.LineHeightStyle
import com.metehanbolat.xmltocompose.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var composeView: ComposeView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        composeView = ComposeView(this)
        val view = binding.root
        setContentView(view)

        var control = false

        binding.button2.setOnClickListener {
            binding.xmlText.text = if (control) {
                "This is XML"
            } else "Hello XML"
            control = !control
        }

        binding.myComposeView.setContent {
            FirstScreen()
        }
    }
}