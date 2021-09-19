package bus;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Buses{

    Buses()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Destination");
        System.out.println("2. Pessenger");
        System.out.println("3. Billing Details");
        System.out.println("4. Exit");

        int n = input.nextInt();

        switch (n){
            case 1:
                Destination destination = new Destination();
                break;
            case 2:
                Pessenger pessenger = new Pessenger();
                break;
            case 3:
                Payment payment = new Payment();
                break;
            case 4:
                return;
            default:
                System.out.println("Enter Valid number");

        }
    }

}
