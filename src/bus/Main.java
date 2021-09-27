// i i am raigbrg
package bus;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
/*
    Login page ta pore tik kormu.........
    okhon baki kaj gula kori :)
 */
        System.out.print("Enter your Username: ");
        String username = input.nextLine();

        System.out.print("Enter Password: ");
        String pass = input.nextLine();

        if ((username.equals("1") && pass.equals("1"))) {
            //Buses buses = new Buses();
            Menu menu = new Menu();
        }


    }
}
//comment modified
