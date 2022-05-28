package com.patterns.factory.method.message

class JSONMessage: Message(){
    override fun getContent(): String {
            return "{\"JSON]\":[]}";
    }
}