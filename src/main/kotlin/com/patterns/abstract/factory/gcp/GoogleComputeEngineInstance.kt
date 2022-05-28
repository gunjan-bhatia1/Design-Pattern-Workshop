package com.patterns.abstract.factory.gcp

import com.patterns.abstract.factory.Instance
import com.patterns.abstract.factory.Storage

class GoogleComputeEngineInstance(capacity: Instance.Capacity) : Instance {
    init{
        println("Created Google Compute Engine instance with $capacity")
    }
    override fun start() {
        println("Compute engine instance started")
    }

    override fun attachStorage(storage: Storage) {
        println("Attached $storage to Compute engine instance")
    }

    override fun stop() {
        println("Compute engine instance stopped")
    }

    override fun toString(): String {
        return "GCP Instance"
    }
}