package dev.javierparada.fennec.contexts.shared.events.domain

import dev.javierparada.fennec.contexts.shared.errors.domain.InvalidValueError

data class DomainEventType(
    private val value: String,
) {

    init {
        if (value.isBlank()) {
            throw InvalidValueError("Domain event type cannot be empty or null")
        }
        if (value.contains(' ')) {
            throw InvalidValueError("Domain event type cannot contain spaces")
        }
    }

    fun value(): String {
        return this.value
    }
}