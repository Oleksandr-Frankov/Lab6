package com.company;

public class InstantCoffeeInJar extends InstantCoffee {

    private final double WEIGHT_OF_JAR=1.5;


    public InstantCoffeeInJar(String name,double weight,int price,int coffeeQuality ){
        this.setName(name);
        this.setWeightInKg(weight+WEIGHT_OF_JAR);
        this.setPriceKg(price);
        this.setCoffeeQuality(coffeeQuality);

    }
}
