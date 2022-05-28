package com.patterns.factory.method

import com.patterns.factory.method.creator.JSONMessageCreator
import com.patterns.factory.method.creator.MessageCreator
import com.patterns.factory.method.creator.TextMessageCreator

fun main() {
    printMessage(JSONMessageCreator())
    printMessage(TextMessageCreator())
}

fun printMessage(creator: MessageCreator) {

    val msg = creator.getMessage()
    println(msg)
}
