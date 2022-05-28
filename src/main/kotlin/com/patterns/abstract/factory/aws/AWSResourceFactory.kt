package com.patterns.abstract.factory.aws

import com.patterns.abstract.factory.Instance
import com.patterns.abstract.factory.ResourceFactory
import com.patterns.abstract.factory.Storage

class AWSResourceFactory: ResourceFactory{
    override fun createInstance(capacity: Instance.Capacity): Instance {
        return Ec2Instance(capacity)
    }

    override fun createStorage(capMib: Int): Storage {
        return S3Storage(capMib)
    }
}