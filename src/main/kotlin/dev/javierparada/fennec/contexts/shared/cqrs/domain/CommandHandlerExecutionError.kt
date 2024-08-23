package dev.javierparada.fennec.contexts.shared.cqrs.domain

class CommandHandlerExecutionError(e: Throwable) : Exception(e)