package dev.javierparada.fennec.contexts.shared.cqrs.domain.command

class CommandHandlerNotRegisteredError(message: String) : RuntimeException(message)