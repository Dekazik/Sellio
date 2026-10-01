package com.example.sellio.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.sellio.ui.screens.HomeScreen
import com.example.sellio.ui.screens.LikedPostsScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ){
        composable(Screen.Home.route){
            HomeScreen(navController)
        }
        composable(Screen.Liked.route){
            LikedPostsScreen(navController)
        }
    }
}