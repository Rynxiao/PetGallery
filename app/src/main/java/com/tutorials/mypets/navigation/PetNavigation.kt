package com.tutorials.mypets.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.tutorials.mypets.screens.SplashScreen
import com.tutorials.mypets.screens.detail.DetailScreen
import com.tutorials.mypets.screens.home.HomeScreen

@ExperimentalPagerApi
@ExperimentalComposeUiApi
@Composable
fun PetNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = PetScreens.SplashScreen.name) {
        composable(PetScreens.SplashScreen.name) {
            SplashScreen(navController)
        }

        composable(PetScreens.HomeScreen.name) {
            HomeScreen(navController)
        }

        composable("${PetScreens.DetailScreen.name}/{species}") { backStackEntry->
            DetailScreen(navController, backStackEntry.arguments?.getString("species"))
        }
    }
}