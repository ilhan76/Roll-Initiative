package ru.kudashov.rollinitiative.ui.element.statblock

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.kudashov.rollinitiative.ui.theme.UiKitTheme

val AvatarDefault: ImageVector
    get() {
        if (_Avatar != null) {
            return _Avatar!!
        }
        _Avatar = ImageVector.Builder(
            name = "Avatar",
            defaultWidth = 48.dp,
            defaultHeight = 48.dp,
            viewportWidth = 48f,
            viewportHeight = 48f
        ).apply {
            path(fill = SolidColor(Color(0xFF3E3530))) {
                moveTo(24f, 0f)
                lineTo(24f, 0f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 24f)
                lineTo(48f, 24f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 48f)
                lineTo(24f, 48f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 24f)
                lineTo(0f, 24f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 0f)
                close()
            }
            group(
                clipPathData = PathData {
                    moveTo(8f, 8f)
                    horizontalLineToRelative(32f)
                    verticalLineToRelative(32f)
                    horizontalLineToRelative(-32f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFFFAE9D5))) {
                    moveTo(32.495f, 36.442f)
                    curveTo(30.864f, 29.367f, 21.358f, 25.829f, 19.131f, 23.258f)
                    curveTo(17.986f, 21.936f, 18.273f, 20.532f, 18.988f, 19.776f)
                    curveTo(19.756f, 18.966f, 21.22f, 18.806f, 22.311f, 19.519f)
                    curveTo(23.267f, 20.14f, 25.125f, 21.865f, 25.542f, 22.501f)
                    curveTo(25.959f, 23.136f, 25.955f, 23.662f, 26.178f, 24.089f)
                    curveTo(26.433f, 24.569f, 27.009f, 24.825f, 27.844f, 24.575f)
                    curveTo(28.617f, 24.345f, 29.044f, 24.039f, 29.044f, 24.039f)
                    curveTo(29.044f, 24.039f, 28.236f, 24.009f, 27.916f, 23.554f)
                    curveTo(27.916f, 23.554f, 26.796f, 21.099f, 26.395f, 20.095f)
                    curveTo(27.679f, 20.436f, 28.493f, 20.83f, 29.063f, 21.189f)
                    curveTo(29.133f, 21.735f, 28.901f, 22.677f, 28.891f, 22.719f)
                    curveTo(28.917f, 22.704f, 29.332f, 22.459f, 29.948f, 21.845f)
                    curveTo(29.979f, 21.871f, 30.01f, 21.895f, 30.039f, 21.919f)
                    curveTo(30.257f, 22.092f, 29.856f, 23.465f, 29.856f, 23.465f)
                    curveTo(29.856f, 23.465f, 30.609f, 22.959f, 31.185f, 22.274f)
                    curveTo(31.684f, 21.685f, 32.103f, 20.937f, 32.103f, 20.937f)
                    curveTo(32.103f, 20.937f, 30.473f, 20.247f, 29.721f, 19.053f)
                    curveTo(28.966f, 17.861f, 29.623f, 16.566f, 29.623f, 16.566f)
                    curveTo(29.623f, 16.566f, 28.365f, 16.163f, 27.312f, 14.644f)
                    curveTo(26.204f, 13.046f, 26.633f, 11.083f, 26.633f, 11.083f)
                    curveTo(25.732f, 11.445f, 24.941f, 13.237f, 24.941f, 13.237f)
                    curveTo(24.941f, 13.237f, 22.666f, 12.022f, 19.709f, 12.4f)
                    curveTo(17.042f, 12.393f, 14.564f, 10.775f, 13.535f, 8.222f)
                    curveTo(13.535f, 8.222f, 12.738f, 11.716f, 15.755f, 13.915f)
                    curveTo(15.591f, 14.026f, 15.428f, 14.143f, 15.264f, 14.268f)
                    curveTo(13.792f, 15.106f, 11.922f, 15.057f, 10.483f, 14.048f)
                    curveTo(10.483f, 14.048f, 10.559f, 14.572f, 10.839f, 15.203f)
                    curveTo(11.12f, 15.831f, 11.604f, 16.567f, 12.42f, 16.991f)
                    curveTo(12.507f, 17.036f, 12.593f, 17.073f, 12.678f, 17.105f)
                    curveTo(12.508f, 17.376f, 12.351f, 17.657f, 12.209f, 17.945f)
                    curveTo(11.406f, 19.294f, 9.792f, 19.975f, 8.246f, 19.572f)
                    curveTo(8.246f, 19.572f, 9.057f, 21.052f, 10.512f, 21.233f)
                    curveTo(10.848f, 21.275f, 11.141f, 21.225f, 11.392f, 21.125f)
                    curveTo(11.38f, 21.738f, 11.41f, 22.311f, 11.479f, 22.855f)
                    curveTo(11.443f, 24.047f, 10.639f, 25.104f, 9.467f, 25.439f)
                    horizontalLineTo(9.466f)
                    curveTo(9.466f, 25.439f, 10.596f, 26.111f, 11.642f, 25.658f)
                    curveTo(11.846f, 25.569f, 12.004f, 25.449f, 12.125f, 25.314f)
                    curveTo(12.985f, 27.389f, 14.543f, 29.063f, 16.529f, 30.972f)
                    curveTo(17.062f, 31.486f, 17.66f, 32.034f, 18.267f, 32.607f)
                    curveTo(24.236f, 32.951f, 28.756f, 35.623f, 32.583f, 39.729f)
                    curveTo(32.704f, 38.838f, 32.793f, 37.733f, 32.495f, 36.442f)
                    close()
                    moveTo(26.204f, 16.629f)
                    lineTo(27.893f, 18.309f)
                    lineTo(25.198f, 17.337f)
                    lineTo(26.204f, 16.629f)
                    close()
                    moveTo(30.277f, 24.406f)
                    curveTo(30.277f, 24.406f, 31.103f, 25.247f, 32.247f, 25.414f)
                    curveTo(32.17f, 25.872f, 32.053f, 26.1f, 32.053f, 26.1f)
                    curveTo(32.053f, 26.1f, 34.017f, 27.682f, 36.423f, 26.663f)
                    curveTo(36.312f, 27.928f, 34.744f, 28.486f, 34.744f, 28.486f)
                    curveTo(34.744f, 28.486f, 36.429f, 30.573f, 39.754f, 29.292f)
                    curveTo(37.95f, 31.64f, 35.257f, 30.986f, 33.619f, 30.147f)
                    curveTo(32.146f, 29.393f, 30.251f, 27.166f, 30.277f, 24.406f)
                    close()
                }
            }
        }.build()

        return _Avatar!!
    }

@Suppress("ObjectPropertyName")
private var _Avatar: ImageVector? = null

@Preview(showBackground = true)
@Composable
fun AvatarPreview(){
    UiKitTheme {
        Icon(
            imageVector = AvatarDefault,
            contentDescription = null,
            modifier = Modifier.size(48.dp),
            tint = Color.Unspecified
        )
    }
}