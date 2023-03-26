package Service;

public class Barista {

    private CoffeeMachine coffeeMachine;

    public void WorkBarista(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public void startWork() {
        coffeeMachine.prepareCoffee();
    }
}
