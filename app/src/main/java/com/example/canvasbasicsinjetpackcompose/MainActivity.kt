 package com.example.canvasbasicsinjetpackcompose

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

 class MainActivity : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)

         val heartView = HeartView(this)
         setContentView(heartView)

         val circleView = CircleView(this)
         setContentView(circleView)
     }
 }
