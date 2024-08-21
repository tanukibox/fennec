package dev.javierparada.fennec.contexts.kernel.identities.domain.entities

import dev.javierparada.fennec.contexts.shared.errors.domain.InvalidValueError

data class IdentityClass(
    private val value: String?,
) {

    companion object {
        private val VALID_VALUES = setOf("individual", "group", "organization", "class", "unknown")
    }

    init {
        if (value != null && value.isBlank()) {
            throw InvalidValueError("Identity class cannot be empty")
        }
        if(value !in VALID_VALUES) {
            throw InvalidValueError("Identity class should be one of <\"individual\", \"group\", \"organization\", \"class\", \"unknown\">")
        }
    }

    fun value(): String? {
        return this.value
    }
}