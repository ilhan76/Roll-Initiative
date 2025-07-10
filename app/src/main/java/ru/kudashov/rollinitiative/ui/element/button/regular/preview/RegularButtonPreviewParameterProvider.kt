package ru.kudashov.rollinitiative.ui.element.button.regular.preview

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import ru.kudashov.rollinitiative.ui.element.button.regular.RegularButtonAppearances
import ru.kudashov.rollinitiative.ui.element.button.regular.RegularButtonSizes

internal class RegularButtonPreviewParameterProvider :
    PreviewParameterProvider<RegularButtonPreviewInfo> {
    override val values: Sequence<RegularButtonPreviewInfo>
        get() {
            return sequence {
                val sizes = listOf(RegularButtonSizes.Medium, RegularButtonSizes.Small)
                val appearances = listOf(RegularButtonAppearances.Primary)

                for (size in sizes) {
                    for (appearance in appearances) {
                        yield(
                            RegularButtonPreviewInfo(
                                size = size,
                                appearance = appearance,
                                useDarkMode = true,
                            )
                        )
                    }
                }
            }
        }
}