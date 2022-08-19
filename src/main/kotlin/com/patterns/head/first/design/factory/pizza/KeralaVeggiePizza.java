package com.patterns.head.first.design.factory.pizza;

public class KeralaVeggiePizza extends Pizza {

    public KeralaVeggiePizza() {
        name = "KeralaVeggiePizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Mushroom");
        toppings.add("broccoli");
        toppings.add("Cheese");
    }
}
