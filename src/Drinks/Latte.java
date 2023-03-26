package Drinks;

import Service.CoffeeMachine;

public class Latte implements CoffeeMachine {

    @Override
    public void prepareCoffee(){
        System.out.println("Latte is preparing");
    }
}
