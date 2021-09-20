package bus;

import java.util.Scanner;

public class Destination {

    Destination()
    {
        Destination.sitInfo();
    }

    public static void sitInfo()
    {
        String user, pass, yn, search, again, choice;
        int to=0, y=1, z=0, end=0, r=1;

        int available[] = new int[7];
        int ticketI[][] = new int[100][3];
        String ticketS[][] = new String[100][3];
        double ticketD[][] = new double[100][3];



        for(int i=1; i<=6; i++){
            available[i] = 30;
        }
        Scanner input = new Scanner(System.in);
        System.out.println("\t   Root      \t\t\tPrice\t\t\tAvailable sit");
        System.out.println("1. Dhaka-Sylhet        \t\t\t420\t\t\t"+available[1]);
        System.out.println("2. Sylhet-Dhaka        \t\t\t420\t\t\t"+available[2]);
        System.out.println("3. Chattagram-Sylhet   \t\t\t420\t\t\t"+available[3]);
        System.out.println("4. Sylhet-Chattagram   \t\t\t420\t\t\t"+available[4]);
        System.out.println("5. Dhaka-Chattagram    \t\t\t420\t\t\t"+available[5]);
        System.out.println("6. Chattagram-Dhaka    \t\t\t420\t\t\t"+available[6]);

        if((available[1]==0) && (available[2]==0) && (available[3]==0) && (available[4]==0) && (available[5]==0) && (available[6]==0)){
            System.out.println("Sorry, We don't have available seats for all Destination!");
            int x=0;
        }


    }
}
