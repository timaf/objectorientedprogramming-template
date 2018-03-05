package oop.pset3.BurgerHouse.model;

import java.util.List;

public class Menu {
    private List<MenuItem> items;

    public Menu(List<MenuItem> items){
        this.items = items;
    }

    public List <MenuItem> getItems() {
        return items;
    }
}
