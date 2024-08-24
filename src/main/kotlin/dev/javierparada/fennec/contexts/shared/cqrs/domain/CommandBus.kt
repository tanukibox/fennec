package dev.javierparada.fennec.contexts.shared.cqrs.domain

interface CommandBus {

    fun dispatch(command: Command)

    fun subscribe(command: CommandHandler)

}