package com.patterns.situations.simple.factory

import java.time.LocalDateTime

import java.text.NumberFormat
import java.util.AbstractCollection
/**
 * Abstract post class. Represents a generic post on a web site.
 */
abstract class Post {

    var id: Int = 0;

    var title: String = "";

    var content: String = "";

    var createdOn: LocalDateTime = LocalDateTime.now();

    var publishedOn: LocalDateTime = LocalDateTime.now();

}
