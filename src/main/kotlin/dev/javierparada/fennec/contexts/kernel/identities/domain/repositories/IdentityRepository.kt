package dev.javierparada.fennec.contexts.kernel.identities.domain.repositories

import dev.javierparada.fennec.contexts.kernel.identities.domain.entities.Identity
import dev.javierparada.fennec.contexts.kernel.shared.domain.entities.node.FennecNodeId

interface IdentityRepository {

    fun findById(id: FennecNodeId): Identity

    fun createOne(identity: Identity)

    fun updateOne(identity: Identity)

    fun deleteOne(id: FennecNodeId)

}