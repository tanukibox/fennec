package dev.javierparada.fennec.contexts.shared.cqrs.domain.command

class CommandHandlerAlreadyRegisteredError(message: String) : RuntimeException(message)