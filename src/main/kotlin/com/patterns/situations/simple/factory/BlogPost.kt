package com.patterns.situations.simple.factory


/**
 * Represents a blog post.
 *
 */
data class BlogPost(val author: String, val tags: List<String>) : Post()