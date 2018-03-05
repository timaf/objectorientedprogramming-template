package oop.pset3.BurgerHouse.controller;

import oop.pset3.BurgerHouse.model.Menu;
import oop.pset3.BurgerHouse.model.Order;
import oop.pset3.BurgerHouse.model.dishes.DishType;
import oop.pset3.BurgerHouse.view.Waiter;

import java.util.List;

public class BurgerHouse {
    private Menu menu = Management.getMenu();
    private Waiter waiter = new Waiter(menu);
    private KitchenManger kitchenManger = new KitchenManger();

    public void visit(){
        waiter.showMenu();
        List<Order> orders  = waiter.getOrders();
        List <DishType> dishs = kitchenManger.cook(orders);
        waiter.show(dishs);
    }

}
