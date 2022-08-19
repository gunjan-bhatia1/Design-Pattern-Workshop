package com.patterns.situations.factory.method.creator

import com.patterns.situations.factory.method.message.Message
import com.patterns.situations.factory.method.message.TextMessage

class TextMessageCreator: MessageCreator() {
    override fun createMessage(): Message {
        return TextMessage()
    }
}