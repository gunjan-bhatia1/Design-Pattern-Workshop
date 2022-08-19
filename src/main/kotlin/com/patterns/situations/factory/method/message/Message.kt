package com.patterns.situations.factory.method.message

abstract class Message {
    abstract fun getContent(): String
    fun addDefaultHeaders() {

    }

    fun encrypt() {

    }
}