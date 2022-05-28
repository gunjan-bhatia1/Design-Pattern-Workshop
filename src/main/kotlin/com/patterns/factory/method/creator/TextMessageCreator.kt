package com.patterns.factory.method.creator

import com.patterns.factory.method.message.Message
import com.patterns.factory.method.message.TextMessage

class TextMessageCreator: MessageCreator() {
    override fun createMessage(): Message {
        return TextMessage()
    }
}