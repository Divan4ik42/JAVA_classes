package com.company;

public class HostelTwo extends BaseHousing{

    public HostelTwo(String name, String description, int price) {
        super(name, description, price);
    }

    @Override
    public int getTotalPrice() {
        return super.getPrice();
    }
}
