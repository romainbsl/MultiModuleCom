package com.example.shared

import com.example.shared.domain.BasketDomain
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow

class NavEventBus {
    /* Screen A2 deeplink */
    private val _navToScreenA2Flow = MutableSharedFlow<Int>(0, 1, BufferOverflow.DROP_OLDEST)
    val navToScreenA2Flow = _navToScreenA2Flow.asSharedFlow()

    fun navToScreenA2(data: Int) = _navToScreenA2Flow.tryEmit(data)
}