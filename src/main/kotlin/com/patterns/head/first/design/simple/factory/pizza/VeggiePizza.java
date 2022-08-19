package com.patterns.head.first.design.simple.factory.pizza;


public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        name = "VeggiePizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Mushroom");
        toppings.add("broccoli");
        toppings.add("Cheese");
    }
}
