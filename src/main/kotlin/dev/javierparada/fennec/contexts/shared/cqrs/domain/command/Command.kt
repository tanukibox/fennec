package dev.javierparada.fennec.contexts.shared.cqrs.domain.command

interface Command {

    fun getCommandType(): String

}