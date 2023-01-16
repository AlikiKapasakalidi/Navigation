package com.example.navigation

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.*
import androidx.navigation.NavController

@Composable
fun MainTopBar(title:String, navController: NavController){
    var expanded by remember {mutableStateOf(false)}
    TopAppBar(
        title={ Text(title) },
        actions = { IconButton(onClick = {
            expanded = !expanded
        }) {
            Icon(Icons.Filled.MoreVert, contentDescription = null)
        }
        DropdownMenu(expanded = expanded,
            onDismissRequest = { expanded = false }) {
            DropdownMenuItem(onClick = { navController.navigate("Info")}) {
                Text(text = "Info")
            }
            DropdownMenuItem(onClick = { navController.navigate("Settings") }) {
                Text(text = "Settings")
            }
        }
        }
    )
}