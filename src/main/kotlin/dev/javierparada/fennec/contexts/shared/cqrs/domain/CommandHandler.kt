package dev.javierparada.fennec.contexts.shared.cqrs.domain

interface CommandHandler {

    fun handle(command: Command)

    fun getSubscriptions(): Set<String>

}