package com.example.featurea.core.di

import com.example.featurea.domain.repositories.BasketRepositoryImpl
import com.example.shared.contracts.BasketRepository
import com.example.shared.contracts.BasketStateOwner
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal class FeatureAModule {

    @Singleton
    @Provides
    fun providesBasketStateOwner(
        basketRepository: BasketRepositoryImpl
    ): BasketStateOwner = basketRepository
}