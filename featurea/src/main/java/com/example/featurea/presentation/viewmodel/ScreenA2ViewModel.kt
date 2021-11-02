package com.example.featurea.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shared.contracts.BasketStateOwner
import com.example.shared.contracts.DataChecker
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ScreenA2ViewModel @Inject constructor(
    private val dataChecker: DataChecker
): ViewModel() {

    fun check() {
        viewModelScope.launch {
            println("data check = ${dataChecker.check("Coucou!")}")
        }
    }

}