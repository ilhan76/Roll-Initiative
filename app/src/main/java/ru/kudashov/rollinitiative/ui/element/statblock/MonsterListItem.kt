package ru.kudashov.rollinitiative.ui.element.statblock

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

@Composable
fun MonsterListItem(
    modifier: Modifier = Modifier,
    imageUrl: String? = null,
    fallbackImage: ImageVector = AvatarDefault,
    titleText: String,
    subtitleText: String
) {
    val fallbackPainter = rememberVectorPainter(image = fallbackImage)
    Box(
        modifier = modifier
            .padding(8.dp)
            .background(
                color = UiKitTheme.colors.primary,
                shape = RoundedCornerShape(15.dp)
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
                placeholder = fallbackPainter,
                contentScale = ContentScale.Crop
            )

            Column {
                Text(
                    text = titleText,
                    style = UiKitTheme.typography.subtitle2,
                    color = UiKitTheme.colors.textColorPrimary
                )
                Text(
                    text = subtitleText,
                    style = UiKitTheme.typography.subtitle1,
                    color = UiKitTheme.colors.textColorPrimaryWithAlpha
                )
            }
        }
    }
}

@Preview
@Composable
fun MonsterListItemPreview(){
    UiKitTheme(darkTheme = false) {
        MonsterListItem(
            imageUrl = null,
            fallbackImage = AvatarDefault,
            titleText = "title",
            subtitleText = "subtitle"
        )

    }
}