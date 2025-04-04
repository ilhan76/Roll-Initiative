package ru.kudashov.rollinitiative.ui.element.statblock

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import ru.kudashov.rollinitiative.ui.theme.UiKitTheme

@Composable
fun MonsterListItem(monster: Monster, modifier: Modifier = Modifier){
    Card(
       modifier = modifier.padding(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(containerColor = UiKitTheme.colors.primary)
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = monster.imageUrl,
                contentDescription = null,
                tint = Color.Unspecified,
                modifier = Modifier.size(32.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = monster.titleText,
                    style = UiKitTheme.typography.subtitle2,
                    color = UiKitTheme.colors.textColorPrimary
                )
                Text(
                    text = monster.subtitleText,
                    style = UiKitTheme.typography.subtitle1,
                    color = UiKitTheme.colors.textColorPrimaryWithAlpha
                )
            }
        }
    }
}