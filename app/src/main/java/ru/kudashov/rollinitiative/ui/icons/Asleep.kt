package ru.kudashov.rollinitiative.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ru.kudashov.rollinitiative.ui.theme.UiKitIcons

val UiKitIcons.Asleep: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "asleep",
        defaultWidth = 30.dp,
        defaultHeight = 30.dp,
        viewportWidth = 30f,
        viewportHeight = 30f
    ).apply {
        path(
            stroke = SolidColor(Color(0xFFfae9d5)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(4.375f, 3.75f)
            horizontalLineTo(15.0893f)
            lineTo(4.375f, 15f)
            horizontalLineTo(15.625f)
        }
        path(
            stroke = SolidColor(Color(0xFFfae9d5)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(18.125f, 9.375f)
            horizontalLineTo(25.625f)
            lineTo(18.125f, 18.125f)
            horizontalLineTo(25.625f)
        }
        path(
            stroke = SolidColor(Color(0xFFfae9d5)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(9.375f, 20f)
            horizontalLineTo(15.0297f)
            lineTo(9.375f, 26.25f)
            horizontalLineTo(15.625f)
        }
    }.build()
}
