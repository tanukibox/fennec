package dev.javierparada.fennec.contexts.kernel.identities.domain.entities

import dev.javierparada.fennec.contexts.shared.errors.domain.InvalidValueError
import java.util.*

data class IdentityId(
    private val value: String,
) {

    init {
        try {
            UUID.fromString(value)
        } catch (e: Exception) {
            throw InvalidValueError(e.message ?: "Invalid UUID")
        }

    }

    fun value(): String {
        return this.value
    }
}