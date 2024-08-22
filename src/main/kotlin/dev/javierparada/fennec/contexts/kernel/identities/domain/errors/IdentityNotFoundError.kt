package dev.javierparada.fennec.contexts.kernel.identities.domain.errors

import dev.javierparada.fennec.contexts.kernel.shared.domain.entities.node.FennecNodeId

class IdentityNotFoundError(id: FennecNodeId) : Exception("Identity with id '${id.value()}' not found")