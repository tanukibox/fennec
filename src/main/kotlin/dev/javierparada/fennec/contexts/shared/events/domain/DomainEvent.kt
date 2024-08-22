package dev.javierparada.fennec.contexts.shared.events.domain

abstract class DomainEvent(
    protected var eventId: DomainEventId? = DomainEventId.random(),
    protected var eventType: DomainEventType,
)