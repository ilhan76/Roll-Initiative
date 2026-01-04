package ru.kudashov.rollinitiative.screen.create_actor.items

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.kudashov.rollinitiative.R
import ru.kudashov.rollinitiative.ui.theme.UiKitTheme

@Composable
fun AvatarItem(
    modifier: Modifier = Modifier,
    onChooseFromGalleryClick: () -> Unit = {},
    onUploadUrlClick: () -> Unit = {},
) {
    ItemWithTitle(
        title = stringResource(R.string.create_actor_avatar_title_text),
        modifier = modifier,
        content = {
            Row(modifier.fillMaxWidth()) {
                Button(
                    onClick = onChooseFromGalleryClick,
                    shape = RoundedCornerShape(15.dp),
                    colors = ButtonDefaults.buttonColors().copy(
                        containerColor = UiKitTheme.colors.primary
                    ),
                    modifier = Modifier
                        .height(38.dp)
                        .weight(1f)
                ) {
                    Text(
                        text = stringResource(R.string.create_actor_choose_from_gallery_text),
                        style = UiKitTheme.typography.text12sp,
                        color = UiKitTheme.colors.textColorSecondary,
                    )
                }
                Spacer(Modifier.width(6.dp))
                Button(
                    onClick = onUploadUrlClick,
                    shape = RoundedCornerShape(15.dp),
                    colors = ButtonDefaults.buttonColors().copy(
                        containerColor = UiKitTheme.colors.primary
                    ),
                    modifier = Modifier
                        .height(38.dp)
                        .weight(1f)
                ) {
                    Text(
                        text = stringResource(R.string.create_actor_upload_url_text),
                        style = UiKitTheme.typography.text12sp,
                        color = UiKitTheme.colors.textColorSecondary,
                    )
                }
            }
        }
    )
}

@Preview
@Composable
private fun Preview() {
    UiKitTheme {
        AvatarItem()
    }
}

@Preview
@Composable
private fun PreviewDark() {
    UiKitTheme(darkTheme = true) {
        AvatarItem()
    }
}