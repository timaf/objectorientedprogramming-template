package oop.pset3.BurgerHouse.controller;

import oop.pset3.BurgerHouse.model.Menu;
import oop.pset3.BurgerHouse.model.MenuItem;
import oop.pset3.BurgerHouse.model.Order;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaiterAssistant{

    private Menu menu;

    public WaiterAssistant(Menu menu) {
        this.menu = menu;
    }

    public List<Order> toOrders(String[] writtenOrders){
        return Stream.of(writtenOrders)
                .map(toMenuItem())
                .filter(item -> item.isPresent())
                .map(Optional::get)
                .map(toOrder())
                .collect(Collectors.toList());
    }

    private Function<String,Optional<MenuItem>> toMenuItem() {
        return name -> {
            return menu.getItems().stream()
                    .filter(menuItem -> menuItem.getName().equalsIgnoreCase(name))
                    .findFirst();

        };
    }

    private Function<MenuItem, Order> toOrder(){
        return  item -> {
            Order order = new Order();
            order.setName(item.getName());
            order.setType(item.getType());
            return order;
        };
    }

}

