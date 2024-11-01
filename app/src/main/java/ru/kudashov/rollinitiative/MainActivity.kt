package ru.kudashov.rollinitiative

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.Modifier
import ru.kudashov.rollinitiative.screen.actors_list.ActorsListScreen
import ru.kudashov.rollinitiative.ui.theme.UiKitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.auto(
                lightScrim = Color.TRANSPARENT,
                darkScrim = Color.TRANSPARENT,
                detectDarkMode = { true }
            ),
            navigationBarStyle = SystemBarStyle.auto(
                lightScrim = Color.argb(0xe6, 0xFF, 0xFF, 0xFF),
                darkScrim = Color.argb(0x80, 0x1b, 0x1b, 0x1b),
                detectDarkMode = { true }
            )
        )
        setContent {
            UiKitTheme(darkTheme = true) {
                Box(Modifier.background(color = UiKitTheme.colors.background)) {
                    ActorsListScreen()
                }
            }
        }
    }
}