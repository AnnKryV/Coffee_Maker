package Drinks;

import Service.CoffeeMachine;

public class Cappuccino implements CoffeeMachine {

    @Override
    public void prepareCoffee(){
        System.out.println("Cappuccino is preparing");
    }
}
