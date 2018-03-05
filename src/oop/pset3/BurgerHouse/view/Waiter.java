package oop.pset3.BurgerHouse.view;

import oop.pset3.BurgerHouse.controller.WaiterAssistant;
import oop.pset3.BurgerHouse.model.Menu;
import oop.pset3.BurgerHouse.model.Order;
import oop.pset3.BurgerHouse.model.dishes.DishType;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Waiter {

    private Menu menu;
    private Scanner scanner = new Scanner(System.in);
    private WaiterAssistant waiterAssistant;


    public Waiter(Menu menu) {
        this.menu = menu;
        waiterAssistant = new WaiterAssistant(menu);
    }

    public void showMenu(){
        System.out.println("WELCOME, This is our menu: ");
        menu.getItems().stream()
                .map( e -> e.getName()+ " "+e.getPrice()+" Euro")
                .forEach(System.out::println);
    }

    public void show(List<DishType> dishes){
        dishes.stream()
                .map(dish -> dish.getTypeName())
                .collect(Collectors.groupingBy(e -> e,Collectors.counting()))
                .entrySet().stream()
                .map(e -> e.getValue() + " "+ e.getKey())
                .forEach(System.out::println);
    }

    public List<Order> getOrders(){
        System.out.println("Your order :");
        String order  = scanner.nextLine();
        String[] writtenOrders = order.split(",");
        return waiterAssistant.toOrders(writtenOrders);
    }
}
