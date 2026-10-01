package com.example.sellio.ui.navigation

sealed class Screen (val route: String){
    object Login: Screen("login")
    object Register: Screen("register")
    object Home: Screen("home")
    object Liked: Screen("liked")
    object Create: Screen("create")
    object Profile: Screen("profile")
    object Post: Screen("post")
}