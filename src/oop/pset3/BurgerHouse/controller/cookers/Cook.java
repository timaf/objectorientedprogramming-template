package oop.pset3.BurgerHouse.controller.cookers;

import oop.pset3.BurgerHouse.model.Order;
import oop.pset3.BurgerHouse.model.dishes.DishType;

public interface Cook {

    DishType cook(Order order);
    String getType();

}
