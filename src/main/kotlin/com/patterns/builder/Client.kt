package com.patterns.builder

fun main() {
        println("hello")
       directBuild()
    }

    private fun directBuild() {
         FoodOrder.Builder()
            .bread("white bread")
            .meat("bacon")
            .condiments("olive oil")
            .build().let { println(it) }
    }