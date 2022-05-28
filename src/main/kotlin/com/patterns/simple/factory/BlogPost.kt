package com.patterns.simple.factory.com.patterns.simple.factory

import com.patterns.simple.factory.Post


/**
 * Represents a blog post.
 *
 */
data class BlogPost(val author: String, val tags: List<String>) : Post()