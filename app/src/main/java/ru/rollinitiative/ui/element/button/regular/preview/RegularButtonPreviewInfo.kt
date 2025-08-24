package ru.rollinitiative.ui.element.button.regular.preview

import ru.rollinitiative.ui.element.button.regular.RegularButtonAppearance
import ru.rollinitiative.ui.element.button.regular.RegularButtonSize

internal data class RegularButtonPreviewInfo(
    val useDarkMode: Boolean,
    val size: RegularButtonSize,
    val isEnabled: Boolean = true,
    val appearance: RegularButtonAppearance
)