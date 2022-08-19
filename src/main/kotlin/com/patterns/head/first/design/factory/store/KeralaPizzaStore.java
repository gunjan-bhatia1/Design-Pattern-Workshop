package com.patterns.head.first.design.factory.store;

import com.patterns.head.first.design.factory.pizza.KeralaCheesePizza;
import com.patterns.head.first.design.factory.pizza.KeralaVeggiePizza;
import com.patterns.head.first.design.factory.pizza.Pizza;
import com.patterns.head.first.design.simple.factory.PizzaType;

public class KeralaPizzaStore extends PizzaStore{

    protected Pizza createPizza(PizzaType type) {
        if (type == PizzaType.CHEESE) {
            return new KeralaCheesePizza();
        } else if (type == PizzaType.VEGGIE) {
            return new KeralaVeggiePizza();
        } else return null;
    }
}
