package com.patterns.abstract.factory.gcp

import com.patterns.abstract.factory.Storage

class GoogleCloudStorage(capMib: Int): Storage {

    init{
        println("Allocated $capMib on Google Cloud Storage")
    }

    override fun getId(): String {
        return "GCP1";
    }

    override fun toString(): String {
        return "Google Cloud Storage ";
    }
}