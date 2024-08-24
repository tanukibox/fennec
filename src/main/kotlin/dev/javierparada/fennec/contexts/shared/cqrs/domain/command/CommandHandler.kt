package dev.javierparada.fennec.contexts.shared.cqrs.domain.command

interface CommandHandler {

    fun handle(command: Command)

    fun getSubscriptions(): Set<String>

}