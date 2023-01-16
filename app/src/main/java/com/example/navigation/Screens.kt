package com.example.navigation

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(navController: NavController){
    Scaffold(
        topBar = { MainTopBar("My App", navController)},
        content = { Text(text = "Content for Home screen") }
    )
}
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun InfoScreen(navController: NavController){
    Scaffold(
        topBar = { ScreenTopBar("Info", navController)},
        content = { Text(text = "Content for Info screen") }
    )
}
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SettingsScreen(navController: NavController){
    Scaffold(
        topBar = { ScreenTopBar("Settings", navController)},
        content = { Text(text = "Content for Settings screen") }
    )
}