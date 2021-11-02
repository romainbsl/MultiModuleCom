package com.example.featureb.presentation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shared.contracts.BasketStateOwner
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import javax.inject.Inject

@HiltViewModel
class ScreenB1ViewModel @Inject constructor(
    basketStateOwner: BasketStateOwner
): ViewModel() {

    private val _basketContent = MutableStateFlow<List<String>>(emptyList())
    val basketContent = _basketContent.asStateFlow()

    init {
        basketStateOwner.basketFlow().map {
            _basketContent.value = it.content
        }.launchIn(viewModelScope)
    }
}