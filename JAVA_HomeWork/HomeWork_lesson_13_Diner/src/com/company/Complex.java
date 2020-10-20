package com.company;

public class Complex implements IDinnerPayCheck {
    private String name;
    private String option;
    private double priceForColmplex;

    public Complex() {
    }

    public Complex(String name,String option, double priceForColmplex) {
        this.name = name;
        this.option = option;
        this.priceForColmplex = priceForColmplex;
    }

    public String getName() {
        return name;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceForColmplex() {
        return priceForColmplex;
    }

    public void setPriceForColmplex(double priceForColmplex) {
        this.priceForColmplex = priceForColmplex;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "name='" + name + '\'' +
                ", option='" + option + '\'' +
                ", priceForColmplex=" + priceForColmplex +
                '}';
    }

    @Override
    public double getDinnerTotalCheck() {
        return getPriceForColmplex();
    }
}
