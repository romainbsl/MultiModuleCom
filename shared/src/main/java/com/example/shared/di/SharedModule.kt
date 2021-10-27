package com.example.shared.di

import com.example.shared.AppEventBus
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class SharedModule {
    @Singleton
    @Provides
    fun providesAppEventBus(): AppEventBus = AppEventBus()
}