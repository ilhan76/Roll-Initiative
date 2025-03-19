package ru.kudashov.rollinitiative.ui.element.button.regular

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ru.kudashov.rollinitiative.ui.element.base.UiKitSize
import ru.kudashov.rollinitiative.ui.theme.UiKitTheme

object RegularButtonSizes {
    val Small = RegularButtonSizeSmall()
    val Medium = RegularButtonSizeBig()
}

interface RegularButtonSize : UiKitSize {
    val size: @Composable () -> Dp
    val roundedCornerShape: @Composable () -> Dp
    val textStyle: @Composable () -> TextStyle
}

data class RegularButtonSizeSmall(
    override val size: @Composable () -> Dp = { 26.dp},
    override val roundedCornerShape: @Composable () -> Dp = { 8.dp },
    override val textStyle: @Composable () -> TextStyle = {
        UiKitTheme.typography.button2
    }
): RegularButtonSize

data class RegularButtonSizeBig(
    override val size: @Composable () -> Dp = { 53.dp },
    override val roundedCornerShape: @Composable () -> Dp = { 15.dp },
    override val textStyle: @Composable () -> TextStyle = {
        UiKitTheme.typography.button
    }
): RegularButtonSize