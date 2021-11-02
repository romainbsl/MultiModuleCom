package com.example.featurea.core.di

import com.example.featurea.core.providers.NavContractImpl
import com.example.shared.contracts.FeatureANavContract
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NavModule {

    @Singleton
    @Provides
    fun provideNavContract(): FeatureANavContract = NavContractImpl()
}