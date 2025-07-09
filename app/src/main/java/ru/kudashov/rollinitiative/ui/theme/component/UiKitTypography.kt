package ru.kudashov.rollinitiative.ui.theme.component

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.toFontFamily
import androidx.compose.ui.unit.sp
import ru.kudashov.rollinitiative.R

@Immutable
data class UiKitTypography(
    val text24sp: TextStyle,
    val text20sp: TextStyle,
    val text18sp: TextStyle,
    val text13sp: TextStyle,
    val text16sp: TextStyle,
    val text16spSemiBold: TextStyle,
    val text14sp: TextStyle,
    val text14spMedium: TextStyle,
    val text12sp: TextStyle,
    val text12spMedium: TextStyle,
)

private var typography: UiKitTypography? = null

val LocalUiKitTypography = staticCompositionLocalOf<UiKitTypography?> { null }

fun getUiKitTypography(): UiKitTypography {
    return typography ?: createUiKitTypography().also { typography = it }
}

private fun createUiKitTypography(): UiKitTypography {
    return UiKitTypography(
        text24sp = TextStyle(
            fontSize = 24.sp,
            lineHeight = 28.sp,
            fontWeight = FontWeight(400),
            fontFamily = Font(R.font.inter_regular).toFontFamily(),
            letterSpacing = 0.1.sp
        ),
        text20sp = TextStyle(
            fontSize = 20.sp,
            lineHeight = 24.sp,
            fontWeight = FontWeight(400),
            fontFamily = Font(R.font.inter_regular).toFontFamily(),
        ),
        text18sp = TextStyle(
            fontSize = 18.sp,
            lineHeight = 22.sp,
            fontWeight = FontWeight(400),
            fontFamily = Font(R.font.inter_regular).toFontFamily(),
            letterSpacing = 0.1.sp
        ),
        text13sp = TextStyle(
            fontSize = 13.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight(400),
            fontFamily = Font(R.font.inter_regular).toFontFamily(),
            letterSpacing = 0.1.sp
        ),
        text16sp = TextStyle(
            fontSize = 16.sp,
            lineHeight = 20.sp,
            fontWeight = FontWeight(400),
            fontFamily = Font(R.font.inter_regular).toFontFamily(),
            letterSpacing = 0.3.sp
        ),
        text16spSemiBold = TextStyle(
            fontSize = 16.sp,
            lineHeight = 20.sp,
            fontWeight = FontWeight(600),
            fontFamily = Font(R.font.inter_regular).toFontFamily(),
        ),
        text14sp = TextStyle(
            fontSize = 14.sp,
            lineHeight = 18.sp,
            fontWeight = FontWeight(400),
            fontFamily = Font(R.font.inter_regular).toFontFamily(),
        ),
        text14spMedium = TextStyle(
            fontSize = 14.sp,
            lineHeight = 18.sp,
            fontWeight = FontWeight(500),
            fontFamily = Font(R.font.inter_regular).toFontFamily(),
        ),
        text12sp = TextStyle(
            fontSize = 12.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight(400),
            fontFamily = Font(R.font.inter_regular).toFontFamily(),
        ),
        text12spMedium = TextStyle(
            fontSize = 12.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight(500),
            fontFamily = Font(R.font.inter_regular).toFontFamily(),
        )
    )
}