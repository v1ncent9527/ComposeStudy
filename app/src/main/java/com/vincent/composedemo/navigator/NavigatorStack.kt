package com.vincent.composedemo.navigator

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.vincent.composedemo.page.landing.LandingPage
import com.vincent.composedemo.page.modifier.ModifierPage
import com.vincent.composedemo.page.navigator.NavigatorPage

@Composable
fun NavigatorStack() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Router.LANDING_PAGE) {
        composable(route = Router.LANDING_PAGE) {
            LandingPage(navController = navController)
        }

        composable(route = "${Router.NAVIGATOR_PAGE}/{name}/{age}?gender={gender}", arguments = listOf(
            navArgument(name = "age") {
                type = NavType.IntType
            },
            navArgument(name = "gender"){
                type= NavType.StringType
                defaultValue = "M"
            }
        )) {
            it.arguments?.let { arguments ->
                val name = arguments.getString("name") ?: "no name"
                val age = arguments.getInt("age")
                val gender = arguments.getString("gender")
                NavigatorPage(name, age, gender,navController = navController)
            }
        }

        composable(route = Router.MODIFIER_PAGE){
            ModifierPage(navController = navController)
        }
    }
}