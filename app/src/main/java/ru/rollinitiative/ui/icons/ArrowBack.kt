package ru.rollinitiative.ui.icons

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.rollinitiative.ui.theme.UiKitTheme
import kotlin.Suppress

val ArrowBack: ImageVector
    get() {
        if (_Button != null) {
            return _Button!!
        }
        _Button = ImageVector.Builder(
            name = "Button",
            defaultWidth = 44.dp,
            defaultHeight = 44.dp,
            viewportWidth = 44f,
            viewportHeight = 44f
        ).apply {
            path(fill = SolidColor(Color(0xFFFAE9D5))) {
                moveTo(22f, 0f)
                lineTo(22f, 0f)
                arcTo(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 44f, 22f)
                lineTo(44f, 22f)
                arcTo(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 44f)
                lineTo(22f, 44f)
                arcTo(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 22f)
                lineTo(0f, 22f)
                arcTo(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF251007)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.25f, 22f)
                horizontalLineTo(30.75f)
                moveTo(13.25f, 22f)
                lineTo(20.75f, 29.5f)
                moveTo(13.25f, 22f)
                lineTo(20.75f, 14.5f)
            }
        }.build()

        return _Button!!
    }

@Suppress("ObjectPropertyName")
private var _Button: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    UiKitTheme {
        Image(
            imageVector = ArrowBack,
            contentDescription = null,
        )
    }
}
