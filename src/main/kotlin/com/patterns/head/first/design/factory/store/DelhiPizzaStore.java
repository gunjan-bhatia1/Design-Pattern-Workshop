package com.patterns.head.first.design.factory.store;

import com.patterns.head.first.design.factory.pizza.DelhiCheesePizza;
import com.patterns.head.first.design.factory.pizza.DelhiVeggiePizza;
import com.patterns.head.first.design.factory.pizza.Pizza;
import com.patterns.head.first.design.simple.factory.PizzaType;

public class DelhiPizzaStore extends PizzaStore {

    protected Pizza createPizza(PizzaType type) {
        if (type == PizzaType.CHEESE) {
            return new DelhiCheesePizza();
        } else if (type == PizzaType.VEGGIE) {
            return new DelhiVeggiePizza();
        } else return null;
    }
}
