import Drinks.Cappuccino;
import Drinks.Espresso;
import Drinks.Latte;
import Service.Barista;

import java.util.Scanner;

public class App {

    static Barista barista = new Barista();

    public static void main(String[] args) {
        Order();
    }

    public static void Order(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What coffee would you like to drink?");
        menu();

        if (scanner.hasNextInt()) {
            int order = scanner.nextInt();
            if (order == 1){
                barista.WorkBarista(new Espresso());
                barista.startWork();
                System.out.println("Your Espresso. Enjoy :)");
            } else if (order == 2) {
                barista.WorkBarista(new Cappuccino());
                barista.startWork();
                System.out.println("Your Cappuccino. Enjoy :)");
            } else if (order == 3){
                barista.WorkBarista(new Latte());
                barista.startWork();
                System.out.println("Your Latte. Enjoy :)");
            } else {
                System.out.println("I'm deeply apologise, but we don't have this option");
            }

        }else if (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println("Sorry, but you need to choose number, not  " + line);
        }
        scanner.close();
    }

    private static void menu(){
        System.out.println("""
                Choose a drink:
                     1 - Espresso
                     2 - Cappuccino
                     3 - Latte\s""");
    }
}
