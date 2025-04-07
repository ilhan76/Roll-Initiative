package ru.kudashov.rollinitiative.ui.icons

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.kudashov.rollinitiative.ui.theme.UiKitIcons
import ru.kudashov.rollinitiative.ui.theme.UiKitTheme

val UiKitIcons.AddSmall: ImageVector
    get() {
        if (addSmall != null) {
            return addSmall!!
        }
        addSmall = ImageVector.Builder(
            name = "Vector",
            defaultWidth = 14.dp,
            defaultHeight = 14.dp,
            viewportWidth = 14f,
            viewportHeight = 14f
        ).apply {
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF6F6059)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(1f, 7f)
                horizontalLineTo(13f)
                moveTo(7f, 1f)
                verticalLineTo(13f)
            }
        }.build()
        return addSmall!!
    }

private var addSmall: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    UiKitTheme {
        Image(
            imageVector = UiKitIcons.AddSmall,
            contentDescription = null
        )
    }
}
