package ru.kudashov.rollinitiative.ui.element.button.regular

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import ru.kudashov.rollinitiative.R
import ru.kudashov.rollinitiative.ui.theme.UiKitTheme
import ru.kudashov.rollinitiative.ui.element.button.regular.preview.RegularButtonPreviewInfo
import ru.kudashov.rollinitiative.ui.element.button.regular.preview.RegularButtonPreviewParameterProvider

@Composable
fun RegularButton(
    modifier: Modifier = Modifier,
    appearance: RegularButtonAppearance = RegularButtonAppearances.Primary,
    size: RegularButtonSize = RegularButtonSizes.Medium,
    isEnabled: Boolean = true,
    text: String = stringResource(id = R.string.delete_button),
    onClick: () -> Unit,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()
    val cornerRadius = size.roundedCornerShape()
    val textStyle = size.textStyle()
    Box(
        modifier = modifier
            .fillMaxWidth()
            .size(size = size.size())
            .clip(RoundedCornerShape((cornerRadius)))
            .background(
                color = appearance.backgroundColor(isPressed),
            )
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                enabled = isEnabled,
                onClick = onClick
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            style = textStyle,
        )
    }
}



@Preview
@Composable
private fun DeleteButtonPreview(
    @PreviewParameter(RegularButtonPreviewParameterProvider::class) info: RegularButtonPreviewInfo
) {
    UiKitTheme(darkTheme = info.useDarkMode){
        Box(
            modifier = Modifier
                .background(color = UiKitTheme.colors.background)
                .padding(10.dp),
            contentAlignment = Alignment.Center
        ) {
            RegularButton(
                size = info.size,
                isEnabled = info.isEnabled,
                appearance = info.appearance
            ) { }
        }
    }
}
