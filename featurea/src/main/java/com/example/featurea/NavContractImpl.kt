package com.example.featurea

import androidx.core.os.bundleOf
import androidx.navigation.NavController
import com.example.shared.navcontracts.FeatureANavContract

class NavContractImpl : FeatureANavContract {
    override fun show(data: Int, navController: NavController) {
        navController.navigate(R.id.fragmentA2, bundleOf("data" to data))
    }
}