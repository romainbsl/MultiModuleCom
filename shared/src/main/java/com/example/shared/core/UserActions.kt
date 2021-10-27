package com.example.shared.core

sealed interface UserActions

object Login : UserActions
data class CreateFidCard(val cardId: String) : UserActions