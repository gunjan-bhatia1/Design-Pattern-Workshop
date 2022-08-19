package com.patterns.head.first.design.factory.pizza;

public class DelhiVeggiePizza extends Pizza {

    public DelhiVeggiePizza() {
        name = "Delhi Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Mushroom");
        toppings.add("broccoli");
        toppings.add("Cheese");
    }
}
