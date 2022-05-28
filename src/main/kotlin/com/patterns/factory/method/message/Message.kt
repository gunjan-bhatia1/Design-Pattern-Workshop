package com.patterns.factory.method.message

abstract class Message {
    abstract fun getContent(): String
    fun addDefaultHeaders() {

    }

    fun encrypt() {

    }
}