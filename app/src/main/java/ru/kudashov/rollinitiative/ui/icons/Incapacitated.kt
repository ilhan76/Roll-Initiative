package ru.kudashov.rollinitiative.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ru.kudashov.rollinitiative.ui.theme.UiKitIcons

val UiKitIcons.Incapacitated: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Incapacitated",
        defaultWidth = 30.dp,
        defaultHeight = 30.dp,
        viewportWidth = 30f,
        viewportHeight = 30f
    ).apply {
        path(fill = SolidColor(Color(0xFFFAE9D5))) {
            moveTo(17.352f, 1.443f)
            lineTo(18.989f, 10.807f)
            lineTo(16.08f, 9.861f)
            lineTo(17.58f, 16.165f)
            lineTo(10.173f, 6.814f)
            lineTo(14.28f, 7.838f)
            lineTo(11.208f, 2.896f)
            curveTo(10.401f, 3.521f, 9.658f, 4.312f, 9.001f, 5.242f)
            curveTo(7.235f, 7.743f, 6.12f, 11.243f, 6.12f, 15.119f)
            curveTo(6.12f, 18.995f, 7.235f, 22.495f, 9.001f, 24.996f)
            curveTo(10.768f, 27.498f, 13.151f, 28.987f, 15.753f, 28.987f)
            curveTo(18.355f, 28.987f, 20.738f, 27.498f, 22.504f, 24.996f)
            curveTo(24.271f, 22.495f, 25.386f, 18.995f, 25.386f, 15.119f)
            curveTo(25.386f, 11.243f, 24.271f, 7.743f, 22.504f, 5.242f)
            curveTo(21.107f, 3.264f, 19.324f, 1.919f, 17.352f, 1.443f)
            lineTo(17.352f, 1.443f)
            close()
            moveTo(10.154f, 15.959f)
            curveTo(11.643f, 15.977f, 13.256f, 16.724f, 13.866f, 18.118f)
            curveTo(12.762f, 19.534f, 8.302f, 19.415f, 7.715f, 16.875f)
            curveTo(8.24f, 16.277f, 9.094f, 15.978f, 10.011f, 15.96f)
            curveTo(10.058f, 15.959f, 10.106f, 15.958f, 10.154f, 15.959f)
            lineTo(10.154f, 15.959f)
            close()
            moveTo(21.359f, 15.959f)
            curveTo(21.407f, 15.959f, 21.455f, 15.959f, 21.503f, 15.96f)
            curveTo(22.419f, 15.978f, 23.274f, 16.277f, 23.799f, 16.875f)
            curveTo(23.212f, 19.415f, 18.751f, 19.534f, 17.647f, 18.118f)
            curveTo(18.257f, 16.724f, 19.871f, 15.977f, 21.359f, 15.959f)
            verticalLineTo(15.959f)
            close()
            moveTo(15.593f, 21.388f)
            curveTo(15.687f, 21.389f, 15.781f, 21.391f, 15.875f, 21.394f)
            curveTo(18.329f, 21.477f, 22.407f, 22.155f, 21.145f, 25.158f)
            curveTo(20.466f, 23.959f, 18.367f, 23.071f, 15.875f, 23.071f)
            curveTo(13.384f, 23.071f, 11.324f, 23.964f, 10.64f, 25.158f)
            curveTo(9.9f, 22.423f, 12.677f, 21.359f, 15.593f, 21.388f)
            horizontalLineTo(15.593f)
            close()
        }
    }.build()
}
