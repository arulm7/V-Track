package com.app.v_fit.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.app.v_fit.ui.screens.OnboardingScreen
import com.app.v_fit.ui.screens.WelcomeScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Route.Welcome.route) {
        composable(Route.Welcome.route) {
            WelcomeScreen(onNext = {
                navController.navigate(Route.Onboarding.route)
            })
        }
        composable(Route.Onboarding.route) {
            OnboardingScreen()
        }
    }
}
