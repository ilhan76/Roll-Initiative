package ru.kudashov.rollinitiative.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ru.kudashov.rollinitiative.ui.theme.UiKitIcon

val UiKitIcon.TextStar: ImageVector by lazy {
    ImageVector.Builder(
        name = "TextStar",
        defaultWidth = 8.dp,
        defaultHeight = 9.dp,
        viewportWidth = 8f,
        viewportHeight = 9f
    ).apply {
        path(fill = SolidColor(Color(0xFFDF3030))) {
            moveTo(3.1101f, 8.2727f)
            lineTo(3.2571f, 5.6839f)
            lineTo(1.0838f, 7.1094f)
            lineTo(0.304f, 5.7543f)
            lineTo(2.6243f, 4.5909f)
            lineTo(0.304f, 3.4276f)
            lineTo(1.0838f, 2.0724f)
            lineTo(3.2571f, 3.4979f)
            lineTo(3.1101f, 0.9091f)
            horizontalLineTo(4.6634f)
            lineTo(4.5227f, 3.4979f)
            lineTo(6.696f, 2.0724f)
            lineTo(7.4759f, 3.4276f)
            lineTo(5.1491f, 4.5909f)
            lineTo(7.4759f, 5.7543f)
            lineTo(6.696f, 7.1094f)
            lineTo(4.5227f, 5.6839f)
            lineTo(4.6634f, 8.2727f)
            horizontalLineTo(3.1101f)
            close()
        }
    }.build()

}
