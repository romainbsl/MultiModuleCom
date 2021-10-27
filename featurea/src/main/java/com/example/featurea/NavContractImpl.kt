package com.example.featurea

import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.NavDeepLinkRequest
import com.example.shared.navcontracts.FeatureANavContract

class NavContractImpl : FeatureANavContract {
    override fun show(data: Int, navController: NavController) {
        val request = NavDeepLinkRequest.Builder
            .fromUri("android-app://example.google.app/feature_a_fragment_2/$data".toUri())
            .build()
        navController.navigate(request)
    }
}