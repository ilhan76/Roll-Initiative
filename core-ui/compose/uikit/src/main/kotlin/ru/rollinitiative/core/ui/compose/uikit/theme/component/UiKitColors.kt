package ru.rollinitiative.core.ui.compose.uikit.theme.component

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class UiKitColors(
    val primary: Color,
    val secondary: Color,
    val textColorPrimary: Color,
    val textColorPrimaryWithAlpha: Color,
    val textColorSecondary: Color,
    val background: Color,
    val error: Color,
    val success: Color,
    val transparent: Color
)

private var colors: UiKitColors? = null
private var colorsDark: UiKitColors? = null

val LocalUiKitColors = staticCompositionLocalOf<UiKitColors?> { null }

fun getUiKitColors(): UiKitColors = colors ?: createUiKitColors().also { colors = it }
fun getUiKitColorsDark(): UiKitColors = colorsDark ?: createUiKitColorsDark().also { colorsDark = it }

private fun createUiKitColors(): UiKitColors {
    return UiKitColors(
        primary = Color(0xFFE8E2D2),
        secondary = Color(0xFFFFA344),
        textColorPrimary = Color(0xFF172C0F),
        textColorPrimaryWithAlpha = Color(0x80172C0F),
        textColorSecondary = Color(0xFF172C0F),
        background = Color(0xFFF8F6F0),
        error = Color(0xFFFF3B30),
        success = Color(0xFF22B447),
        transparent = Color(0x00000000),
    )
}

private fun createUiKitColorsDark(): UiKitColors {
    return UiKitColors(
        primary = Color(0xFFFAE9D5),
        secondary = Color(0xFF5F2015),
        textColorPrimary = Color(0xFF251007),
        textColorPrimaryWithAlpha = Color(0x80251007),
        textColorSecondary = Color(0xFFFAE9D5),
        background = Color(0xFF6F6059),
        error = Color(0xFFFF3B30),
        success = Color(0xFF22B447),
        transparent = Color(0x00000000),
    )
}