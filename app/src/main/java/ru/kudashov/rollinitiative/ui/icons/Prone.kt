package ru.kudashov.rollinitiative.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ru.kudashov.rollinitiative.ui.theme.UiKitIcons

val UiKitIcons.Prone: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Prone",
        defaultWidth = 30.dp,
        defaultHeight = 30.dp,
        viewportWidth = 30f,
        viewportHeight = 30f
    ).apply {
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(30f)
                verticalLineToRelative(30f)
                horizontalLineToRelative(-30f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFFFAE9D5))) {
                moveTo(5.865f, 2.892f)
                curveTo(6.323f, 1.272f, 7.858f, 0.357f, 9.313f, 0.867f)
                curveTo(10.768f, 1.362f, 11.589f, 3.072f, 11.145f, 4.692f)
                curveTo(10.7f, 6.312f, 9.151f, 7.227f, 7.697f, 6.732f)
                curveTo(6.255f, 6.237f, 5.42f, 4.527f, 5.865f, 2.892f)
                close()
                moveTo(28.979f, 14.352f)
                lineTo(22.257f, 11.007f)
                curveTo(22.231f, 10.992f, 22.204f, 10.977f, 22.163f, 10.977f)
                curveTo(21.678f, 10.782f, 21.167f, 10.857f, 20.749f, 11.112f)
                lineTo(16.304f, 14.142f)
                lineTo(15.253f, 6.957f)
                lineTo(21.638f, 2.787f)
                curveTo(21.948f, 2.607f, 22.177f, 2.307f, 22.285f, 1.917f)
                curveTo(22.486f, 1.137f, 22.096f, 0.327f, 21.396f, 0.087f)
                curveTo(21.018f, -0.033f, 20.641f, 0.027f, 20.318f, 0.252f)
                lineTo(11.226f, 6.207f)
                curveTo(10.903f, 6.402f, 10.633f, 6.657f, 10.391f, 6.957f)
                lineTo(6.552f, 12.687f)
                lineTo(1.272f, 11.982f)
                curveTo(1.258f, 11.982f, 1.258f, 11.982f, 1.245f, 11.997f)
                curveTo(0.571f, 11.997f, 0.032f, 12.612f, 0.032f, 13.362f)
                curveTo(0.032f, 14.082f, 0.531f, 14.667f, 1.164f, 14.712f)
                curveTo(1.164f, 14.712f, 1.177f, 14.712f, 1.177f, 14.727f)
                lineTo(7.414f, 15.477f)
                curveTo(7.602f, 15.387f, 7.791f, 15.267f, 7.926f, 15.087f)
                lineTo(10.108f, 12.042f)
                lineTo(11.158f, 18.627f)
                curveTo(11.347f, 19.557f, 11.913f, 20.367f, 12.707f, 20.817f)
                lineTo(17.395f, 22.377f)
                lineTo(18.082f, 28.377f)
                curveTo(18.163f, 29.052f, 18.594f, 29.652f, 19.2f, 29.892f)
                curveTo(20.089f, 30.237f, 21.072f, 29.727f, 21.382f, 28.722f)
                curveTo(21.476f, 28.422f, 21.503f, 28.092f, 21.463f, 27.792f)
                lineTo(20.614f, 20.457f)
                curveTo(20.507f, 19.917f, 20.21f, 19.437f, 19.766f, 19.167f)
                lineTo(16.843f, 18.192f)
                lineTo(21.678f, 14.937f)
                lineTo(27.578f, 17.847f)
                curveTo(27.618f, 17.862f, 27.659f, 17.877f, 27.686f, 17.892f)
                curveTo(28.575f, 18.237f, 29.558f, 17.727f, 29.868f, 16.737f)
                curveTo(30.164f, 15.777f, 29.774f, 14.757f, 28.979f, 14.352f)
                close()
            }
        }
    }.build()
}
