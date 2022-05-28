package com.patterns.abstract.factory

import com.patterns.abstract.factory.aws.AWSResourceFactory
import com.patterns.abstract.factory.gcp.GoogleResourceFactory
import javax.xml.parsers.DocumentBuilderFactory

class Client {

    private val factory: ResourceFactory

    constructor(factory: ResourceFactory) {
        this.factory = factory
    }

    fun createServer(cap: Instance.Capacity, storageMib: Int): Instance {
        var instance = factory.createInstance(cap)
        val storage = factory.createStorage(storageMib)
        instance.attachStorage(storage);
        return instance;
    }
}

fun main() {
    var aws = Client(AWSResourceFactory());
    var i1 = aws.createServer(Instance.Capacity.MICRO, 20480);
    i1.start();
    i1.stop();

    System.out.println("***************************************");
    var gcp = Client(GoogleResourceFactory());
    i1 = gcp.createServer(Instance.Capacity.MICRO, 20480);
    i1.start();
    i1.stop();
}