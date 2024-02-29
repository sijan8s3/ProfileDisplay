package com.sijan.theprofile

sealed class Screen(val route: String) {

    object Login:Screen(route = "login")
    object Profile:Screen(route="profile")
}