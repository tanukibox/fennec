package dev.javierparada.fennec.contexts.kernel.shared.domain.entities.node

import dev.javierparada.fennec.contexts.shared.errors.domain.InvalidValueError
import java.util.*

data class FennecNodeId(
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