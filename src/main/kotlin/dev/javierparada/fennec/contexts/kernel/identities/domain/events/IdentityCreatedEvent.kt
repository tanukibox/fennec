package dev.javierparada.fennec.contexts.kernel.identities.domain.events

import dev.javierparada.fennec.contexts.kernel.shared.domain.entities.node.FennecNodeId
import dev.javierparada.fennec.contexts.shared.events.domain.DomainEvent
import dev.javierparada.fennec.contexts.shared.events.domain.DomainEventId
import dev.javierparada.fennec.contexts.shared.events.domain.DomainEventType

class IdentityCreatedEvent(
    eventId: DomainEventId?,
    eventType: DomainEventType,
    val identityId: FennecNodeId,
): DomainEvent(eventId, eventType)