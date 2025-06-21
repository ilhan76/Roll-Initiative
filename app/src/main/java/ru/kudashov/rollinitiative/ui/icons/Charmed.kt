package ru.kudashov.rollinitiative.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ru.kudashov.rollinitiative.ui.theme.UiKitIcons

val UiKitIcons.Charmed: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Charmed",
        defaultWidth = 30.dp,
        defaultHeight = 30.dp,
        viewportWidth = 30f,
        viewportHeight = 30f
    ).apply {
        path(fill = SolidColor(Color(0xFFFAE9D5))) {
            moveTo(8.582f, 1.265f)
            curveTo(7.42f, 1.288f, 6.224f, 2.085f, 5.832f, 3.547f)
            curveTo(3.706f, 1.421f, 0.52f, 3.074f, 1.203f, 5.984f)
            curveTo(1.896f, 8.937f, 7.036f, 9.765f, 7.897f, 11.257f)
            curveTo(7.897f, 9.374f, 11.794f, 6.422f, 11.073f, 3.34f)
            curveTo(10.737f, 1.906f, 9.674f, 1.244f, 8.582f, 1.265f)
            close()
            moveTo(13.887f, 9.051f)
            curveTo(11.822f, 9.094f, 9.853f, 10.394f, 9.218f, 13.112f)
            curveTo(7.805f, 19.149f, 15.436f, 24.931f, 15.436f, 28.619f)
            curveTo(17.123f, 25.697f, 27.189f, 24.075f, 28.546f, 18.29f)
            curveTo(29.883f, 12.591f, 23.646f, 9.355f, 19.483f, 13.519f)
            curveTo(18.692f, 10.569f, 16.227f, 9.002f, 13.887f, 9.051f)
            lineTo(13.887f, 9.051f)
            close()
        }
    }.build()
}
