package com.example.featureb.di

import com.example.featureb.domain.UseCaseDataChecker
import com.example.shared.contracts.DataChecker
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal class FeatureBModule {

    @Singleton
    @Provides
    fun providesDataChecker(
        usecase: UseCaseDataChecker
    ) : DataChecker = usecase
}