package com.patterns.abstract.factory

interface Instance {
    //Represents an abstract product
    fun start()

    fun attachStorage(storage: Storage)

    fun stop()

    enum class Capacity {
        MICRO,
        SMALL,
        LARGE
    }
}

