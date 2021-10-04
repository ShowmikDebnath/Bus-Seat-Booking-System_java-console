package bus;
import java.util.Scanner;
public class Payment{
    Scanner sc = new Scanner(System.in);
    String destination;
    int seat;
    int taka;
    int confirm;
    boolean flag = false;

    Payment(String destination, int seat, int taka){
        Scanner input = new Scanner(System.in);
        this.destination = destination;
        this.seat = seat;
        this.taka = taka;

        System.out.println("Please select a payment Method: ");
        System.out.println("1. Bkash");
        System.out.println("2. Nagad");
        System.out.println("3. Rocket");

        System.out.print("Enter your Choose (1-3): "); // Payment Option Select
        int n = input.nextInt();

        if(n==1) {
            Scanner in = new Scanner(System.in);
            System.out.println("Please Pay BDT "+this.taka + " on +880 1987654321");
            System.out.print("Enter the Transaction Number: ");
            String str = in.nextLine();

            System.out.println("Thank you! Your ticket is booked.");
            System.out.println("We will send your ticket throuh your mobile phone vai SMS.");

            flag = true;

        }
        else if(n==2){
            Scanner in = new Scanner(System.in);
            System.out.println("Please Pay BDT "+this.taka + " on +880 1987654321");
            System.out.print("Enter the Transaction Number: ");
            String str = in.nextLine();

            System.out.println("Thank you! Your ticket is booked.");
            System.out.println("We will send your ticket throuh your mobile phone vai SMS.");

            flag = true;

        }
        else if(n==3){
            Scanner in = new Scanner(System.in);
            System.out.println("Please Pay BDT "+this.taka + " on +880 19876543211");
            System.out.print("Enter the Transaction Number: ");
            String str = in.nextLine();

            System.out.println("Thank you! Your ticket is booked.");
            System.out.println("We will send your ticket throuh your mobile phone vai SMS.");

            flag = true;
        }


    }
    Payment(){
        this.confirm = 1; // if payment is complete pass 1 to main class

    }

}
