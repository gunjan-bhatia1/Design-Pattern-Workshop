package com.patterns.builder
//https://blog.mindorks.com/mastering-design-patterns-in-android-with-kotlin
//https://github.com/Baeldung/kotlin-tutorials/blob/master/core-kotlin-modules/core-kotlin-design-patterns/src/main/kotlin/com/baeldung/builder/FoodOrderNamed.kt
data class FoodOrder private constructor(
    val bread: String?,
    val jam: String? = "jam",
    val condiments: String?,
    val meat: String?,
    val fish: String?
) {

    data class Builder(
        var bread: String? = null,
        var condiments: String? = null,
        var meat: String? = null,
        var fish: String? = null
    ) {

        fun bread(bread: String) = apply { this.bread = bread }
        fun condiments(condiments: String) = apply { this.condiments = condiments }
        fun meat(meat: String) = apply { this.meat = meat }
        fun fish(fish: String) = apply { this.fish = fish }
        fun build() = FoodOrder(bread = bread, condiments = condiments, meat = meat, fish = fish)
    }
}