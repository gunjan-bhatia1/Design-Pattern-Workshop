package com.patterns.simple.factory

fun main() {
    val post: Post = PostFactory.createPost("blog")
    println(post)
}