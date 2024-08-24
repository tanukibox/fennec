package dev.javierparada.fennec.contexts.shared.cqrs.domain

interface QueryHandler {

    fun handle(query: Query)

    fun getSubscriptions(): Set<String>

}