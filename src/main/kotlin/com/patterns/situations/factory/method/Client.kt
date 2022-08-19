package com.patterns.situations.factory.method

import com.patterns.situations.factory.method.creator.JSONMessageCreator
import com.patterns.situations.factory.method.creator.MessageCreator
import com.patterns.situations.factory.method.creator.TextMessageCreator

fun main() {
    printMessage(JSONMessageCreator())
    printMessage(TextMessageCreator())
}

fun printMessage(creator: MessageCreator){

    val msg = creator.getMessage()
    println(msg.getContent())
}
