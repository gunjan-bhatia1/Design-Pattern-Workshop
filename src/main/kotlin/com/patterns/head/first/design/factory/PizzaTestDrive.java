package com.patterns.head.first.design.factory;

import com.patterns.head.first.design.simple.factory.PizzaType;
import com.patterns.head.first.design.factory.pizza.Pizza;
import com.patterns.head.first.design.factory.store.DelhiPizzaStore;
import com.patterns.head.first.design.factory.store.KeralaPizzaStore;
import com.patterns.head.first.design.factory.store.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore delhiStore = new DelhiPizzaStore();
        PizzaStore keralaStore = new KeralaPizzaStore();

        Pizza pizza = delhiStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Abita ordered a " + pizza.getName() + "\n");

        pizza = keralaStore.orderPizza(PizzaType.VEGGIE);
        System.out.println("Gunjan ordered a " + pizza.getName() + "\n");

    }
}
