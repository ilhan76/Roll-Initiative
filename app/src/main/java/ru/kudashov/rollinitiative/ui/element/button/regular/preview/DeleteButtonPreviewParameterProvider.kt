package ru.kudashov.rollinitiative.ui.element.button.regular.preview

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import ru.kudashov.rollinitiative.ui.element.button.regular.ButtonStyleAppearances

internal class DeleteButtonPreviewParameterProvider : PreviewParameterProvider<DeleteButtonPreviewInfo> {
    override val values: Sequence<DeleteButtonPreviewInfo>
        get() {
            return sequence {
                val sizes = listOf(ButtonStyleAppearances.Medium, ButtonStyleAppearances.Small)
                val appearances = listOf(ButtonStyleAppearances.Medium, ButtonStyleAppearances.Small)

                for (size in sizes) {
                    for (appearance in appearances) {
                        yield(
                            DeleteButtonPreviewInfo(
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