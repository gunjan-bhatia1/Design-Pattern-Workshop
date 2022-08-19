package com.patterns.situations.simple.factory

fun main() {
    val post: Post = PostFactory.createPost("blog")
    println(post)
}