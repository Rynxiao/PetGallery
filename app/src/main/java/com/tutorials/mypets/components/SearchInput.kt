package com.tutorials.mypets.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.outlined.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.unit.dp
import com.tutorials.mypets.ui.theme.fonts

@ExperimentalComposeUiApi
@Composable
fun SearchInput(textState: MutableState<String>, onTextChange: (text: String) -> Unit) {
    val keyboardController = LocalSoftwareKeyboardController.current
    val focusManager = LocalFocusManager.current

    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp, bottom = 20.dp)
            .border(1.dp, color = Color.LightGray, shape = RoundedCornerShape(10.dp)),
        label = null,
        value = textState.value,
        colors = TextFieldDefaults.textFieldColors(
            cursorColor = MaterialTheme.colors.primary,
            disabledLabelColor = MaterialTheme.colors.primary.copy(alpha = 0.8f),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            backgroundColor = Color.Transparent
        ),
        onValueChange = onTextChange,
        shape = RoundedCornerShape(14.dp),
        singleLine = true,
        leadingIcon = {
            Icon(imageVector = Icons.Outlined.Search, contentDescription = "Search Icon")
        },
        placeholder = { Text(text = "Search", fontFamily = fonts, color = Color.LightGray) },
        trailingIcon = {
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Outlined.Phone,
                    contentDescription = null
                )
            }
        },
        keyboardActions = KeyboardActions(onDone = {
            keyboardController?.hide()
            focusManager.clearFocus()
        })
    )
}