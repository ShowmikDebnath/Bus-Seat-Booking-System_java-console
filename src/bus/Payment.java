package bus;
import java.util.Scanner;

public class Payment{
    Scanner sc = new Scanner(System.in);
    String destination;
    int seat;
    int taka;
    int confirm;
    boolean flag = false;
    static int pass_confirm;

    Payment(String destination, int seat, int taka) {
        Scanner input = new Scanner(System.in);
        this.destination = destination;
        this.seat = seat;
        this.taka = taka;

        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t#### Are you Confirm ticket (Y/N) : ");
        String ch = input.nextLine();

        if (ch.equals("Y") || ch.equals("y")) {

            System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tPlease select a payment Method: ");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1. Bkash");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2. Nagad");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t3. Rocket");

            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\tEnter your Choose (1-3): "); // Payment Option Select
            int n = input.nextInt();

            if (n == 1) {
                Scanner in = new Scanner(System.in);
                System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t**** Please Pay BDT " + this.taka + " on +880 1987654321");
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t->\tEnter the Transaction Number: ");
                String str = in.nextLine();

                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t*************************************************************************************\n");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t*\t\t\t\t**** ~~~~ Thank you! Your ticket is booked. ~~~~ ****\t\t\t\t*");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t*\t\t~~~~ We will send your ticket through your mobile Number vai SMS. ~~~~\t\t*");
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t*************************************************************************************\n");

                flag = true;
                this.pass_confirm = 1;

            } else if (n == 2) {
                Scanner in = new Scanner(System.in);
                System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t**** Please Pay BDT " + this.taka + " on +880 1987654321");
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t->\tEnter the Transaction Number: ");
                String str = in.nextLine();

                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t*************************************************************************************\n");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t*\t\t\t\t**** ~~~~ Thank you! Your ticket is booked. ~~~~ ****\t\t\t\t*");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t*\t\t~~~~ We will send your ticket through your mobile Number vai SMS. ~~~~\t\t*");
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t*************************************************************************************\n");

                flag = true;
                this.pass_confirm = 1;

            } else if (n == 3) {
                Scanner in = new Scanner(System.in);
                System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t**** Please Pay BDT " + this.taka + " on +880 1987654321");
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t->\tEnter the Transaction Number: ");
                String str = in.nextLine();

                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t*************************************************************************************\n");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t*\t\t\t\t**** ~~~~ Thank you! Your ticket is booked. ~~~~ ****\t\t\t\t*");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t*\t\t~~~~ We will send your ticket through your mobile Number vai SMS. ~~~~\t\t*");
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t*************************************************************************************\n");

                flag = true;
                this.pass_confirm = 1;

            }

        }
        else if(ch.equals("N") || ch.equals("n")){
            this.pass_confirm = 0;
        }
        else{
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t** \tInvalid Input! \n\t\t\t\t\t\t\t\t\t\t\t\t\t-> \tPlease enter (Y/N) !");

            Payment pay = new Payment(this.destination, this.seat, this.taka); // Called the payment class
        }
    }

    Payment(){
        this.confirm = this.pass_confirm; // if payment is complete pass 1 to main class

    }

}