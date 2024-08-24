package dev.javierparada.fennec.contexts.shared.cqrs.domain.command

class CommandHandlerExecutionError(e: Throwable) : Exception(e)