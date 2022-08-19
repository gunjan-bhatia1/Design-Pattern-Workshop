package com.patterns.head.first.design.factory.store;

import com.patterns.head.first.design.factory.pizza.Pizza;
import com.patterns.head.first.design.simple.factory.PizzaType;

public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType type) {

        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(PizzaType type);
}