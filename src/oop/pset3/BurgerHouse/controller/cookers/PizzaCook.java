package oop.pset3.BurgerHouse.controller.cookers;

import oop.pset3.BurgerHouse.model.Order;
import oop.pset3.BurgerHouse.model.dishes.DishType;
import oop.pset3.BurgerHouse.model.dishes.Pizza;

public class PizzaCook implements Cook {

    @Override
    public DishType cook(Order order) {
        return new Pizza(order.getName());
    }

    @Override
    public String getType() {
        return "PIZZA";
    }
}
