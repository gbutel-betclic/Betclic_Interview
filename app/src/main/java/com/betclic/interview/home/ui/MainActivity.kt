package com.betclic.interview.home.ui

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme(
                colors = if (isSystemInDarkTheme()) darkColors() else lightColors()
            ) {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = { Text("France national team") },
                            backgroundColor = MaterialTheme.colors.primary
                        )
                    }
                ) {
                    // If you want to use activity/intent navigation
                    /*MainScreen()*/
                    // If you want to use compose navigation
                    MainNavigation()
                }
            }
        }
    }

    @Composable
    fun MainNavigation() {
        val navController = rememberNavController()

        NavHost(
            navController = navController,
            startDestination = MainDestination,
        ) {
            mainDestination()
        }
    }
}