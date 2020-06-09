package com.company;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {


        //створюмо кави
        Coffee beansCoffee = new BeansCoffee("BeansCoffee", 100, 10,7);
        Coffee groundCoffee = new GroundCoffee("GroundCoffee", 10, 130,6);
        Coffee instantCoffeeInJar = new InstantCoffeeInJar("InstantCoffeeInJar", 10, 100,3);
        Coffee instantCoffeeInPackaging = new InstantCoffeeInPackaging("InstantCoffeeInPackaging", 10, 100,10);
        //створюємо склад кави
        CoffeeStorage coffeeStorage = new CoffeeStorage();

        //додаємо кави до складу
        coffeeStorage.addCoffeeToStorage(beansCoffee);
        coffeeStorage.addCoffeeToStorage(groundCoffee);
        coffeeStorage.addCoffeeToStorage(instantCoffeeInJar);
coffeeStorage.addCoffeeToStorage(instantCoffeeInPackaging);

        System.out.println(coffeeStorage.getAvailableCoffee());
        //створюємо фургон
        Van van = new Van("Фургон",500);

        //завантажуємо каву у фургон на 100грн
        coffeeStorage.loadCoffeeToTheVan(100,van);


        System.out.println("Завантажили каву на 200 грн у фургон");
        System.out.println("Кава у фургоні");
        System.out.println(van.getCoffeeList());

        System.out.println("Кава на складі після загрузки у фургон");
        System.out.println(coffeeStorage.getAvailableCoffee());
        System.out.println("Відсортована кава ");
       System.out.println(coffeeStorage.sortedCoffeeByPriceAndWeight());


        System.out.println("Знайдемо каву у фургоні , що відповідає заданому діапазонові якості  ");
        System.out.println(van.findCoffeeByQuality(5,10));
    }
}
