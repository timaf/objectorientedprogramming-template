package oop.pset3.BurgerHouse.model.dishes;

public abstract class DishType {

    private String name;

    public DishType(String typeName) {
        this.name = typeName;
    }

    public String getTypeName() {
        return name;
    }
}