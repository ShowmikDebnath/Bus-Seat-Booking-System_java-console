package bus;

import java.io.IOException;
import java.util.Scanner;

public class Payment {

    String Name;
    String Destination;
    double fare;
    int pesenger;
    double totalPrice;
    int available1;
    int available2;

    // FOR PAYMENT CONFIRM, REQUIRED INFO PASS FORM THE BUSES CLASS
    Payment(String Name, String Destination, double fare, int pesenger, double totalPrice, int available1, int available2, int available3, int available4, int available5, int available6) throws IOException {
        Scanner input = new Scanner(System.in);
        this.Name = Name;
        this.Destination = Destination;
        this.fare = fare;
        this.pesenger = pesenger;
        this.totalPrice = totalPrice;
        this.available1 = available1;
        this.available2 = available2;

        System.out.println();
        System.out.println("Paseenger Details");
        System.out.println("Passenger Name: "+this.Name);
        System.out.println("Passenger Destination: "+this.Destination);
        System.out.println("Fare : "+this.fare);
        System.out.println("No of Passenger : "+this.pesenger);
        System.out.println("Total Fare: "+this.totalPrice);


        // CHOOSE PAYMENT METHOD (MOBILE BAKING)
        System.out.println();
        System.out.println("Please Payment Confirm by - ");
        System.out.println("1. Bkash ");
        System.out.println("2. Nagad ");
        System.out.println("3. Rocket ");

        System.out.print("\nEnter your Choose: ");
        int n = input.nextInt();

        if(n==1){
            Payment.BKash(available1, available2, available3, available4, available5, available6);
        }
        else if(n==2){
            Payment.Nagad(available1, available2, available3, available4, available5, available6);
        }
        else if(n==3){
            Payment.Rocket(available1, available2, available3, available4, available5, available6);
        }

    }

    // FOR BKASH PAYMENT

    public static void BKash(int available1, int available2, int available3, int available4, int available5, int available6) throws IOException {
        System.out.println();
        String trns;
        Scanner input = new Scanner(System.in);
        System.out.println("Please pay x value in +8801987654321 number - ");
        System.out.print("Enter the Trancigtion number: ");
        trns = input.nextLine();

        // AFTER PAYMENT, SHOW A FINAL MASSAGE AND GO TO THE MAIN MENU
        System.out.println("\n***** Thank you for taking our service! *****");
        System.out.println("We will send your ticket in your mobile phone vai SMS soon!");
        System.out.println("Happy Journey");
        //Buses.info();
        System.out.print("\nAre you Book more ticket? (Y/N): ");
        String ch = input.nextLine();

        if(ch.equals("Y")){
            Buses.booking(available1, available2, available3, available4, available5, available6);
        }
        else{
            return;
        }
    }

    // FOR NAGAD PAYMENT
    public static void Nagad(int available1, int available2, int available3, int available4, int available5, int available6) throws IOException {
        System.out.println();
        String trns;
        Scanner input = new Scanner(System.in);
        System.out.println("Please pay x value in +8801987654321 number - ");
        System.out.print("Enter the Trancigtion number: ");
        trns = input.nextLine();

        // AFTER PAYMENT, SHOW A FINAL MASSAGE AND GO TO THE MAIN MENU
        System.out.println("\n***** Thank you for taking our service! *****");
        System.out.println("We will send your ticket in your mobile phone vai SMS soon!");
        System.out.println("Happy Journey");
        //Buses.info();
        System.out.print("\nAre you Book more ticket? (Y/N): ");
        String ch = input.nextLine();

        if(ch.equals("Y")){
            Buses.booking(available1, available2, available3, available4, available5, available6);
        }
        else{
            return;
        }
    }

    // FOR ROCJET PAYMENT
    public static void Rocket(int available1, int available2, int available3, int available4, int available5, int available6) throws IOException {
        System.out.println();
        String trns;
        Scanner input = new Scanner(System.in);
        System.out.println("Please pay x value in +88019876543211 number - ");
        System.out.print("Enter the Trancigtion number: ");
        trns = input.nextLine();

        // AFTER PAYMENT, SHOW A FINAL MASSAGE AND GO TO THE MAIN MENU
        System.out.println("\n***** Thank you for taking our service! ******");
        System.out.println("We will send your ticket in your mobile phone vai SMS soon!");
        System.out.println("Happy Journey");
        //Buses.info();
        System.out.print("\nAre you Book more ticket? (Y/N): ");
        String ch = input.nextLine();

        if(ch.equals("Y")){
            Buses.booking(available1, available2, available3, available4, available5, available6);
        }
        else{
            return;
        }


    }

}
//nabila