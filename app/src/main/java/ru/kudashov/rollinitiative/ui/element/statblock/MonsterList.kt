package ru.kudashov.rollinitiative.ui.element.statblock

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import ru.kudashov.rollinitiative.ui.theme.UiKitTheme

@Composable
fun MonsterList(){
    LazyColumn {
        items(monsters) { monster ->
            MonsterListItem(monster = monster)
        }
    }
}

@Preview
@Composable
fun MonsterListPreview(){
    UiKitTheme(darkTheme = false) {
        MonsterList()
    }
}