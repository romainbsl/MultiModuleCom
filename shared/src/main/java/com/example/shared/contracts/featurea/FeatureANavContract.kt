package com.example.shared.contracts.featurea

import androidx.navigation.NavController

interface FeatureANavContract {
    fun show(data: Int, navController: NavController)
}