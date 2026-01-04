package ru.kudashov.rollinitiative.ui.element

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.kudashov.rollinitiative.ui.icons.Search
import ru.kudashov.rollinitiative.ui.theme.UiKitIcon
import ru.kudashov.rollinitiative.ui.theme.UiKitTheme

@Composable
fun Search(
    modifier: Modifier = Modifier,
    query: String,
    onValueChange: (String) -> Unit
) {
    OutlinedTextField(
        value = query,
        onValueChange = onValueChange,
        textStyle = UiKitTheme.typography.subtitle1,
        colors = OutlinedTextFieldDefaults.colors().copy(
            focusedTextColor = UiKitTheme.colors.textColorPrimary,
            unfocusedTextColor = UiKitTheme.colors.textColorPrimary,
            focusedContainerColor = UiKitTheme.colors.primary,
            unfocusedContainerColor = UiKitTheme.colors.primary,
            unfocusedIndicatorColor = UiKitTheme.colors.primary,
            focusedIndicatorColor = UiKitTheme.colors.primary,
        ),
        singleLine = true,
        leadingIcon = {
            Icon(
                imageVector = UiKitIcon.Search,
                tint = UiKitTheme.colors.textColorPrimaryWithAlpha,
                contentDescription = null,
                modifier = Modifier.padding(start = UiKitTheme.spacings.medium)
            )
        },
        placeholder = {
            Text(
                text = "Let's find some beast",
                style = UiKitTheme.typography.subtitle1,
                color = UiKitTheme.colors.textColorPrimaryWithAlpha
            )
        },
        shape = RoundedCornerShape(15.dp),
        modifier = modifier
            .fillMaxWidth()
            .height(54.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun SearchPreview(modifier: Modifier = Modifier) {
    UiKitTheme {
        Column(
            modifier
                .background(color = UiKitTheme.colors.background)
                .padding(8.dp)
        ) {
            Search(query = "qwe") { }
            Spacer(modifier.height(10.dp))
            Search(query = "") { }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SearchPreviewDark(modifier: Modifier = Modifier) {
    UiKitTheme(darkTheme = true) {
        Column(
            modifier
                .background(color = UiKitTheme.colors.background)
                .padding(8.dp)
        ) {
            Search(query = "qwe") { }
            Spacer(modifier.height(10.dp))
            Search(query = "") { }
        }
    }
}