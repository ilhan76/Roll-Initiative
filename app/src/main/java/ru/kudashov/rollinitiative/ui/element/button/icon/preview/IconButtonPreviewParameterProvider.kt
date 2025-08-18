package ru.kudashov.rollinitiative.ui.element.button.icon.preview

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import ru.kudashov.rollinitiative.ui.element.button.icon.IconButton
import ru.kudashov.rollinitiative.ui.element.button.icon.IconButtonAppearances
import ru.kudashov.rollinitiative.ui.element.button.icon.IconButtonSizes

/**
 * Генератор параметров для превью [IconButton].
 */
internal class IconButtonPreviewParameterProvider :
    PreviewParameterProvider<IconButtonPreviewInfo> {

    override val values: Sequence<IconButtonPreviewInfo>
        get() {
            return sequence {
                val appearances = listOf(IconButtonAppearances.Back, IconButtonAppearances.AddSmall)
                val sizes = listOf(IconButtonSizes.Small, IconButtonSizes.Medium)

                for (appearance in appearances) {
                    for (size in sizes) {
                        yield(
                            IconButtonPreviewInfo(
                                useDarkMode = true,
                                appearance = appearance,
                                size = size
                            )
                        )
                        yield(
                            IconButtonPreviewInfo(
                                useDarkMode = true,
                                appearance = appearance,
                                size = size
                            )
                        )
                    }
                }
            }
        }
}