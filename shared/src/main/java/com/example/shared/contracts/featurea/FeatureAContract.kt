package com.example.shared.contracts.featurea

import com.example.shared.core.UserActions
import com.example.shared.core.UserInfo
import kotlinx.coroutines.flow.Flow

interface FeatureAContract {
    fun getUserInfo(): UserInfo
    fun getUserActions(): Flow<UserActions>
}