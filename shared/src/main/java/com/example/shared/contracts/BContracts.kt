package com.example.shared.contracts

interface DataChecker {
    suspend fun check(whatever: String) : Boolean
}