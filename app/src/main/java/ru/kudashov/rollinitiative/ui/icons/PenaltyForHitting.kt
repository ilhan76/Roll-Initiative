package ru.kudashov.rollinitiative.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ru.kudashov.rollinitiative.ui.theme.UiKitIcons

val UiKitIcons.PenaltyForHitting: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "penalty_for_hitting",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = SolidColor(Color(0xFF3E3530))
        ) {
            moveTo(0f, 24f)
            arcTo(24f, 24f, 0f, true, true, 48f, 24f)
            arcTo(24f, 24f, 0f, true, true, 0f, 24f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFfae9d5))
        ) {
            moveTo(26.8f, 10.4f)
            curveTo(27.2f, 11.4667f, 27.2f, 12.6667f, 26.8f, 13.7333f)
            lineTo(35.8667f, 18.2667f)
            curveTo(36.6f, 18.6667f, 37.0667f, 19.6f, 36.8f, 20.5333f)
            curveTo(36.5333f, 21.3333f, 35.8667f, 21.8667f, 35.0667f, 21.8667f)
            horizontalLineTo(34.4f)
            curveTo(33.8667f, 21.8667f, 33.3333f, 21.7333f, 32.8f, 21.6f)
            lineTo(26.1333f, 19.7333f)
            curveTo(25.3333f, 21.4667f, 23.6f, 22.6667f, 21.7333f, 22.6667f)
            curveTo(19.6f, 22.6667f, 17.8667f, 21.0667f, 17.4667f, 18.9333f)
            lineTo(12f, 21.0667f)
            curveTo(11.0667f, 21.4667f, 10f, 21.0667f, 9.6f, 20.1333f)
            curveTo(9.2f, 19.2f, 9.6f, 18.1333f, 10.5333f, 17.7333f)
            lineTo(16.5333f, 15.2f)
            curveTo(17.0667f, 13.0667f, 19.2f, 11.4667f, 21.7333f, 11.4667f)
            curveTo(23.6f, 11.4667f, 25.3333f, 12.6667f, 26.1333f, 14.4f)
            lineTo(32.8f, 12.5333f)
            curveTo(33.3333f, 12.4f, 33.8667f, 12.2667f, 34.4f, 12.2667f)
            horizontalLineTo(35.0667f)
            curveTo(35.8667f, 12.2667f, 36.5333f, 12.8f, 36.8f, 13.6f)
            curveTo(37.0667f, 14.5333f, 36.6f, 15.4667f, 35.8667f, 15.8667f)
            lineTo(26.8f, 20.4f)
            curveTo(27.2f, 21.4667f, 27.2f, 22.6667f, 26.8f, 23.7333f)
            curveTo(26.4f, 24.8f, 25.4667f, 25.6f, 24.4f, 25.6f)
            curveTo(23.3333f, 25.6f, 22.4f, 24.8f, 22f, 23.7333f)
            curveTo(21.8f, 22.6667f, 21.8f, 21.4667f, 22f, 20.4f)
            lineTo(13.0667f, 15.8667f)
            curveTo(12.2667f, 15.4667f, 11.8667f, 14.5333f, 12.1333f, 13.6f)
            curveTo(12.4f, 12.8f, 13.0667f, 12.2667f, 13.8667f, 12.2667f)
            horizontalLineTo(14.5333f)
            curveTo(15.0667f, 12.2667f, 15.6f, 12.4f, 16.1333f, 12.5333f)
            lineTo(22.8f, 14.4f)
            curveTo(23.6f, 12.6667f, 25.3333f, 11.4667f, 27.2f, 11.4667f)
            curveTo(29.3333f, 11.4667f, 31.0667f, 13.0667f, 31.4667f, 15.2f)
            lineTo(36.9333f, 13.0667f)
            curveTo(37.8667f, 12.6667f, 38.9333f, 13.0667f, 39.3333f, 14f)
            curveTo(39.7333f, 14.9333f, 39.3333f, 16f, 38.4f, 16.4f)
            lineTo(32.4f, 18.9333f)
            curveTo(31.8667f, 21.0667f, 29.7333f, 22.6667f, 27.2f, 22.6667f)
            curveTo(25.3333f, 22.6667f, 23.6f, 21.4667f, 22.8f, 19.7333f)
            lineTo(16.1333f, 21.6f)
            curveTo(15.6f, 21.7333f, 15.0667f, 21.8667f, 14.5333f, 21.8667f)
            horizontalLineTo(13.8667f)
            curveTo(13.0667f, 21.8667f, 12.4f, 21.3333f, 12.1333f, 20.5333f)
            curveTo(11.8667f, 19.6f, 12.2667f, 18.6667f, 13.0667f, 18.2667f)
            lineTo(22f, 13.7333f)
            curveTo(21.8f, 12.6667f, 21.8f, 11.4667f, 22f, 10.4f)
            curveTo(22.4f, 9.33333f, 23.3333f, 8.53333f, 24.4f, 8.53333f)
            curveTo(25.4667f, 8.53333f, 26.4f, 9.33333f, 26.8f, 10.4f)
            close()
            moveTo(24.4f, 14.9333f)
            curveTo(24.6667f, 14.9333f, 24.9333f, 15.0667f, 25.0667f, 15.3333f)
            curveTo(25.2f, 15.6f, 25.0667f, 15.8667f, 24.8f, 16f)
            lineTo(22.9333f, 17.0667f)
            curveTo(22.6667f, 17.2f, 22.4f, 17.0667f, 22.2667f, 16.8f)
            curveTo(22.1333f, 16.5333f, 22.2667f, 16.2667f, 22.5333f, 16.1333f)
            lineTo(24.4f, 15.0667f)
            close()
            moveTo(25.4667f, 17.2f)
            curveTo(25.3333f, 16.9333f, 25.4667f, 16.6667f, 25.7333f, 16.5333f)
            lineTo(27.6f, 15.4667f)
            curveTo(27.8667f, 15.3333f, 28.1333f, 15.4667f, 28.2667f, 15.7333f)
            curveTo(28.4f, 16f, 28.2667f, 16.2667f, 28f, 16.4f)
            lineTo(26.1333f, 17.4667f)
            curveTo(25.8667f, 17.6f, 25.6f, 17.4667f, 25.4667f, 17.2f)
            close()
            moveTo(24.4f, 19.0667f)
            curveTo(24.6667f, 19.0667f, 24.9333f, 19.2f, 25.0667f, 19.4667f)
            curveTo(25.2f, 19.7333f, 25.0667f, 20f, 24.8f, 20.1333f)
            lineTo(22.9333f, 21.2f)
            curveTo(22.6667f, 21.3333f, 22.4f, 21.2f, 22.2667f, 20.9333f)
            curveTo(22.1333f, 20.6667f, 22.2667f, 20.4f, 22.5333f, 20.2667f)
            lineTo(24.4f, 19.2f)
            close()
        }
    }.build()
}
