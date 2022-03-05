package com.tutorials.mypets.screens.detail

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun DetailScreen(navController: NavController, species: String?) {
    Text(text = "Detail $species")
}