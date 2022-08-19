package com.patterns.head.first.design.factory.store;

import com.patterns.head.first.design.factory.pizza.HimachalCheesePizza;
import com.patterns.head.first.design.factory.pizza.HimachalVeggiePizza;
import com.patterns.head.first.design.factory.pizza.Pizza;
import com.patterns.head.first.design.simple.factory.PizzaType;

public class HimachalPizzaStore extends PizzaStore {

    protected Pizza createPizza(PizzaType type) {
        if (type == PizzaType.CHEESE) {
            return new HimachalCheesePizza();
        } else if (type == PizzaType.VEGGIE) {
            return new HimachalVeggiePizza();
        } else return null;
    }
}
