package dev.javierparada.fennec.contexts.shared.cqrs.domain

class QueryHandlerExecutionError(e: Throwable) : Exception(e)