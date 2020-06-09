package com.company;
import java.util.*;
public abstract class Coffee implements Cloneable {

    private String name;
    private double weightInKg;
    private double priceKg;
    //число від 1-10;
    private int coffeeQuality;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(double weightInKg) {
        this.weightInKg = weightInKg;
    }

    public double getPriceKg() {
        return priceKg;
    }

    public void setPriceKg(double priceKg) {
        this.priceKg = priceKg;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getCoffeeQuality() {
        return coffeeQuality;
    }

    public void setCoffeeQuality(int coffeeQuality) {
        this.coffeeQuality = coffeeQuality;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Coffee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", weightInKg=").append(weightInKg);
        sb.append(", priceKg=").append(priceKg);
        sb.append(", coffeeQuality=").append(coffeeQuality);
        sb.append('}');
        return sb.toString();
    }
}
