package ru.kudashov.rollinitiative.ui.element.button.regular.preview

import ru.kudashov.rollinitiative.ui.element.button.regular.RegularButtonAppearance
import ru.kudashov.rollinitiative.ui.element.button.regular.RegularButtonSize

internal data class RegularButtonPreviewInfo(
    val useDarkMode: Boolean,
    val size: RegularButtonSize,
    val isEnabled: Boolean = true,
    val appearance: RegularButtonAppearance
)