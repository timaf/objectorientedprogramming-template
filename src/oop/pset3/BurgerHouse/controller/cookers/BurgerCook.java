package oop.pset3.BurgerHouse.controller.cookers;

import oop.pset3.BurgerHouse.model.Order;
import oop.pset3.BurgerHouse.model.dishes.Burger;
import oop.pset3.BurgerHouse.model.dishes.DishType;

public class BurgerCook implements Cook{

    @Override
    public DishType cook(Order order) {
        return new Burger(order.getName());
    }

    @Override
    public String getType() {
        return"BURGER";
    }
}
