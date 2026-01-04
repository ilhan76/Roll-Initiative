package ru.kudashov.rollinitiative.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ru.kudashov.rollinitiative.ui.theme.UiKitIcon

val UiKitIcon.ArrowBack: ImageVector by lazy {
    ImageVector.Builder(
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
}
