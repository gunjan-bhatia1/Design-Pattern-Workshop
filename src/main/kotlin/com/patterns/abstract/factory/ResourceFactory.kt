package com.patterns.abstract.factory

interface ResourceFactory {
    fun createInstance(capacity: Instance.Capacity): Instance

    fun createStorage(capMib: Int): Storage
}