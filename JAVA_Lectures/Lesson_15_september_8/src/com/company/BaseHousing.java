package com.company;
//  ЄТОТ класс будет абстрактнім

// у абстрактного метода нет реализации он ничего не ДЕЛАЕТ

public abstract class BaseHousing {

    private String name;
    private String description;
    private int price;

    public BaseHousing() {
    }

    public BaseHousing(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    // єтот метод будут реализовівать его наследники - КАЖДІЙ ПО СВОЕМУ
    public abstract int getTotalPrice();

    @Override
    public String toString() {
        return "BaseHousing{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
