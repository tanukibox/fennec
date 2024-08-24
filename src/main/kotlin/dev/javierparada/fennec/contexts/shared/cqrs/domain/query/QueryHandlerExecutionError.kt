package dev.javierparada.fennec.contexts.shared.cqrs.domain.query

class QueryHandlerExecutionError(e: Throwable) : Exception(e)