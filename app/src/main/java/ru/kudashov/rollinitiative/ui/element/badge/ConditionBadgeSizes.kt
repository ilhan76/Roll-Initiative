package ru.kudashov.rollinitiative.ui.element.badge

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ru.kudashov.rollinitiative.ui.element.base.UiKitSize

/**
 * Размеры [ConditionBadge].
 */
object ConditionBadgeSizes {

    val Medium = ConditionBadgeSizeMedium()
}

interface ConditionBadgeSize : UiKitSize {

    val height: @Composable () -> Dp
    val cornerRadius: @Composable () -> Dp
    val horizontalPadding: @Composable () -> Dp
    val iconSize: @Composable () -> Dp
    val spaceBetweenIconAndText: @Composable () -> Dp
}

data class ConditionBadgeSizeMedium(
    override val height: @Composable () -> Dp = { 30.dp },
    override val cornerRadius: @Composable () -> Dp = { 15.dp },
    override val horizontalPadding: @Composable () -> Dp = { 12.dp },
    override val iconSize: @Composable () -> Dp = { 18.dp },
    override val spaceBetweenIconAndText: @Composable () -> Dp = { 10.dp },
) : ConditionBadgeSize