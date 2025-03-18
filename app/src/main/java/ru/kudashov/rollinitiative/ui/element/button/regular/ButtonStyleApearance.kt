package ru.kudashov.rollinitiative.ui.element.button.regular

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import ru.kudashov.rollinitiative.ui.element.base.UiKitAppearance
import ru.kudashov.rollinitiative.ui.element.base.UiKitSize
import ru.kudashov.rollinitiative.ui.theme.UiKitTheme

object ButtonStyleAppearances{
    val Small = ButtonSizeSmall()
    val Medium = ButtonSizeMedium()
}

interface IntButtonSize : UiKitSize, IntButtonAppearance {
    val size: @Composable () -> DpSize
    val  roundedCornerShape: @Composable () -> Dp
}

interface IntButtonAppearance : UiKitAppearance {
    val backgroundColor: @Composable (isPressed: Boolean) -> Color
}

data class ButtonSizeSmall(
    override val backgroundColor: @Composable (isPressed: Boolean) -> Color = { isPressed ->
        when {
            isPressed -> UiKitTheme.colors.primary
            else -> UiKitTheme.colors.primary.copy(alpha = 0.8f)
        }
    },
    override val size: @Composable () -> DpSize = { DpSize(width = 135.dp, height = 28.dp)},
    override val roundedCornerShape: @Composable () -> Dp = { 8.dp },
) : IntButtonSize, IntButtonAppearance

data class ButtonSizeMedium(
    override val backgroundColor: @Composable (isPressed: Boolean) -> Color = { isPressed ->
        when {
            isPressed -> UiKitTheme.colors.primary
            else -> UiKitTheme.colors.primary.copy(alpha = 0.8f)
        }
    },
    override val size: @Composable () -> DpSize = { DpSize(width = 270.dp, height = 56.dp) },
    override val roundedCornerShape: @Composable () -> Dp = { 16.dp },
) : IntButtonSize, IntButtonAppearance