package com.patterns.head.first.design.simple.factory.pizza;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "CheesePizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Cheese");
    }
}
