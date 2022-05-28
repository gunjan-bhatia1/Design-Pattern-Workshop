package com.patterns.abstract.factory.aws

import com.patterns.abstract.factory.Instance
import com.patterns.abstract.factory.Storage

class Ec2Instance(capacity: Instance.Capacity) : Instance {

    init{
        println("Created Ec2Instance with $capacity")
    }
    override fun start() {
        println("Ec2Instance started")
    }

    override fun attachStorage(storage: Storage) {
        println("Attached $storage to Ec2Instance")
    }

    override fun stop() {
        println("Ec2Instance stopped")
    }

    override fun toString(): String {
        return "Ec2Instance"
    }
}