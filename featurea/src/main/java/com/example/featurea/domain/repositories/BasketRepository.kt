package com.example.featurea.domain.repositories

import com.example.shared.contracts.BasketRepository
import com.example.shared.contracts.BasketStateOwner
import com.example.shared.domain.BasketDomain
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
internal class BasketRepositoryImpl @Inject constructor(): BasketRepository, BasketStateOwner {
    private val basketFlow: MutableStateFlow<BasketDomain> = MutableStateFlow(BasketDomain(emptyList()))

    override suspend fun updateOffer(offerId: String, quantity: Int): Result<BasketDomain> {
        delay(10)
        val newBasket = BasketDomain(basketFlow.value.content + listOf(offerId))
        basketFlow.emit(newBasket)

        return Result.success(newBasket)
    }

    override fun basketFlow(): StateFlow<BasketDomain> = basketFlow.asStateFlow()
}