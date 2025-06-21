package ru.kudashov.rollinitiative.ui.element.badge

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import ru.kudashov.rollinitiative.ui.element.base.UiKitAppearance
import ru.kudashov.rollinitiative.ui.theme.UiKitTheme

/**
 * Варианты оформления [ConditionBadge].
 */
object ConditionBadgeAppearances {

    val Default = ConditionBadgeAppearanceDefault()
}

interface ConditionBadgeAppearance : UiKitAppearance {

    val backgroundColor: @Composable () -> Color
    val backgroundShape: @Composable (ConditionBadgeSize) -> Shape
    val textColor: @Composable () -> Color
    val iconTint: @Composable () -> Color
}

data class ConditionBadgeAppearanceDefault(
    override val backgroundColor: @Composable () -> Color = {
        UiKitTheme.colors.primary
    },
    override val backgroundShape: @Composable (ConditionBadgeSize) -> Shape = { size ->
        RoundedCornerShape(size.cornerRadius())
    },
    override val textColor: @Composable () -> Color = {
        UiKitTheme.colors.textColorPrimary
    },
    override val iconTint: @Composable () -> Color = {
        UiKitTheme.colors.textColorPrimary
    },
) : ConditionBadgeAppearance
