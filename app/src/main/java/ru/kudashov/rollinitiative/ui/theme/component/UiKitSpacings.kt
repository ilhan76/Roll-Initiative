package ru.kudashov.rollinitiative.ui.theme.component

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Спейсинги из Ui-Kit.
 */
@Immutable
data class UiKitSpacings(
    val xxSmall: Dp,
    val xSmall: Dp,
    val small: Dp,
    val medium: Dp,
    val large: Dp,
    val xLarge: Dp,
    val xxLarge: Dp,
    val xxxLarge: Dp,
    val xxxxLarge: Dp,
)

private var spacings: UiKitSpacings? = null

val LocalUiKitSpacing = staticCompositionLocalOf<UiKitSpacings?> { null }

fun getUiKitSpacings(): UiKitSpacings {
    return spacings ?: createUiKitSpacings().also { spacings = it }
}

private fun createUiKitSpacings(): UiKitSpacings {
    return UiKitSpacings(
        xxSmall = 2.dp,
        xSmall = 4.dp,
        small = 8.dp,
        medium = 12.dp,
        large = 16.dp,
        xLarge = 20.dp,
        xxLarge = 24.dp,
        xxxLarge = 32.dp,
        xxxxLarge = 40.dp
    )
}