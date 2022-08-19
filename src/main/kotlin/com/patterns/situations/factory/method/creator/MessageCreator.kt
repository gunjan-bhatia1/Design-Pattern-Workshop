package com.patterns.situations.factory.method.creator

import com.patterns.situations.factory.method.message.Message

abstract class MessageCreator {

    fun getMessage(): Message {
        val message: Message = createMessage()

        message.addDefaultHeaders()
        message.encrypt()

        return message
    }

    //Factory Method
    abstract fun createMessage(): Message
}