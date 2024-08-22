package dev.javierparada.fennec.contexts.shared.events.domain

import dev.javierparada.fennec.contexts.shared.errors.domain.InvalidValueError
import java.util.*

data class DomainEventId(
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

    companion object {
        fun random(): DomainEventId {
            return DomainEventId(UUID.randomUUID().toString())
        }
    }
}