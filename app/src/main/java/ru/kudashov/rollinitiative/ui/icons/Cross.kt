package ru.kudashov.rollinitiative.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ru.kudashov.rollinitiative.ui.theme.UiKitIcons

val UiKitIcons.Cross: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "cross",
        defaultWidth = 8.dp,
        defaultHeight = 8.dp,
        viewportWidth = 8f,
        viewportHeight = 8f
    ).apply {
        path(
            stroke = SolidColor(Color(0xFFFAE9D5)),
            strokeLineWidth = 1f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(7.5f, 0.5f)
            lineTo(0.5f, 7.5f)
            moveTo(0.5f, 0.5f)
            lineTo(7.5f, 7.5f)
        }
    }.build()
}
