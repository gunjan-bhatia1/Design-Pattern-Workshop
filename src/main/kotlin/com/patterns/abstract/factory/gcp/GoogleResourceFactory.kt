package com.patterns.abstract.factory.gcp

import com.patterns.abstract.factory.Instance
import com.patterns.abstract.factory.ResourceFactory
import com.patterns.abstract.factory.Storage

class GoogleResourceFactory: ResourceFactory {
    override fun createInstance(capacity: Instance.Capacity): Instance {
        return GoogleComputeEngineInstance(capacity)
    }

    override fun createStorage(capMib: Int): Storage {
        return GoogleCloudStorage(capMib)
    }
}