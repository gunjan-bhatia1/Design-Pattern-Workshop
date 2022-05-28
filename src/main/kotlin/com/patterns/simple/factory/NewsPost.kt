package com.patterns.simple.factory

import java.time.LocalDate
import java.time.LocalDateTime


/**
 * Represents a news post.
 *
 */
data class NewsPost(val headline: String, val newsTime: LocalDateTime) : Post()