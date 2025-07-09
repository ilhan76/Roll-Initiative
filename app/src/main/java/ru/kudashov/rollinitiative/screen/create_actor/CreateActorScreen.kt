package ru.kudashov.rollinitiative.screen.create_actor

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import ru.kudashov.rollinitiative.screen.create_actor.data.ActorType
import ru.kudashov.rollinitiative.screen.create_actor.data.CreationMode
import ru.kudashov.rollinitiative.ui.icons.ArrowBack
import ru.kudashov.rollinitiative.ui.theme.UiKitTheme
import ru.surfstudio.mvi.vm.compose.renders

@Composable
fun CreateActorScreen(
    modifier: Modifier = Modifier,
    viewModel: CreateActorViewModel = hiltViewModel()
) {
    viewModel renders { state ->
        ScreenContent(
            state = state,
            modifier = modifier,
            onActorModified = {},
            onBackClicked = { emit(CreateActorEvent.Input.OnBackClick) },
            onModeChanged = { emit(CreateActorEvent.Input.OnModeChanged(it)) }
        )
    }
}

@Composable
private fun ScreenContent(
    state: CreateActorState,
    modifier: Modifier = Modifier,
    onActorModified: () -> Unit = {},
    onBackClicked: () -> Unit = {},
    onModeChanged: (CreationMode) -> Unit = {},
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .statusBarsPadding()
            .navigationBarsPadding()
//            .verticalScroll(rememberScrollState())
            .background(color = UiKitTheme.colors.background)
    ) {
        Toolbar(
            mode = state.creationMode,
            onBackClick = onBackClicked,
            onModeChanged = onModeChanged,
        )
//        LazyColumn {
//
//        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Toolbar(
    mode: CreationMode,
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit,
    onModeChanged: (CreationMode) -> Unit,
) {
    val modesTextIds = remember(mode) {
        CreationMode.entries
            .map { it.textId }
            .filter { it != mode.textId }
    }
    var expanded by remember { mutableStateOf(false) }

    Box(
        modifier
            .fillMaxWidth()
            .padding(
                horizontal = UiKitTheme.spacings.xxLarge,
                vertical = UiKitTheme.spacings.xLarge,
            )
    ) {
        Image(
            imageVector = ArrowBack,
            contentDescription = null,
            alignment = Alignment.CenterStart,
            modifier = Modifier.clickable(onClick = onBackClick),
        )

        ExposedDropdownMenuBox(
            expanded = expanded,
            onExpandedChange = { expanded = !expanded },
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .background(
                    color = UiKitTheme.colors.primary,
                    shape = RoundedCornerShape(15.dp)
                )
        ) {
            Text(
                style = UiKitTheme.typography.text12sp,
                text = stringResource(mode.textId),
                color = UiKitTheme.colors.textColorPrimary,
                modifier = Modifier
                    .padding(
                        horizontal = UiKitTheme.spacings.xLarge,
                        vertical = UiKitTheme.spacings.small
                    )
                    .menuAnchor()
                    .clickable { expanded = true }
            )
            ExposedDropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                modesTextIds.forEach { textId ->
                    DropdownMenuItem(
                        text = {
                            Text(
                                text = stringResource(textId),
                                style = UiKitTheme.typography.text12sp,
                                color = UiKitTheme.colors.textColorPrimary,
                                modifier = Modifier
                                    .fillMaxWidth()
                            )
                        },
                        onClick = {
                            onModeChanged(CreationMode.getByValue(textId))
                            expanded = false
                        }
                    )
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xFF6F6059,
    showSystemUi = true
)
@Composable
fun CreateActorScreenViewDark(modifier: Modifier = Modifier) {
    UiKitTheme(darkTheme = true) {
        ScreenContent(
            state = CreateActorState(
                actorType = ActorType.Event
            )
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun CreateActorScreenView(modifier: Modifier = Modifier) {
    UiKitTheme {
        ScreenContent(
            state = CreateActorState(
                actorType = ActorType.Event
            )
        )
    }
}
