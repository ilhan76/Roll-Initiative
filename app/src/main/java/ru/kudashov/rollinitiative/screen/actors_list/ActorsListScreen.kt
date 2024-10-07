package ru.kudashov.rollinitiative.screen.actors_list

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import ru.kudashov.rollinitiative.domain.character.CreatureType
import ru.kudashov.rollinitiative.domain.character.getNameResource
import ru.kudashov.rollinitiative.screen.actors_list.data.ActorUi
import ru.kudashov.rollinitiative.ui.element.Search
import ru.kudashov.rollinitiative.ui.theme.UiKitTheme
import ru.surfstudio.mvi.vm.compose.renders

@Composable
fun ActorsListScreen(
    modifier: Modifier = Modifier,
    viewModel: ActorsListViewModel = viewModel(),
) {
    viewModel renders { state ->
        ScreenContent(
            modifier = modifier,
            state = state,
            onItemClick = { emit(ActorsListEvent.OnItemClick) },
            onSearchValueChange = { emit(ActorsListEvent.OnSearchQueryChanged(it)) },
            onCreateItemClick = { emit(ActorsListEvent.OnCreateActorClick) },
        )
    }
}

@Composable
private fun ScreenContent(
    modifier: Modifier = Modifier,
    state: ActorsListState,
    onSearchValueChange: (String) -> Unit = {},
    onItemClick: () -> Unit = {},
    onCreateItemClick: () -> Unit = {},
) {
    Box(
        modifier
            .background(color = UiKitTheme.colors.background)
            .padding(
                horizontal = UiKitTheme.spacings.large,
                vertical = UiKitTheme.spacings.small
            )
    ) {
        Column {
            Search(
                query = state.searchQuery,
                onValueChange = onSearchValueChange,
                modifier = Modifier
            )

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(vertical = UiKitTheme.spacings.large)
            ) {
                items(state.actors) { actorUi ->
                    ActorItem(
                        actorUi = actorUi,
                        onClick = onItemClick,
                    )
                }
            }
        }

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(50.dp)
                .background(
                    UiKitTheme.colors.primary,
                    shape = CircleShape
                )
                .align(Alignment.BottomEnd)
                .clickable(onClick = onCreateItemClick)
        ) {
            Icon(
                modifier = Modifier.size(32.dp),
                imageVector = Icons.Default.Add,
                tint = UiKitTheme.colors.textColorPrimary,
                contentDescription = null
            )
        }
    }
}

@Composable
fun ActorItem(
    modifier: Modifier = Modifier,
    actorUi: ActorUi,
    onClick: () -> Unit = {}
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .background(
                color = UiKitTheme.colors.secondary,
                shape = RoundedCornerShape(10.dp)
            )
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(8.dp)
    ) {
        // todo Заменить на изображение
        Box(
            modifier = Modifier
                .size(45.dp)
                .background(
                    shape = CircleShape,
                    color = UiKitTheme.colors.primary,
                )
        )
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 8.dp, vertical = 4.dp)
        ) {
            Text(
                text = actorUi.name,
                style = UiKitTheme.typography.subtitle2,
                color = UiKitTheme.colors.textColorSecondary
            )
            Text(
                text = stringResource(actorUi.type.getNameResource()),
                style = UiKitTheme.typography.caption1,
                color = UiKitTheme.colors.textColorTertiary
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ActorsListScreenPreview(modifier: Modifier = Modifier) {
    UiKitTheme {
        ScreenContent(
            state = ActorsListState(
                searchQuery = "",
                actors = listOf(
                    ActorUi(0, "Кобольд", CreatureType.Dragon),
                    ActorUi(0, "Кобольд", CreatureType.Dragon),
                    ActorUi(0, "Кобольд", CreatureType.Dragon),
                    ActorUi(0, "Кобольд", CreatureType.Dragon),
                )
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ActorsListScreenPreviewDark(modifier: Modifier = Modifier) {
    UiKitTheme(darkTheme = true) {
        ScreenContent(
            state = ActorsListState(
                searchQuery = "",
                actors = listOf(
                    ActorUi(0, "Кобольд", CreatureType.Dragon),
                    ActorUi(0, "Кобольд", CreatureType.Dragon),
                    ActorUi(0, "Кобольд", CreatureType.Dragon),
                    ActorUi(0, "Кобольд", CreatureType.Dragon),
                )
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ActorItemPreview(modifier: Modifier = Modifier) {
    UiKitTheme {
        Column(
            modifier = Modifier
                .background(UiKitTheme.colors.background)
                .padding(horizontal = 16.dp)
        ) {
            ActorItem(actorUi = ActorUi(0, "Кобольд", CreatureType.Dragon))
            Spacer(Modifier.height(8.dp))
            ActorItem(actorUi = ActorUi(0, "Кобольд", CreatureType.Dragon))
            Spacer(Modifier.height(8.dp))
            ActorItem(actorUi = ActorUi(0, "Кобольд", CreatureType.Dragon))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ActorItemPreviewDark(modifier: Modifier = Modifier) {
    UiKitTheme(darkTheme = true) {
        Column(
            modifier = Modifier
                .background(UiKitTheme.colors.background)
                .padding(horizontal = 16.dp)
        ) {
            ActorItem(actorUi = ActorUi(0, "Кобольд", CreatureType.Dragon))
            Spacer(Modifier.height(8.dp))
            ActorItem(actorUi = ActorUi(0, "Кобольд", CreatureType.Dragon))
            Spacer(Modifier.height(8.dp))
            ActorItem(actorUi = ActorUi(0, "Кобольд", CreatureType.Dragon))
        }
    }
}