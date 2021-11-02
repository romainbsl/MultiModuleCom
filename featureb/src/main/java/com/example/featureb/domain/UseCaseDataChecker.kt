
package com.example.featureb.domain

import com.example.shared.contracts.DataChecker
import kotlinx.coroutines.delay
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.time.Duration
import kotlin.time.ExperimentalTime

@Singleton
internal class UseCaseDataChecker @Inject constructor() : DataChecker {
    @OptIn(ExperimentalTime::class)
    override suspend fun check(whatever: String): Boolean {
        delay(Duration.Companion.seconds(3))
        return true
    }
}

