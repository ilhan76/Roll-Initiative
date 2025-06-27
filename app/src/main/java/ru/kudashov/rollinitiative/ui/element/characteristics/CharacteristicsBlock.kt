package ru.kudashov.rollinitiative.ui.element.characteristics

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.ui.draw.clip
import ru.kudashov.rollinitiative.ui.theme.UiKitTheme

@Composable
fun StatCell(
    modifier: Modifier = Modifier,
    title: String,
    value: Int,
    bonus: Int?
) {
    val topColor = UiKitTheme.colors.component2()
    val bottomColor = UiKitTheme.colors.component1()
    val cornerShape = RoundedCornerShape(15.dp)

    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(cornerShape)
            .background(bottomColor)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(topColor)
                .padding(vertical = 4.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = title,
                color = UiKitTheme.colors.primary,
                style = UiKitTheme.typography.caption2
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
            contentAlignment = Alignment.Center
        ) {
            val display = if (bonus != null) "$value (+$bonus)" else "$value"
            Text(
                text = display,
                color = UiKitTheme.colors.secondary,
                style = UiKitTheme.typography.subtitle2
            )
        }
    }
}

@Preview
@Composable
fun CharacterStatCellPreview() {
    UiKitTheme(darkTheme = true) {
        StatCell(
            title = "СИЛ",
            value = 1,
            bonus = 1,
            modifier = Modifier
        )
    }
}