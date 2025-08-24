package ru.rollinitiative.core.ui.compose.uikit.element.button.regular

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import ru.rollinitiative.core.ui.compose.uikit.element.base.UiKitAppearance
import ru.rollinitiative.core.ui.compose.uikit.theme.UiKitTheme

object RegularButtonAppearances{
    val Primary = RegularButtonAppearancePrimary()
}

interface RegularButtonAppearance : UiKitAppearance {
    val backgroundColor: @Composable (isPressed: Boolean) -> Color
}

data class RegularButtonAppearancePrimary(
    override val backgroundColor: @Composable (isPressed: Boolean) -> Color = { isPressed ->
        when {
            isPressed -> UiKitTheme.colors.primary
            else -> UiKitTheme.colors.primary.copy(alpha = 0.8f)
        }
    }
) : RegularButtonAppearance