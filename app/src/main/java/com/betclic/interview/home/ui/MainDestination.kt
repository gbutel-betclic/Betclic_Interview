package com.betclic.interview.home.ui

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.betclic.interview.compose.ui.navigation.Destination

fun NavGraphBuilder.mainDestination() {
    composable(
        route = MainDestination.route,
    ) {
        MainScreen()
    }
}

object MainDestination : Destination(
    route = "main",
)