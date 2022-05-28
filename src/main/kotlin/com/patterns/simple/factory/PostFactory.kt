package com.patterns.simple.factory

import com.patterns.simple.factory.com.patterns.simple.factory.BlogPost
import java.time.LocalDateTime


/**
 * This class acts as a simple factory for creation of
 * different posts on web site.
 */
class PostFactory {

    companion object {
        fun createPost(type: String): Post {
            return when (type) {
                "blog" -> BlogPost("", listOf())
                "news" -> NewsPost(",", LocalDateTime.now())
                else -> throw IllegalArgumentException("Post type is unknown")
            }
        }
    }
}
