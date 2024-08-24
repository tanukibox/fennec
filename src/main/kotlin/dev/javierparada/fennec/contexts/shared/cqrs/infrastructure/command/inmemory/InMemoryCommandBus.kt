package dev.javierparada.fennec.contexts.shared.cqrs.infrastructure.command.inmemory

import dev.javierparada.fennec.contexts.shared.cqrs.domain.command.*
import java.util.*

class InMemoryCommandBus(
    private val subscriptions: MutableMap<String, CommandHandler> = TreeMap<String, CommandHandler>(),
): CommandBus {

    override fun dispatch(command: Command) {
        if(!subscriptions.containsKey(command.getCommandType())) {
            throw CommandHandlerNotRegisteredError(command.getCommandType())
        }
        subscriptions[command.getCommandType()]?.handle(command)
    }

    override fun subscribe(handler: CommandHandler) {
        for (subscription in handler.getSubscriptions()) {
            if (subscriptions.containsKey(subscription)) {
                throw CommandHandlerAlreadyRegisteredError(subscription)
            }
            subscriptions[subscription] = handler
        }
    }


}