package com.patterns.head.first.design.factory.pizza;

public class KeralaCheesePizza extends Pizza {

    public KeralaCheesePizza() {
        name = "KeralaCheesePizza";
        dough = "Thick Crust Dough";
        sauce = "soya Sauce";
        toppings.add("onion");
        toppings.add("capsicum");
        toppings.add("Cheese");
    }
}
