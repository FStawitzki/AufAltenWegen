package com.example.myapplication

import WebViewComponent
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import com.example.myapplication.ui.theme.MyApplicationTheme



class MainActivity : AppCompatActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
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
