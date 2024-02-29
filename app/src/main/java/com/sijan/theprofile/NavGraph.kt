package com.sijan.theprofile

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavGraph(
    navHostController: NavHostController
){
    NavHost(navController = navHostController, startDestination = Screen.Login.route) {
        composable(
            Screen.Login.route
        ){
            com.sijan.theprofile.LoginScreen(navHostController)
        }
        composable(
            Screen.Profile.route
        ){
            com.sijan.theprofile.ProfileScreen()
        }
    }

}