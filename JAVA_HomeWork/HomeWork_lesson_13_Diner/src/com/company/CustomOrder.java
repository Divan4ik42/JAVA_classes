package com.company;

public class CustomOrder implements IDinnerPayCheck {

    private String customerName;
    private int priceForChicken = 350;
    private double chickenWeight;
    private int priceForBeef = 600;
    private double beefWeight;
    private int priceForSide = 100;
    private double sideWeight;
    private int priceForTea = 25;
    private int teaCups;
    private int priceForCoffee = 40;
    private int CoffeeCups;
    private int oneLiterBeer = 70;
    private double beerGlass;

    public CustomOrder() {
    }

    public CustomOrder(String customerName, double chickenWeight, double beefWeight, double sideWeight, int teaCups, int coffeeCups, double beerGlass) {
        this.customerName = customerName;
        this.chickenWeight = chickenWeight;
        this.beefWeight = beefWeight;
        this.sideWeight = sideWeight;
        this.teaCups = teaCups;
        this.CoffeeCups = coffeeCups;
        this.beerGlass = beerGlass;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getPriceForChicken() {
        return priceForChicken;
    }

    public void setPriceForChicken(int priceForChicken) {
        this.priceForChicken = priceForChicken;
    }

    public double getChickenWeight() {
        return chickenWeight;
    }

    public void setChickenWeight(double chickenWeight) {
        this.chickenWeight = chickenWeight;
    }

    public int getPriceForBeef() {
        return priceForBeef;
    }

    public void setPriceForBeef(int priceForBeef) {
        this.priceForBeef = priceForBeef;
    }

    public double getBeefWeight() {
        return beefWeight;
    }

    public void setBeefWeight(double beefWeight) {
        this.beefWeight = beefWeight;
    }

    public int getPriceForSide() {
        return priceForSide;
    }

    public void setPriceForSide(int priceForSide) {
        this.priceForSide = priceForSide;
    }

    public double getSideWeight() {
        return sideWeight;
    }

    public void setSideWeight(double sideWeight) {
        this.sideWeight = sideWeight;
    }

    public int getPriceForTea() {
        return priceForTea;
    }

    public void setPriceForTea(int priceForTea) {
        this.priceForTea = priceForTea;
    }

    public int getTeaCups() {
        return teaCups;
    }

    public void setTeaCups(int teaCups) {
        this.teaCups = teaCups;
    }

    public int getPriceForCoffee() {
        return priceForCoffee;
    }

    public void setPriceForCoffee(int priceForCoffee) {
        this.priceForCoffee = priceForCoffee;
    }

    public int getCoffeeCups() {
        return CoffeeCups;
    }

    public void setCoffeeCups(int coffeeCups) {
        CoffeeCups = coffeeCups;
    }

    public int getOneLiterBeer() {
        return oneLiterBeer;
    }

    public void setOneLiterBeer(int oneLiterBeer) {
        this.oneLiterBeer = oneLiterBeer;
    }

    public double getBeerGlass() {
        return beerGlass;
    }

    public void setBeerGlass(double beerGlass) {
        this.beerGlass = beerGlass;
    }

    @Override
    public String toString() {
        return "CustomOrder{" +
                "customerName='" + customerName + '\'' +
//                ", priceForChicken=" + priceForChicken +
//                ", chickenWeight=" + chickenWeight +
//                ", priceForBeef=" + priceForBeef +
//                ", beefWeight=" + beefWeight +
//                ", priceForSide=" + priceForSide +
//                ", sideWeight=" + sideWeight +
//                ", priceForTea=" + priceForTea +
//                ", teaCups=" + teaCups +
//                ", priceForCoffee=" + priceForCoffee +
//                ", CoffeeCups=" + CoffeeCups +
//                ", oneLiterBeer=" + oneLiterBeer +
//                ", beerGlass=" + beerGlass +
                ", TOTAL =" + getDinnerTotalCheck() +
                '}';
    }

    @Override
    public double getDinnerTotalCheck() {
        return this.priceForChicken * this.chickenWeight + this.priceForBeef * this.beefWeight + this.priceForSide * this.sideWeight + this.priceForCoffee * this.CoffeeCups + this.priceForTea * this.teaCups + this.oneLiterBeer * this.beerGlass;
    }
}
