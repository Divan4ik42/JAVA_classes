package com.company;

public class SemiLux implements IAccounting {
    private String name;
    private String description;
    private int basePrice;
    private int breakfastPrice;
    private int lunchPrice;
    private int dinerPrice;
    private int barPrice;
    private int poolPrice;
    private int seaViewBalconyPrice;
    private int tvPrice;
    private int premiumWifiPrice;

    public SemiLux() {
    }

    public SemiLux(String name, String description, int basePrice) {
        this.name = name;
        this.description = description;
        this.basePrice = basePrice;
    }

    public SemiLux(String name, String description, int basePrice, boolean allIncluded) {
        this.name = name;
        this.description = description;
        this.basePrice = basePrice;
        if (allIncluded == true) {
            this.breakfastPrice = 50;
            this.lunchPrice = 30;
            this.dinerPrice = 150;
            this.barPrice = 100;
            this.poolPrice = 100;
            this.seaViewBalconyPrice = 150;
            this.tvPrice = 30;
            this.premiumWifiPrice = 35;
        }

    }

    public SemiLux(String name, String description, int basePrice, int breakfastPrice, int lunchPrice, int dinerPrice, int barPrice, int poolPrice, int seaViewBalconyPrice, int tvPrice, int premiumWifiPrice) {
        this.name = name;
        this.description = description;
        this.basePrice = basePrice;
        this.breakfastPrice = breakfastPrice;
        this.lunchPrice = lunchPrice;
        this.dinerPrice = dinerPrice;
        this.barPrice = barPrice;
        this.poolPrice = poolPrice;
        this.seaViewBalconyPrice = seaViewBalconyPrice;
        this.tvPrice = tvPrice;
        this.premiumWifiPrice = premiumWifiPrice;
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

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getBreakfastPrice() {
        return breakfastPrice;
    }

    public void setBreakfastPrice(int breakfastPrice) {
        this.breakfastPrice = breakfastPrice;
    }

    public int getLunchPrice() {
        return lunchPrice;
    }

    public void setLunchPrice(int lunchPrice) {
        this.lunchPrice = lunchPrice;
    }

    public int getDinerPrice() {
        return dinerPrice;
    }

    public void setDinerPrice(int dinerPrice) {
        this.dinerPrice = dinerPrice;
    }

    public int getBarPrice() {
        return barPrice;
    }

    public void setBarPrice(int barPrice) {
        this.barPrice = barPrice;
    }

    public int getPoolPrice() {
        return poolPrice;
    }

    public void setPoolPrice(int poolPrice) {
        this.poolPrice = poolPrice;
    }

    public int getSeaViewBalconyPrice() {
        return seaViewBalconyPrice;
    }

    public void setSeaViewBalconyPrice(int seaViewBalconyPrice) {
        this.seaViewBalconyPrice = seaViewBalconyPrice;
    }

    public int getTvPrice() {
        return tvPrice;
    }

    public void setTvPrice(int tvPrice) {
        this.tvPrice = tvPrice;
    }

    public int getPremiumWifiPrice() {
        return premiumWifiPrice;
    }

    public void setPremiumWifiPrice(int premiumWifiPrice) {
        this.premiumWifiPrice = premiumWifiPrice;
    }

    @Override
    public String toString() {
        return "SemiLux{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", basePrice=" + basePrice +
                ", breakfastPrice=" + breakfastPrice +
                ", lunchPrice=" + lunchPrice +
                ", dinerPrice=" + dinerPrice +
                ", barPrice=" + barPrice +
                ", poolPrice=" + poolPrice +
                ", seaViewBalconyPrice=" + seaViewBalconyPrice +
                ", tvPrice=" + tvPrice +
                ", premiumWifiPrice=" + premiumWifiPrice +
                '}';
    }

    @Override
    public int getTotalSum() {
        return this.getBasePrice()
                + this.getBarPrice()
                + this.getBreakfastPrice()
                + this.getDinerPrice()
                + this.getLunchPrice()
                + this.getPoolPrice()
                + this.getPremiumWifiPrice()
                + this.getSeaViewBalconyPrice()
                + this.getTvPrice();
}
}
