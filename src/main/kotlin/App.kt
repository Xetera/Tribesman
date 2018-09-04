package main.kotlin

import main.kotlin.socket.SocketHandler
import me.aberrantfox.kjdautils.api.startBot

fun main(args: Array<String>) {
    startBot(Config.token) {
        val commandPath = "main.kotlin.commands"
        val prefix = "="
        registerCommands(commandPath, prefix)
    }
    SocketHandler.poll()
}

