package com.patterns.head.first.design.simple.factory;

import com.patterns.head.first.design.simple.factory.pizza.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(factory);
        pizzaStore.orderPizza(PizzaType.CHEESE);
    }
}
