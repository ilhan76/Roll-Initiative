package ru.kudashov.rollinitiative.ui.theme.component

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Immutable
data class UiKitTypography(
    val header1: TextStyle,
    val header2: TextStyle,
    val button: TextStyle,
    val button2: TextStyle,
    val subtitle1: TextStyle,
    val subtitle2: TextStyle,
    val body1: TextStyle,
    val body2: TextStyle,
    val caption1: TextStyle,
    val caption2: TextStyle,
)

private var typography: UiKitTypography? = null

val LocalUiKitTypography = staticCompositionLocalOf<UiKitTypography?> { null }

fun getUiKitTypography(): UiKitTypography {
    return typography ?: createUiKitTypography().also { typography = it }
}

private fun createUiKitTypography(): UiKitTypography {
    return UiKitTypography(
        header1 = TextStyle(
            fontSize = 24.sp,
            lineHeight = 28.sp,
            fontWeight = FontWeight(400),
            letterSpacing = 0.1.sp
        ),
        header2 = TextStyle(
            fontSize = 20.sp,
            lineHeight = 24.sp,
            fontWeight = FontWeight(400)
        ),
        button = TextStyle(
            fontSize = 18.sp,
            lineHeight = 22.sp,
            fontWeight = FontWeight(400),
            letterSpacing = 0.1.sp
        ),
        button2 = TextStyle(
            fontSize = 13.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight(400),
            letterSpacing = 0.1.sp
        ),
        subtitle1 = TextStyle(
            fontSize = 16.sp,
            lineHeight = 20.sp,
            fontWeight = FontWeight(400),
            letterSpacing = 0.3.sp
        ),
        subtitle2 = TextStyle(
            fontSize = 16.sp,
            lineHeight = 20.sp,
            fontWeight = FontWeight(500)
        ),
        body1 = TextStyle(
            fontSize = 14.sp,
            lineHeight = 18.sp,
            fontWeight = FontWeight(400)
        ),
        body2 = TextStyle(
            fontSize = 14.sp,
            lineHeight = 18.sp,
            fontWeight = FontWeight(500)
        ),
        caption1 = TextStyle(
            fontSize = 12.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight(400)
        ),
        caption2 = TextStyle(
            fontSize = 12.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight(500)
        )
    )
}