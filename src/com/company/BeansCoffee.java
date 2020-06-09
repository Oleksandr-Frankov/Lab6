package com.company;

public class BeansCoffee extends Coffee {

    private final double WEIGHT_OF_PACKAGING=0.9;

    public BeansCoffee(String name,int weight,int price,int coffeeQuality){
        this.setName(name);
        this.setWeightInKg(weight+WEIGHT_OF_PACKAGING);
        this.setPriceKg(price);
        this.setCoffeeQuality(coffeeQuality);
    }



}
