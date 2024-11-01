package ru.kudashov.rollinitiative

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import ru.kudashov.rollinitiative.screen.actors_list.ActorsListScreen
import ru.kudashov.rollinitiative.ui.theme.UiKitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UiKitTheme {
                ActorsListScreen()
            }
        }
    }
}