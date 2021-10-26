package com.example.modulea

import com.example.shared.navcontracts.FeatureANavContract
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