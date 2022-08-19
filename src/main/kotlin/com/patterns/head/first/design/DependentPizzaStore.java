package com.patterns.head.first.design;

import com.patterns.head.first.design.factory.pizza.*;
import com.patterns.head.first.design.simple.factory.PizzaType;

public class DependentPizzaStore {
    public Pizza createPizza(String style, PizzaType type) {
        Pizza pizza = null;
        if (style.equals("Delhi")) {
            if (type == PizzaType.CHEESE){
                pizza = new DelhiCheesePizza();
            } else if (type == PizzaType.VEGGIE){
                pizza = new DelhiVeggiePizza();
            }
        } else if (style.equals("kerala")) {
            if (type == PizzaType.CHEESE){
                pizza = new KeralaCheesePizza();
            } else if (type == PizzaType.VEGGIE){
                pizza = new KeralaVeggiePizza();
            }
        } else {
            System.out.println("Error: invalid type of pizza");
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;

    }
}
