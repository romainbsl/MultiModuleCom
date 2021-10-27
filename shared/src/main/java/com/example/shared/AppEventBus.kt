package com.example.shared

import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow

class AppEventBus {
    private val _navToFeatureA2Flow = MutableSharedFlow<Unit>(0, 1, BufferOverflow.DROP_OLDEST)
    val navToFeatureA2Flow = _navToFeatureA2Flow.asSharedFlow()

    fun navToFeatureA2() = _navToFeatureA2Flow.tryEmit(Unit)
}