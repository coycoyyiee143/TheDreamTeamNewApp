package com.example.thedreamteamapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.thedreamteamapp.ui.screens.AnilasScreen
import com.example.thedreamteamapp.ui.screens.MainScreen
import com.example.thedreamteamapp.ui.screens.ApuradoScreen
import com.example.thedreamteamapp.ui.screens.AsiloScreen
import com.example.thedreamteamapp.ui.theme.TheDreamTeamAppTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            TheDreamTeamAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    AppNavigation()
                }
            }
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "MainScreen"
    ) {
        composable("MainScreen") {
            MainScreen(navController = navController)
        }

        composable("AnilasScreen") {
            AnilasScreen(navController = navController)
        }
        composable("ApuradoScreen") {
            ApuradoScreen(navController = navController)
        }
        composable("ArcojeresScreen") {
//            ArcojeresScreen(navController = navController)
        }
        composable("AsiScreen") {
//            AsiScreen(navController = navController)
        }
        composable("AsiloScreen") {
            AsiloScreen(navController= navController)
        }
    }
}
