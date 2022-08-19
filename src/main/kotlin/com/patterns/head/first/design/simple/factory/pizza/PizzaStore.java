package com.patterns.head.first.design.simple.factory.pizza;


import com.patterns.head.first.design.simple.factory.PizzaType;
import com.patterns.head.first.design.simple.factory.SimplePizzaFactory;

public class PizzaStore {
    Pizza pizza;
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(PizzaType type) {

        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}