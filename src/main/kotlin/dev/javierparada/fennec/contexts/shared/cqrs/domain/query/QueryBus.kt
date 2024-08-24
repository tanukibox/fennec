package dev.javierparada.fennec.contexts.shared.cqrs.domain.query

interface QueryBus {

    fun ask(query: Query)

    fun subscribe(handler: QueryHandler)

}