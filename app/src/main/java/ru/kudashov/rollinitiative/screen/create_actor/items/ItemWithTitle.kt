package ru.kudashov.rollinitiative.screen.create_actor.items

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import ru.kudashov.rollinitiative.ui.icons.TextStar
import ru.kudashov.rollinitiative.ui.theme.UiKitTheme

@Composable
fun ItemWithTitle(
    title: String,
    content: @Composable ColumnScope.() -> Unit,
    modifier: Modifier = Modifier,
    isObligatory: Boolean = false,
) {
    Column(
        modifier
            .fillMaxWidth()
            .background(UiKitTheme.colors.background)
    ) {
        Row {
            Text(
                text = title,
                style = UiKitTheme.typography.button.copy(fontWeight = FontWeight(600)),
                color = UiKitTheme.colors.textColorSecondary,
            )
            if (isObligatory) {
                Image(
                    imageVector = TextStar,
                    contentDescription = null
                )
            }
        }
        Spacer(Modifier.height(UiKitTheme.spacings.xLarge))
        content()
    }
}

@Composable
@Preview
private fun Preview() {
    UiKitTheme {
        ItemWithTitle(
            title = "Вид",
            isObligatory = true,
            content = {

            }
        )
    }
}

@Composable
@Preview
private fun PreviewDark() {
    UiKitTheme(darkTheme = true) {
        ItemWithTitle(
            title = "Вид",
            isObligatory = true,
            content = {

            }
        )
    }
}