package oop.pset3.BurgerHouse.controller;

import oop.pset3.BurgerHouse.controller.cookers.BurgerCook;
import oop.pset3.BurgerHouse.controller.cookers.Cook;
import oop.pset3.BurgerHouse.controller.cookers.DessertCook;
import oop.pset3.BurgerHouse.controller.cookers.PizzaCook;
import oop.pset3.BurgerHouse.model.Order;
import oop.pset3.BurgerHouse.model.dishes.DishType;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KitchenManger {

    private Set<Cook> cooks = Stream.of(
            new PizzaCook(),
            new DessertCook(),
            new BurgerCook()
    ).collect(Collectors.toSet());

    public List<DishType> cook(List<Order> orders){
         return orders.stream()
                .map(cookTheDish())
                .filter(Optional::isPresent)
                .map(Optional::get)
                 .collect(Collectors.toList());
    }

    private Function<Order,Optional<DishType>> cookTheDish(){
        return order -> {
            return cooks.stream()
                    .filter(cook -> cook.getType().equalsIgnoreCase(order.getType()))
                    .map(cook -> cook.cook(order))
                    .findFirst();
        };
    }

}
