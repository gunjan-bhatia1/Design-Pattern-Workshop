package com.patterns.head.first.design.simple.factory.pizza;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        name = "PepperoniPizza";
        dough = "Thick Crust Dough";
        sauce = "soya Sauce";
        toppings.add("onion");
        toppings.add("capsicum");
    }
}
