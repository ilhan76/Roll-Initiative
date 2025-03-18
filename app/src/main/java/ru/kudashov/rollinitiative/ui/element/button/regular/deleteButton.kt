package ru.kudashov.rollinitiative.ui.element.button.regular

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.kudashov.rollinitiative.ui.theme.UiKitTheme
import ru.kudashov.rollinitiative.ui.element.button.regular.preview.DeleteButtonPreviewInfo
import ru.kudashov.rollinitiative.ui.element.button.regular.preview.DeleteButtonPreviewParameterProvider

@Composable
fun DeleteButton(
    modifier: Modifier = Modifier,
    appearance: IntButtonAppearance,
    size: IntButtonSize = ButtonStyleAppearances.Medium,
    roundedCornerShape: IntButtonSize = ButtonStyleAppearances.Medium,
    isEnabled: Boolean = true,
    onClick: () -> Unit,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()
    Box(
        modifier = modifier
            .size(size = size.size())
            .clip(RoundedCornerShape(roundedCornerShape.roundedCornerShape()))
            .background(
                color = appearance.backgroundColor(isPressed),
            )
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                enabled = isEnabled,
                onClick = onClick
            ),
    ) {
        Text(
            text = "Удалить",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF3E332A)
        )
    }
}



@Preview
@Composable
private fun DeleteButtonPreview(
    @PreviewParameter(DeleteButtonPreviewParameterProvider::class) info: DeleteButtonPreviewInfo
) {
    UiKitTheme(darkTheme = info.useDarkMode){
        Box(
            modifier = Modifier
                .background(color = UiKitTheme.colors.background)
                .padding(10.dp),
            contentAlignment = Alignment.Center
        ) {
            DeleteButton(
                size = info.size,
                isEnabled = info.isEnabled,
                appearance = info.appearance
            ) { }
        }
    }
}
