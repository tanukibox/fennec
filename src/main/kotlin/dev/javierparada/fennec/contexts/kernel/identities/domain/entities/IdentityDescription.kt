package dev.javierparada.fennec.contexts.kernel.identities.domain.entities

import dev.javierparada.fennec.contexts.shared.errors.domain.InvalidValueError

data class IdentityDescription(
    private val value: String?,
) {

    init {
        if (value != null && value.isBlank()) {
            throw InvalidValueError("Identity description cannot be empty")
        }
    }

    fun value(): String? {
        return this.value
    }
}