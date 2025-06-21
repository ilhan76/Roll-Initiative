package ru.kudashov.rollinitiative.ui.element.button.icon

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import ru.kudashov.rollinitiative.ui.element.base.UiKitSize

/**
 * Размеры [IconButton].
 */
object IconButtonSizes {

    val Tiny = IconButtonSizeTiny()
    val Small = IconButtonSizeSmall()
    val Medium = IconButtonSizeMedium()
}

interface IconButtonSize : UiKitSize {

    val size: @Composable () -> DpSize
    val iconSize: @Composable () -> Dp
    val cornerRadius: @Composable (() -> Dp)
}

data class IconButtonSizeTiny(
    override val size: @Composable () -> DpSize = { DpSize(width = 18.dp, height = 18.dp) },
    override val iconSize: @Composable () -> Dp = { 7.dp },
    override val cornerRadius: @Composable () -> Dp = { 50.dp },
) : IconButtonSize

data class IconButtonSizeSmall(
    override val size: @Composable () -> DpSize = { DpSize(width = 30.dp, height = 30.dp) },
    override val iconSize: @Composable () -> Dp = { 12.dp },
    override val cornerRadius: @Composable () -> Dp = { 50.dp },
) : IconButtonSize

data class IconButtonSizeMedium(
    override val size: @Composable () -> DpSize = { DpSize(width = 44.dp, height = 44.dp) },
    override val iconSize: @Composable () -> Dp = { 30.dp },
    override val cornerRadius: @Composable () -> Dp = { 50.dp },
) : IconButtonSize