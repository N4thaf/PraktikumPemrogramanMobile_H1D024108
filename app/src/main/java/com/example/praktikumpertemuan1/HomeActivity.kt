package com.example.praktikumpertemuan1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.praktikumpertemuan1.ui.screen.DaftarProductScreen
import com.example.praktikumpertemuan1.ui.theme.PraktikumPertemuan1Theme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PraktikumPertemuan1Theme {
                DaftarProductScreen()
            }
        }
    }
}