package com.tutorials.mypets.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.tutorials.mypets.screens.SplashScreen

@ExperimentalComposeUiApi
@Composable
fun PetNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = PetScreens.SplashScreen.name) {
        composable(PetScreens.SplashScreen.name) {
            SplashScreen(navController = navController)
        }
    }
}