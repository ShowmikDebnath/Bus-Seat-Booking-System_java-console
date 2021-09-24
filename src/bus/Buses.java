package bus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Buses{

    Buses() throws IOException {

        Buses.info();
    }


    public static void info() throws IOException {

        // AVAILABLE SEAT NUMBER DECLARATION
        int available1 = 30, available2 = 30, available3 =30, available4 = 30, available5 = 30, available6 = 30;
        Buses.booking(available1, available2, available3, available4, available5, available6);

    }

    public static void booking(int available1, int available2, int available3, int available4, int available5, int available6) throws IOException {
        Scanner input = new Scanner(System.in);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        // SHOW ROOT, PRICE AND AVVAILABLE SEAT INFO
        System.out.println();
        System.out.println("\t   Root      \t\t\tPrice\t\t\tAvailable sit");
        System.out.println("1. Dhaka-Sylhet        \t\t\t420\t\t\t"+available1);
        System.out.println("2. Sylhet-Dhaka        \t\t\t420\t\t\t"+available2);
        System.out.println("3. Chattagram-Sylhet   \t\t\t420\t\t\t"+available3);
        System.out.println("4. Sylhet-Chattagram   \t\t\t420\t\t\t"+available4);
        System.out.println("5. Dhaka-Chattagram    \t\t\t420\t\t\t"+available5);
        System.out.println("6. Chattagram-Dhaka    \t\t\t420\t\t\t"+available6);
        System.out.println("7. Exit");

        System.out.print("\nEnter your Destination : ");
        int n=input.nextInt();


        // CHOOSE A ROOT, TAKE REQUIRED INFO
        System.out.println();
        int number;
        int pessNum;
        if(n==1){
            System.out.print("Enter your Name: ");
            String name = in.readLine();
            System.out.print("Enter your Mobile number: ");
            number = input.nextInt();
            System.out.print("How Many pessenger are you?: ");
            pessNum=input.nextInt();

            System.out.println();
            if(pessNum<=available1){ // SEAT AVAILABLE CHECK
                System.out.println("Pessenger details");
                System.out.println("Pessenger Name: "+name);
                System.out.println("Pessenger Mobile Number: "+number);
                System.out.println("Destination: Dhaka-Sylhet");
                System.out.println("Pessenger : "+pessNum);
                System.out.println("Fare: 420");
                System.out.println("Total Fare: "+(pessNum*420));

                System.out.print("\nAre you confirm your ticket (Y/N): ");
                String ch = in.readLine();

                if(ch.equals("Y")){
                    available1 = available1-pessNum; // SEAT INFO UPDATED
                    //System.out.println("******"+available1);
                    // CALL PAYMENT CLASS
                    Payment payment = new Payment(name, "Dhaka to Sylhet", 420, pessNum, (pessNum*420), available1, available2, available3, available4, available5, available6);
                }
            }
            else{
                System.out.println("Sorry! We do not have "+pessNum+" Seat! \n We have "+available1+ " Seat"); // SHOW MASSAGE IF SEAT ARE NOT AVAILABLE
            }
        }
        // SAME WORK AS CHOOSE 1, FOR 2-6)
        else if(n==2){
            System.out.print("Enter your Name: ");
            String name = in.readLine();
            System.out.print("Enter your Mobile number: ");
            number = input.nextInt();
            System.out.print("How Many pessenger are you?: ");
            pessNum=input.nextInt();

            System.out.println();
            if(pessNum<=available2){
                System.out.println("Pessenger details");
                System.out.println("Pessenger Name: "+name);
                System.out.println("Pessenger Mobile Number: "+number);
                System.out.println("Destination: Sylhet-Dhaka");
                System.out.println("Pessenger : "+pessNum);
                System.out.println("Fare: 420");
                System.out.println("Total Fare: "+(pessNum*420));

                System.out.print("\nAre you confirm your ticket (Y/N): ");
                String ch = in.readLine();

                if(ch.equals("Y")){
                    available2 = available2-pessNum;
                    //System.out.println("******"+available1);
                    Payment payment = new Payment(name, "Dhaka to Sylhet", 420, pessNum, (pessNum*420), available1, available2, available3, available4, available5, available6);
                }
            }
            else{
                System.out.println("Sorry! We do not have "+pessNum+" Seat! \n We have "+available2+ " Seat");
            }
        }
        else if(n==3){
            System.out.print("Enter your Name: ");
            String name = in.readLine();
            System.out.print("Enter your Mobile number: ");
            number = input.nextInt();
            System.out.print("How Many pessenger are you?: ");
            pessNum=input.nextInt();

            System.out.println();
            if(pessNum<=available3){
                System.out.println("Pessenger details");
                System.out.println("Pessenger Name: "+name);
                System.out.println("Pessenger Mobile Number: "+number);
                System.out.println("Destination: Chattagram-Sylhet");
                System.out.println("Pessenger : "+pessNum);
                System.out.println("Fare: 420");
                System.out.println("Total Fare: "+(pessNum*420));

                System.out.println("\nAre you confirm your ticket (Y/N): ");
                String ch = in.readLine();

                if(ch.equals("Y")){
                    available3 = available3-pessNum;
                    //System.out.println("******"+available1);
                    Payment payment = new Payment(name, "Dhaka to Sylhet", 420, pessNum, (pessNum*420), available1, available2, available3, available4, available5, available6);
                }
            }
            else{
                System.out.println("Sorry! We do not have "+pessNum+" Seat! \n We have "+available3+ " Seat");
            }

        }
        else if(n==4){
            System.out.print("Enter your Name: ");
            String name = in.readLine();
            System.out.print("Enter your Mobile number: ");
            number = input.nextInt();
            System.out.print("How Many pessenger are you?: ");
            pessNum=input.nextInt();

            System.out.println();
            if(pessNum<=available4){
                System.out.println("Pessenger details");
                System.out.println("Pessenger Name: "+name);
                System.out.println("Pessenger Mobile Number: "+number);
                System.out.println("Destination: Sylhet-Chattagram");
                System.out.println("Pessenger : "+pessNum);
                System.out.println("Fare: 420");
                System.out.println("Total Fare: "+(pessNum*420));

                System.out.println("\nAre you confirm your ticket (Y/N): ");
                String ch = in.readLine();

                if(ch.equals("Y")){
                    available4 = available4-pessNum;
                    //System.out.println("******"+available1);
                    Payment payment = new Payment(name, "Dhaka to Sylhet", 420, pessNum, (pessNum*420), available1, available2, available3, available4, available5, available6);
                }
            }
            else{
                System.out.println("Sorry! We do not have "+pessNum+" Seat! \n We have "+available4+ " Seat");
            }
        }
        else if(n==5){
            System.out.print("Enter your Name: ");
            String name = in.readLine();
            System.out.print("Enter your Mobile number: ");
            number = input.nextInt();
            System.out.print("How Many pessenger are you?: ");
            pessNum=input.nextInt();

            System.out.println();
            if(pessNum<=available5){
                System.out.println("Pessenger details");
                System.out.println("Pessenger Name: "+name);
                System.out.println("Pessenger Mobile Number: "+number);
                System.out.println("Destination: Dhaka-Chattagram");
                System.out.println("Pessenger : "+pessNum);
                System.out.println("Fare: 420");
                System.out.println("Total Fare: "+(pessNum*420));

                System.out.print("\nAre you confirm your ticket (Y/N): ");
                String ch = in.readLine();

                if(ch.equals("Y")){
                    available5 = available5-pessNum;
                    //System.out.println("******"+available1);
                    Payment payment = new Payment(name, "Dhaka to Sylhet", 420, pessNum, (pessNum*420), available1, available2, available3, available4, available5, available6);
                }
            }
            else{
                System.out.println("Sorry! We do not have "+pessNum+" Seat! \n We have "+available5+ " Seat");
            }
        }
        else if(n==6){
            System.out.print("Enter your Name: ");
            String name = in.readLine();
            System.out.print("Enter your Mobile number: ");
            number = input.nextInt();
            System.out.print("How Many pessenger are you?: ");
            pessNum=input.nextInt();

            System.out.println();
            if(pessNum<=available6){
                System.out.println("Pessenger details");
                System.out.println("Pessenger Name: "+name);
                System.out.println("Pessenger Mobile Number: "+number);
                System.out.println("Destination: Chattagram-Dhaka");
                System.out.println("Pessenger : "+pessNum);
                System.out.println("Fare: 420");
                System.out.println("Total Fare: "+(pessNum*420));


                System.out.println("\nAre you confirm your ticket (Y/N): ");
                String ch = in.readLine();

                if(ch.equals("Y")){
                    available6 = available6-pessNum;
                    //System.out.println("******"+available1);
                    Payment payment = new Payment(name, "Dhaka to Sylhet", 420, pessNum, (pessNum*420), available1, available2, available3, available4, available5, available6);
                }
            }
            else{
                System.out.println("Sorry! We do not have "+pessNum+" Seat! \n We have "+available6+ " Seat");
            }
        }
        // IF CHOOSE EXIT
        else if(n==7){
            return;
        }
        // IF CHOOSE OUT OF THE RANG (1-7)
        else{
            System.out.print("Please Enter valid Number(1-7): ");
            Buses.booking(available1, available2, available3, available4 ,available5, available6);
        }
    }
    


}
