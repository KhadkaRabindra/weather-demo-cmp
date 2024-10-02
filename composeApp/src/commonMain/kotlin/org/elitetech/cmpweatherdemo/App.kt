package org.elitetech.cmpweatherdemo

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.elitetech.cmpweatherdemo.ui.forecast.ForecastScreen
import org.elitetech.cmpweatherdemo.ui.home.HomeScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = "home") {
            composable("home") {
                HomeScreen(navController)
            }
            composable("forecast") {
                ForecastScreen(navController)
            }
        }
    }
}