package com.patterns.situations.factory.method.creator

import com.patterns.situations.factory.method.message.JSONMessage
import com.patterns.situations.factory.method.message.Message

class JSONMessageCreator: MessageCreator() {
    override fun createMessage(): Message {
        return JSONMessage()
    }
}