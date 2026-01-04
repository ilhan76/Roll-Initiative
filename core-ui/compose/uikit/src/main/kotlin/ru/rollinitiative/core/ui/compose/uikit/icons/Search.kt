package ru.rollinitiative.core.ui.compose.uikit.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ru.rollinitiative.core.ui.compose.uikit.theme.UiKitIcons
import kotlin.Suppress

val UiKitIcons.Search: ImageVector
    get() {
        if (_Vector != null) {
            return _Vector!!
        }
        _Vector = ImageVector.Builder(
            name = "Vector",
            defaultWidth = 22.dp,
            defaultHeight = 22.dp,
            viewportWidth = 22f,
            viewportHeight = 22f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF40312A)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.112f, 15.129f)
                lineTo(20.75f, 20.75f)
                moveTo(17.5f, 9.375f)
                curveTo(17.5f, 13.862f, 13.862f, 17.5f, 9.375f, 17.5f)
                curveTo(4.888f, 17.5f, 1.25f, 13.862f, 1.25f, 9.375f)
                curveTo(1.25f, 4.888f, 4.888f, 1.25f, 9.375f, 1.25f)
                curveTo(13.862f, 1.25f, 17.5f, 4.888f, 17.5f, 9.375f)
                close()
            }
        }.build()

        return _Vector!!
    }

@Suppress("ObjectPropertyName")
private var _Vector: ImageVector? = null
