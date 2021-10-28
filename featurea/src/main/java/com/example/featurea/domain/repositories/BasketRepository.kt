package com.example.featurea.domain.repositories

import com.example.shared.domain.BasketDomain
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow

class BasketRepository(private val basketFlow: MutableStateFlow<BasketDomain>) {
    suspend fun updateOffer(offerId: String, quantity: Int): Result<BasketDomain> {
        delay(10)
        val newBasket = BasketDomain(basketFlow.value.content + listOf(offerId))
        basketFlow.emit(newBasket)

        return Result.success(newBasket)
    }
}