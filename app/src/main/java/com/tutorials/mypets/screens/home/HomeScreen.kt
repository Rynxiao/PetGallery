package com.tutorials.mypets.screens.home

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Pets
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.tutorials.mypets.components.IconButtonGroup
import com.tutorials.mypets.components.ListCard
import com.tutorials.mypets.components.SearchInput
import com.tutorials.mypets.data.pets
import com.tutorials.mypets.model.Category
import com.tutorials.mypets.model.Pet
import com.tutorials.mypets.ui.theme.fonts

@ExperimentalComposeUiApi
@Composable
fun HomeScreen(navController: NavController) {
    HomeContent()
}

@ExperimentalComposeUiApi
@Preview
@Composable
fun HomeContent() {
    val textState = remember { mutableStateOf("") }
    val selectedCategoryState = remember { mutableStateOf(Category.CAT) }
    val petList = pets.filter { pet -> selectedCategoryState.value == pet.species.category }

    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
            .padding(20.dp)
    ) {
        Icon(
            imageVector = Icons.Filled.Pets,
            contentDescription = "claw icon",
            tint = MaterialTheme.colors.primary,
            modifier = Modifier
                .size(48.dp)
                .padding(bottom = 4.dp)
        )
        Text(
            text = "Find your next \nbest Friend",
            color = MaterialTheme.colors.onSecondary,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = fonts,
        )
        SearchInput(textState = textState) {
            Log.d("SearchInput", "HomeContent: ${textState.value}")
            textState.value = it
        }
        IconButtonGroup(selectedCategoryState = selectedCategoryState) {
            selectedCategoryState.value = it
        }
        List(petList)
    }
}

@Composable
fun List(items: List<Pet> = pets) {
    LazyRow {
        this.items(items = items) { pet ->
            ListCard(
                modifier = Modifier.size(width = 200.dp, height = 125.dp).padding(end = 20.dp),
                pet = pet
            ) {}
        }
    }
}