package ru.kudashov.rollinitiative.ui.element.button.icon

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import ru.kudashov.rollinitiative.ui.element.button.icon.preview.IconButtonPreviewInfo
import ru.kudashov.rollinitiative.ui.element.button.icon.preview.IconButtonPreviewParameterProvider
import ru.kudashov.rollinitiative.ui.theme.UiKitTheme

/**
 * Кнопка с иконкой
 */
@Composable
fun IconButton(
    modifier: Modifier = Modifier,
    appearance: IconButtonAppearance = IconButtonAppearances.Back,
    size: IconButtonSize = IconButtonSizes.Medium,
    isEnabled: Boolean = true,
    onClick: () -> Unit = {},
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    Box(
        modifier = modifier
            .size(size = size.size())
            .background(
                color = appearance.backgroundColor(isPressed),
                shape = appearance.backgroundShape(size)
            )
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                enabled = isEnabled,
                onClick = onClick
            ),
        contentAlignment = Alignment.Center
    ) {
        Image(
            modifier = Modifier.size(size.iconSize()),
            imageVector = appearance.icon(),
            contentDescription = null
        )
    }
}

@Preview()
@Composable
private fun IconButtonPreview(
    @PreviewParameter(IconButtonPreviewParameterProvider::class) info: IconButtonPreviewInfo,
) {
    UiKitTheme(darkTheme = info.useDarkMode) {
        Box(
            modifier = Modifier
                .background(color = UiKitTheme.colors.background)
                .padding(10.dp),
            contentAlignment = Alignment.Center
        ) {
            IconButton(
                appearance = info.appearance,
                size = info.size,
                isEnabled = info.isEnabled
            )
        }
    }
}