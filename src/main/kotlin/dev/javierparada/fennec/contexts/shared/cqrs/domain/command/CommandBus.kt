package dev.javierparada.fennec.contexts.shared.cqrs.domain.command

interface CommandBus {

    fun dispatch(command: Command)

    fun subscribe(handler: CommandHandler)

}