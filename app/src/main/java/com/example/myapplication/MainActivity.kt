package com.example.myapplication

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import com.example.myapplication.ui.theme.MyApplicationTheme

import com.example.myapplication.WebViewComponent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = androidx.compose.ui.Modifier.fillMaxSize()) {
                    // Use WebViewComponent
                    WebViewComponent(this)
                }
            }
        }
    }
}
