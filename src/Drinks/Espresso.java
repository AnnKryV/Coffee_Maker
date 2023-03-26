package Drinks;

import Service.CoffeeMachine;

public class Espresso implements CoffeeMachine {

    @Override
    public void prepareCoffee(){
        System.out.println("Espresso is preparing");
    }
}
