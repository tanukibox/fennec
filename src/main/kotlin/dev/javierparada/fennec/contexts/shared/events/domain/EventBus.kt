package dev.javierparada.fennec.contexts.shared.events.domain

interface EventBus {

    fun publish(event: DomainEvent)

    fun subscribe(handler: DomainEventSubscriber)

}