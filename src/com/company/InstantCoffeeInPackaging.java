package com.company;

public class InstantCoffeeInPackaging extends InstantCoffee {

private final double WEIGHT_OF_PACKAGING =1;

    public InstantCoffeeInPackaging(String name,double weight,int price,int coffeeQuality){
        this.setName(name);
        this.setWeightInKg(weight+WEIGHT_OF_PACKAGING);
        this.setPriceKg(price);
        this.setCoffeeQuality(coffeeQuality);
    }
}
