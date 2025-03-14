package ru.kudashov.rollinitiative.ui.element.button.icon

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import ru.kudashov.rollinitiative.ui.element.base.UiKitAppearance
import ru.kudashov.rollinitiative.ui.icons.AddSmall
import ru.kudashov.rollinitiative.ui.icons.ArrowBack
import ru.kudashov.rollinitiative.ui.theme.UiKitIcons
import ru.kudashov.rollinitiative.ui.theme.UiKitTheme

/**
 * Варианты оформления [IconButton].
 */
object IconButtonAppearances {

    val Back = IconButtonAppearanceRegular(
        icon = { UiKitIcons.ArrowBack }
    )
    val AddSmall = IconButtonAppearanceRegular(
        icon = { UiKitIcons.AddSmall }
    )
}

interface IconButtonAppearance : UiKitAppearance {

    val backgroundColor: @Composable (isPressed: Boolean) -> Color
    val backgroundShape: @Composable (IconButtonSize) -> Shape
    val icon: @Composable () -> ImageVector
}

data class IconButtonAppearanceRegular(
    override val backgroundColor: @Composable (isPressed: Boolean) -> Color = { isPressed ->
        when {
            isPressed -> UiKitTheme.colors.primary
            else -> UiKitTheme.colors.primary.copy(alpha = 0.8f)
        }
    },
    override val backgroundShape: @Composable (
        IconButtonSize,
    ) -> Shape = { size -> RoundedCornerShape(size.cornerRadius()) },
    override val icon: @Composable () -> ImageVector,
) : IconButtonAppearance