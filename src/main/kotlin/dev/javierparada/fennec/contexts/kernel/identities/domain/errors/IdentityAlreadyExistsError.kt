package dev.javierparada.fennec.contexts.kernel.identities.domain.errors

import dev.javierparada.fennec.contexts.kernel.shared.domain.entities.node.FennecNodeId

class IdentityAlreadyExistsError(id: FennecNodeId) : Exception("Identity with id '${id.value()}' already exists")