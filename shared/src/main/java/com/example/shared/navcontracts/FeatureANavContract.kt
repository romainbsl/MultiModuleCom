package com.example.shared.navcontracts

import androidx.navigation.NavController

interface FeatureANavContract {
    fun show(data: Int, navController: NavController)
}