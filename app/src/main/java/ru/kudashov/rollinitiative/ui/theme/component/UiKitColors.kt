package ru.kudashov.rollinitiative.ui.theme.component

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class UiKitColors(
    val primary: Color,
    val secondary: Color,
    val tertiary: Color,
    val textColorPrimary: Color,
    val textColorSecondary: Color,
    val textColorTertiary: Color,
    val background: Color,
    val error: Color,
    val success: Color,
)

private var colors: UiKitColors? = null
private var colorsDark: UiKitColors? = null

val LocalUiKitColors = staticCompositionLocalOf<UiKitColors?> { null }

fun getUiKitColors(): UiKitColors = colors ?: createUiKitColors().also { colors = it }
fun getUiKitColorsDark(): UiKitColors = colorsDark ?: createUiKitColorsDark().also { colorsDark = it }

private fun createUiKitColors(): UiKitColors {
    return UiKitColors(
        primary = Color(0xffefa11f),
        secondary = Color(0xFFebe7d9),
        tertiary = Color(0xFFe4e2dd),
        textColorPrimary = Color(0xFFFFFFFF),
        textColorSecondary = Color(0xFF042a12),
        textColorTertiary = Color(0xFF6d6d6c),
        background = Color(0xFFf8f6f0),
        error = Color(0xFFFF3B30),
        success = Color(0xFF22B447),
    )
}

private fun createUiKitColorsDark(): UiKitColors {
    return UiKitColors(
        primary = Color(0xffad7924),
        secondary = Color(0xFF171f25),
        tertiary = Color(0xFF1e272b),
        textColorPrimary = Color(0xFFb5b8b9),
        textColorSecondary = Color(0xFFb5b8b9),
        textColorTertiary = Color(0xFF727677),
        background = Color(0xFF121a20),
        error = Color(0xFFFF3B30),
        success = Color(0xFF22B447),
    )
}