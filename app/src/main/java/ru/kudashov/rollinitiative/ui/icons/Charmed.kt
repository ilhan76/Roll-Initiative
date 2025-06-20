package ru.kudashov.rollinitiative.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ru.kudashov.rollinitiative.ui.theme.UiKitIcons

val UiKitIcons.Charmed: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "charmed",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = SolidColor(Color(0xFFfae9d5))
        ) {
            moveTo(17.5822f, 10.2651f)
            curveTo(16.4196f, 10.2879f, 15.2235f, 11.0849f, 14.8318f, 12.5466f)
            curveTo(12.7061f, 10.421f, 9.52032f, 12.0739f, 10.2029f, 14.9838f)
            curveTo(10.8959f, 17.9371f, 16.0359f, 18.7652f, 16.8973f, 20.2572f)
            curveTo(16.8973f, 18.3744f, 20.7938f, 15.4219f, 20.0725f, 12.3397f)
            curveTo(19.7368f, 10.9061f, 18.6743f, 10.2436f, 17.5822f, 10.2651f)
            close()
            moveTo(22.8867f, 18.0508f)
            curveTo(20.8217f, 18.0936f, 18.8535f, 19.3945f, 18.2175f, 22.1119f)
            curveTo(16.8048f, 28.1487f, 24.4358f, 33.9315f, 24.4358f, 37.6194f)
            curveTo(26.1233f, 34.6969f, 36.1893f, 33.0746f, 37.5462f, 27.2903f)
            curveTo(38.8833f, 21.5907f, 32.6463f, 18.3548f, 28.4825f, 22.5186f)
            curveTo(27.6921f, 19.5688f, 25.2271f, 18.0022f, 22.8868f, 18.0509f)
            lineTo(22.8867f, 18.0508f)
            close()
        }
    }.build()
}
