package com.tutorials.mypets.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.tutorials.mypets.R
import com.tutorials.mypets.model.Category
import com.tutorials.mypets.ui.theme.fonts

@Composable
fun IconButtonGroup(
    selectedCategoryState: MutableState<Category>,
    onClick: (selectedCategory: Category) -> Unit
) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        listOf("Cats", "Dogs").forEachIndexed { index, label ->
            val painterResourceId = if (index == 0) R.drawable.ic_cat else R.drawable.ic_dog

            IconButtonItem(
                label = label,
                icon = { color ->
                    Icon(
                        painter = painterResource(id = painterResourceId),
                        tint = color,
                        contentDescription = "icon",
                        modifier = Modifier.size(40.dp),
                    )
                },
                category = if (index == 0) Category.CAT else Category.DOG,
                state = selectedCategoryState
            ) {
                Log.d("IconButtonGroup", "IconButtonGroup: selectedIndex $it")
                onClick(it)
            }
        }
    }
}

@Composable
fun IconButtonItem(
    label: String,
    icon: @Composable ((color: Color) -> Unit),
    category: Category,
    state: MutableState<Category>,
    onClick: (selectedCategory: Category) -> Unit
) {
    val isSelected = remember(state.value) {
        category == state.value
    }
    val inactiveBgColor = if (isSelected) Color.White else Color.LightGray.copy(alpha = 0.2f)
    val inactiveTextColor = if (isSelected) Color.Black else Color.DarkGray.copy(alpha = 0.7f)
    val iconColor = if (isSelected) MaterialTheme.colors.primary else Color.LightGray

    Card(
        modifier = Modifier
            .padding(top = 5.dp, bottom = 5.dp, end = 20.dp)
            .size(80.dp)
            .clickable { onClick(category) },
        elevation = if (isSelected) 10.dp else 0.dp
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.background(inactiveBgColor)
        ) {
            icon(iconColor)
            Text(text = label, fontFamily = fonts, color = inactiveTextColor)
        }
    }
}