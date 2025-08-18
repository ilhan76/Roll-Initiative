package ru.kudashov.rollinitiative.ui.element.button.icon.preview

import ru.kudashov.rollinitiative.ui.element.button.icon.IconButton
import ru.kudashov.rollinitiative.ui.element.button.icon.IconButtonAppearance
import ru.kudashov.rollinitiative.ui.element.button.icon.IconButtonSize

/**
 * Информация для превью [IconButton].
 */
internal data class IconButtonPreviewInfo(
    val useDarkMode: Boolean,
    val appearance: IconButtonAppearance,
    val size: IconButtonSize,
    val isEnabled: Boolean = true,
)