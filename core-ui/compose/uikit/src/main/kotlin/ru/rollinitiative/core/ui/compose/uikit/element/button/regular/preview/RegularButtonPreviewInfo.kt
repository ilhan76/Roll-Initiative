package ru.rollinitiative.core.ui.compose.uikit.element.button.regular.preview

import ru.rollinitiative.core.ui.compose.uikit.element.button.regular.RegularButtonAppearance
import ru.rollinitiative.core.ui.compose.uikit.element.button.regular.RegularButtonSize

internal data class RegularButtonPreviewInfo(
    val useDarkMode: Boolean,
    val size: RegularButtonSize,
    val isEnabled: Boolean = true,
    val appearance: RegularButtonAppearance
)