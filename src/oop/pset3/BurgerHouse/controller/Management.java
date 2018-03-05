package oop.pset3.BurgerHouse.controller;

import oop.pset3.BurgerHouse.model.Menu;
import oop.pset3.BurgerHouse.model.MenuItem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Management {

    private static Menu menu = parse();

    private Management() {
    }

    private static Menu parse(){

        try {
            List< MenuItem> menuItem = Files.lines(Paths.get("src/oop/pset3/BurgerHouse/data/menu-small.csv"))
                    .skip(1)
                    .map(line -> line.split(";"))
                    .filter(columns -> columns.length ==3)
                    .map(toMenuItem())
                    .collect(Collectors.toList());
            return new Menu(menuItem);
        } catch (IOException e) {
            e.printStackTrace();
            return new Menu( new ArrayList<>());
        }
    }

    private static Function<String[], MenuItem> toMenuItem(){
        return columns -> {
            MenuItem menuItem = new MenuItem();
            menuItem.setName(columns[0]);
            menuItem.setType(columns[1]);
            menuItem.setPrice(Double.parseDouble(columns[2]));
        return menuItem;
        };
    }

    public static Menu getMenu(){
        return menu;
    }

}
