package com.example.featureb.presentation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shared.AppEventBus
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.map
import javax.inject.Inject

@HiltViewModel
class ScreenB1ViewModel @Inject constructor(
    appEventBus: AppEventBus
): ViewModel() {

    val basketContent = MutableStateFlow(appEventBus.basketFlow.replayCache.lastOrNull()?.content ?: listOf())

    init {
        appEventBus.basketFlow.map {
            basketContent.value = it.content
        }.launchIn(viewModelScope)
    }
}