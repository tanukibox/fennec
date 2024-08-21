package dev.javierparada.fennec.contexts.kernel.identities.domain.entities

import dev.javierparada.fennec.contexts.kernel.shared.domain.entities.node.FennecNodeId

class Identity(
    val id: FennecNodeId,
    val description: IdentityDescription,
    val roles: Set<IdentityRole>,
    val clazz: IdentityClass,
    val sectors: Set<IdentitySector>,
    val contactInformation: IdentityContactInformation,
)