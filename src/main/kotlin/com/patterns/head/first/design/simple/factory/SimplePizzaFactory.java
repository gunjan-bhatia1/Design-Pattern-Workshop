package com.patterns.head.first.design.simple.factory;

import com.patterns.head.first.design.simple.factory.pizza.CheesePizza;
import com.patterns.head.first.design.simple.factory.pizza.PepperoniPizza;
import com.patterns.head.first.design.simple.factory.pizza.Pizza;
import com.patterns.head.first.design.simple.factory.pizza.VeggiePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        if (type == PizzaType.CHEESE) {
            pizza = new CheesePizza();
        } else if (type == PizzaType.PEPPERONI) {
            pizza = new PepperoniPizza();
        } else if (type == PizzaType.VEGGIE) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}

