package com.company;

public class SemiLuxTwo extends BaseHousing{
    private int basePrice;
    private int breakfastPrice;
    private int lunchPrice;
    private int dinerPrice;
    private int barPrice;
    private int poolPrice;
    private int seaViewBalconyPrice;
    private int tvPrice;
    private int premiumWifiPrice;

    public SemiLuxTwo(String name, String description, int price) {
        super(name,description,price);
    }
    public SemiLuxTwo(String name, String description, int price, boolean allincluded) {
        super(name,description,price);
        if (allincluded == true){
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

    public SemiLuxTwo(String name, String description, int price, int basePrice, int breakfastPrice, int lunchPrice, int dinerPrice, int barPrice, int poolPrice, int seaViewBalconyPrice, int tvPrice, int premiumWifiPrice) {
        super(name, description, price);
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
        return "SemiLuxTwo{" +
                super.toString() +
                "basePrice=" + basePrice +
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
    public int getTotalPrice() {
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
