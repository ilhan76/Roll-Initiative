package ru.kudashov.rollinitiative.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import ru.kudashov.rollinitiative.ui.theme.component.LocalUiKitColors
import ru.kudashov.rollinitiative.ui.theme.component.LocalUiKitSpacing
import ru.kudashov.rollinitiative.ui.theme.component.LocalUiKitTypography
import ru.kudashov.rollinitiative.ui.theme.component.UiKitColors
import ru.kudashov.rollinitiative.ui.theme.component.UiKitSpacings
import ru.kudashov.rollinitiative.ui.theme.component.UiKitTypography
import ru.kudashov.rollinitiative.ui.theme.component.getUiKitColors
import ru.kudashov.rollinitiative.ui.theme.component.getUiKitColorsDark
import ru.kudashov.rollinitiative.ui.theme.component.getUiKitSpacings
import ru.kudashov.rollinitiative.ui.theme.component.getUiKitTypography

@Composable
fun UiKitTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> getUiKitColorsDark()
        else -> getUiKitColors()
    }

    CompositionLocalProvider(
        LocalUiKitColors provides colorScheme,
        LocalUiKitSpacing provides getUiKitSpacings(),
        LocalUiKitTypography provides getUiKitTypography(),
        content = content
    )
}

object UiKitTheme {

    val colors: UiKitColors
        @Composable
        @ReadOnlyComposable
        get() = requireNotNull(LocalUiKitColors.current)

    val spacings: UiKitSpacings
        @Composable
        @ReadOnlyComposable
        get() = requireNotNull(LocalUiKitSpacing.current)

    val typography: UiKitTypography
        @Composable
        @ReadOnlyComposable
        get() = requireNotNull(LocalUiKitTypography.current)

    private inline fun <reified T : Any> requireNotNull(value: T?): T {
        return requireNotNull(value) {
            "Значение ${T::class.simpleName} должно быть проинициализировано в методе UiKitTheme()!"
        }
    }
}