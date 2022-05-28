package com.patterns.abstract.factory.aws

import com.patterns.abstract.factory.Storage

class S3Storage(capMib: Int) : Storage {
    init{
        println("Allocated $capMib on S3")
    }

    override fun getId(): String {
        return "S31";
    }

    override fun toString(): String {
        return "S3 Storage";
    }
}