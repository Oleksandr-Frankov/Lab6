package com.company;

public class GroundCoffee extends Coffee {


    private final double WEIGHT_OF_PACKAGING=0.7;

    public GroundCoffee(String name,int weight,int price,int coffeeQuality){
        this.setName(name);
        this.setWeightInKg(weight+WEIGHT_OF_PACKAGING);
        this.setPriceKg(price);
        this.setCoffeeQuality(coffeeQuality);
    }


}
