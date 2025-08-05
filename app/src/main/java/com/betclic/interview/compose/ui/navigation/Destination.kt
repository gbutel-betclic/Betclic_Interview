package com.betclic.interview.compose.ui.navigation

import androidx.navigation.NamedNavArgument

abstract class Destination(
    val route: String,
    val arguments: List<NamedNavArgument> = emptyList(),
)