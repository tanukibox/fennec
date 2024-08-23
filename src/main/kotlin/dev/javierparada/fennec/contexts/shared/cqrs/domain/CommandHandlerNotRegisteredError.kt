package dev.javierparada.fennec.contexts.shared.cqrs.domain

class CommandHandlerNotRegisteredError(message: String) : RuntimeException(message)