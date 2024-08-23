package dev.javierparada.fennec.contexts.shared.events.domain

interface DomainEventSubscriber {

    fun on(event: DomainEvent)

    fun getSubscriptions() : List<String>

}