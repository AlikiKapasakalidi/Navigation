package com.example.navigation

import android.annotation.SuppressLint
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.composableLambda
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun ScaffoldApp(){
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination ="Home"){
        composable(route="Home"){
            MainScreen(navController)
        }
        composable(route="Info"){
            InfoScreen(navController)
        }
        composable(route="Settings"){
            SettingsScreen(navController)
        }
    }

}
