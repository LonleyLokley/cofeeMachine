import javax.xml.transform.Source;
import java.io.IOException;
import java.util.Scanner;

public class CofeeMachine {
    public void menu() {
        try (Scanner drinkScanner = new Scanner(System.in)) {
            System.out.println("Choose a drink: \n 1. Americano \n 2. Espresso \n 3. Latte");
            int drinkChoice = drinkScanner.nextInt();
            if (drinkChoice == 2) {
                Drink americano = new Drink("Espresso", 50);
                System.out.println("Enter expected temperature: ");
                int temperature = drinkScanner.nextInt();
                americano.getProduct(temperature);
            } else if (drinkChoice ==1 || drinkChoice==3){
                System.out.println("Choose a value: \n 1. 200ml \n 2. 300ml");
                int valueChice = drinkScanner.nextInt();

                if (drinkChoice == 1) {
                    System.out.println("Enter expected temperature: ");
                    int temperature = drinkScanner.nextInt();
                    if (valueChice == 1) {
                        Drink americano = new Drink("Americano", 200);
                        americano.getProduct(temperature);
                    } else if (valueChice == 2) {
                        Drink americano = new Drink("Americano", 300);
                        americano.getProduct(temperature);
                    }
                }
                if (drinkChoice == 3) {
                        if (valueChice == 1) {
                            Drink americano = new Drink("Latte", 200);
                            americano.getProduct(50);
                        } else if (valueChice == 2){
                            Drink americano = new Drink("Latte", 300);
                            americano.getProduct(50);
                        }
                }

                }

        }
         catch (Exception e) {
            System.out.println("Invalid choice \n try again");

        }
    }
}