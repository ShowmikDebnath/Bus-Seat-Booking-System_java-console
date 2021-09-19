package bus;

import java.util.Scanner;

public class Destination {

    Destination()
    {
        Destination.sitInfo();
    }

    public static void sitInfo()
    {
        int available[] = new int[7];

        for(int i=1; i<=6; i++){
            available[i] = 30;
        }
        Scanner input = new Scanner(System.in);
        System.out.println("\t   Root      \t\t\tPrice\t\t\tAvalable sit");
        System.out.println("1. Dhaka-Sylhet        \t\t\t420\t\t\t"+available[1]);
        System.out.println("2. Sylhet-Dhaka        \t\t\t420\t\t\t"+available[2]);
        System.out.println("3. Chattagram-Sylhet   \t\t\t420\t\t\t"+available[3]);
        System.out.println("4. Sylhet-Chattagram   \t\t\t420\t\t\t"+available[4]);
        System.out.println("5. Dhaka-Chattagram    \t\t\t420\t\t\t"+available[5]);
        System.out.println("6. Chattagram-Dhaka    \t\t\t420\t\t\t"+available[6]);

        System.out.println("Enter your Chooses : ");
        int n = input.nextInt();
    }
}
