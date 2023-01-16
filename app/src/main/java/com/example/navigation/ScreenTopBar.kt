package com.example.navigation

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.*
import androidx.navigation.NavController


@Composable
fun ScreenTopBar(title:String, navController: NavController){
    var expanded by remember { mutableStateOf(false) }
    TopAppBar(
        title={ Text(title) },
        actions = { IconButton(onClick = {
            expanded = !expanded
        }) {
            IconButton(onClick = { navController.navigateUp() }) {
                Icon(Icons.Filled.ArrowBack, contentDescription = null)
            }
        }})
}
