package oop.pset3.BurgerHouse.controller.cookers;

import oop.pset3.BurgerHouse.model.Order;
import oop.pset3.BurgerHouse.model.dishes.Dessert;
import oop.pset3.BurgerHouse.model.dishes.DishType;

public class DessertCook implements Cook {

    @Override
    public DishType cook(Order order) {
        return new Dessert(order.getName());
    }

    @Override
    public String getType() {
        return "DESSERT";
    }
}
