package com.company;
import java.util.*;
public class Van {


    private String name ;
    //вмістимість фургона у кг
   private int capacityOfTheVan;
   private List<Coffee> coffeeList = new ArrayList<>();

    public Van(String name, int capacityOfTheVan) {
        this.name = name;
        this.capacityOfTheVan = capacityOfTheVan;
    }


    public Van() {
    }


List<Coffee> findCoffeeByQuality(int from,int to){
        List<Coffee> resultList = new ArrayList<>();


    for (Coffee coffee:this.getCoffeeList()
         ) {
        if (coffee.getCoffeeQuality()>=from && coffee.getCoffeeQuality()<=to){
            resultList.add(coffee);
        }
    }
    return resultList;
}





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacityOfTheVan() {
        return capacityOfTheVan;
    }

    public void setCapacityOfTheVan(int capacityOfTheVan) {
        this.capacityOfTheVan = capacityOfTheVan;
    }




    public List<Coffee> getCoffeeList() {
        return coffeeList;
    }

    public void setCoffeeList(List<Coffee> coffeeList) {
        this.coffeeList.addAll(coffeeList);
    }

    public void addCoffeeToVan(Coffee coffee) {
        this.coffeeList.add(coffee);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Van{");
        sb.append("name='").append(name).append('\'');
        sb.append(", capacityOfTheVan=").append(capacityOfTheVan);
        sb.append(", coffeeList=").append(coffeeList);
        sb.append('}');
        return sb.toString();
    }
}
