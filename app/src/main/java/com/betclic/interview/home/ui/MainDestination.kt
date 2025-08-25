package com.betclic.interview.home.ui

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

fun NavGraphBuilder.mainDestination() {
    composable<MainDestination>{
        MainScreen()
    }
}

@Serializable
object MainDestination