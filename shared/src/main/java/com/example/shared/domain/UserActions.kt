package com.example.shared.domain

sealed interface UserActions

object Login : UserActions
data class CreateFidCard(val cardId: String) : UserActions