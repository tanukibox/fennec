package dev.javierparada.fennec.contexts.kernel.identities.domain.entities

import dev.javierparada.fennec.contexts.shared.errors.domain.InvalidValueError

data class IdentitySector(private val value: String) {

    companion object { // TODO: check government-* and infrastructure-* at official scheme
        private val VALID_VALUES = setOf("agriculture", "aerospace", "automotive", "chemical", "commercial", "communications",
            "construction", "defense", "education", "energy", "entertainment", "financial-services",
            "government-emergency-services", "government-local", "government-national", "government-public-services",
            "government-regional", "healthcare", "hospitality-leisure", "infrastructure-dams", "infrastructure-nuclear",
            "infrastructure-water", "insurance", "manufacturing", "mining", "non-profit", "pharmaceuticals", "retail",
            "technology", "telecommunications", "transportation", "utilities")
    }

    init {
        if (value !in VALID_VALUES) {
            throw InvalidValueError("Identity sector should be one of '${VALID_VALUES.joinToString(", ")}'.'")
        }
    }

}