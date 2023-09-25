package com.example.authentication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity

class MainActivity :  AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            /** AuthenticationTheme {
             // A surface container using the 'background' color from the theme
             Surface(
             modifier = Modifier.fillMaxSize(),
             color = MaterialTheme.colorScheme.background,
             ) {
             LogInScreen()
             }
             } **/
        }
    }
}
