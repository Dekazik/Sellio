package com.example.sellio.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.sellio.ui.navigation.Screen

@Composable
fun LikedPostsScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red),
        contentAlignment = Alignment.Center
    ){
        Box(
            modifier = Modifier
                .height(200.dp)
                .width(400.dp)
                .background(Color.White)
                .clickable(
                    onClick = {
                        navController.navigate(Screen.Home.route)
                    }
                )
        )
    }
}