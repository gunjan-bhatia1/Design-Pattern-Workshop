package com.patterns.situations.factory.method.message

class JSONMessage: Message(){
    override fun getContent(): String {
            return "{\"JSON]\":[]}";
    }
}