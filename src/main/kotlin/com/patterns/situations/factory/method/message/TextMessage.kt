package com.patterns.situations.factory.method.message

class TextMessage: Message() {
    override fun getContent(): String {
        return "Text"
    }
}