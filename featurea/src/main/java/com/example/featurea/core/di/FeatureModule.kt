package com.example.featurea.core.di

import com.example.featurea.domain.repositories.BasketRepository
import com.example.shared.AppEventBus
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FeatureModule {

    @Singleton
    @Provides
    fun providesBasketRepository(appEventBus: AppEventBus): BasketRepository = BasketRepository(appEventBus.basketFlow)
}