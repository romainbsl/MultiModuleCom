package com.example.modulea

import androidx.core.os.bundleOf
import androidx.navigation.NavController
import com.example.shared.navcontracts.FeatureANavContract

class NavContractImpl : FeatureANavContract {
    override fun show(data: Int, navController: NavController) {
        navController.navigate(R.id.nav_graph_a, bundleOf("argAValue" to data))
    }
}