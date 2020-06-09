package com.company;

import java.util.*;
import java.util.stream.Collectors;


//склад кави
public class CoffeeStorage implements Cloneable{

   private List<Coffee> availableCoffee = new ArrayList<>();


    public void addCoffeeToStorage(Coffee coffee) {
        this.availableCoffee.add(coffee);
    }


    public void loadCoffeeToTheVan(int price, Van van) throws CloneNotSupportedException {

  double priceForEveryCoffee = price/this.availableCoffee.size();

        for (Coffee coffee: this.availableCoffee
             ) {


            Coffee tmpCoffee = (Coffee)coffee.clone();
            double kgFromCoffee = priceForEveryCoffee/coffee.getPriceKg();
            tmpCoffee.setWeightInKg(kgFromCoffee);
            van.addCoffeeToVan(tmpCoffee);
            coffee.setWeightInKg(coffee.getWeightInKg()-kgFromCoffee);

        }



    }


    public List<Coffee> sortedCoffeeByPriceAndWeight(){

        return this.availableCoffee.stream().sorted((o1, o2) -> {
            if (o1.getPriceKg()*o1.getWeightInKg()>o2.getPriceKg()*o2.getWeightInKg()){
                return 1;
            }else  if (o1.getPriceKg()*o1.getWeightInKg()<o2.getPriceKg()*o2.getWeightInKg()) {
            return -1;
            }else return 0;

    }).collect(Collectors.toList());
    }


    public List<Coffee> getAvailableCoffee() {
        return availableCoffee;
    }

    public void setAvailableCoffee(List<Coffee> availableCoffee) {
        this.availableCoffee = availableCoffee;
    }

    private int getAmountOfDifferentTypeOfCoffee() {
        return this.availableCoffee.size();
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CoffeeStorage{");
        sb.append("availableCoffee=").append(availableCoffee);
        sb.append('}');
        return sb.toString();
    }
}
