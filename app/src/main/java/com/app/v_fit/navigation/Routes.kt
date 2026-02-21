package com.app.v_fit.navigation

sealed class Route(val route: String) {
    object Welcome : Route("welcome")
    object Onboarding : Route("onboarding")
}
