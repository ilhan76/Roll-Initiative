package ru.kudashov.rollinitiative.ui.element.fightblock

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import ru.kudashov.rollinitiative.ui.theme.UiKitTheme
import java.nio.file.WatchEvent

@Composable
fun FightListItem(
    modifier: Modifier = Modifier,
    imageUrl: String? = null,
    fallbackImage: ImageVector = AvatarDefaultFightblock,
    titleText: String
) {
    val fallbackPainter = rememberVectorPainter(image = fallbackImage)
    Box(
        modifier = modifier
            .padding(
                horizontal = 16.dp,
                vertical = 8.dp
            )
            .background(
                color = UiKitTheme.colors.primary,
                shape = RoundedCornerShape(16.dp)
            )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            AsyncImage(
                model = imageUrl,
                contentDescription = null,
                modifier = Modifier.size(48.dp),
                error = fallbackPainter,
                contentScale = ContentScale.Crop
            )
            Column {
                Text(
                    text = titleText,
                    style = UiKitTheme.typography.subtitle2,
                    color = UiKitTheme.colors.textColorPrimary
                )
            }
        }
    }
}

@Preview
@Composable
fun FightListItemPreview(){
    UiKitTheme(darkTheme = false) {
        FightListItem(
            imageUrl = null,
            fallbackImage = AvatarDefaultFightblock,
            titleText = "Хобгоблин у ворон в башню"
        )
    }
}