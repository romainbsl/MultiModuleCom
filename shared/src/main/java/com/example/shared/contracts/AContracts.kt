package com.example.shared.contracts

import androidx.navigation.NavController
import com.example.shared.domain.BasketDomain
import kotlinx.coroutines.flow.StateFlow

interface FeatureANavContract {
    fun show(data: Int, navController: NavController)
}

interface BasketRepository {
    suspend fun updateOffer(offerId: String, quantity: Int) : Result<BasketDomain>
}

interface BasketStateOwner {
    fun basketFlow() : StateFlow<BasketDomain>
}