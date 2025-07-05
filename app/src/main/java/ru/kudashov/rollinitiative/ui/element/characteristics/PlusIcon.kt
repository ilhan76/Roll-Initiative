package ru.kudashov.rollinitiative.ui.element.characteristics

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp



val PlusLarge: ImageVector
    get() {
        if (_PlusLarge != null) {
            return _PlusLarge!!
        }
        _PlusLarge = ImageVector.Builder(
            name = "PlusLarge",
            defaultWidth = 21.dp,
            defaultHeight = 21.dp,
            viewportWidth = 21f,
            viewportHeight = 21f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF5F2015)),
                fillAlpha = 0.7f,
                strokeAlpha = 0.7f
            ) {
                moveTo(5f, 0f)
                lineTo(16f, 0f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                lineTo(21f, 16f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 21f)
                lineTo(5f, 21f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(0f, 5f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 0f)
                close()
            }
            path(
                fillAlpha = 0.7f,
                stroke = SolidColor(Color(0xFFFAE9D5)),
                strokeAlpha = 0.7f,
                strokeLineWidth = 1f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 10.5f)
                horizontalLineTo(15f)
                moveTo(10.5f, 6f)
                verticalLineTo(15f)
            }
        }.build()

        return _PlusLarge!!
    }

@Suppress("ObjectPropertyName")
private var _PlusLarge: ImageVector? = null


