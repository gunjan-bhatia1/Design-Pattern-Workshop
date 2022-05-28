package com.patterns.factory.method.creator

import com.patterns.factory.method.message.JSONMessage
import com.patterns.factory.method.message.Message

class JSONMessageCreator: MessageCreator() {
    override fun createMessage(): Message {
        return JSONMessage()
    }
}