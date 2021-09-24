package bus;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Menu {
    Menu() throws IOException {

        Scanner input = new Scanner(System.in);
        // USE CALENDAR FOR FIND TOMORROW'S DATE
        Calendar calendar = Calendar.getInstance();

        Date today = calendar.getTime(); // TODAY'S DATE
        calendar.add(Calendar.DAY_OF_YEAR, 1); // CONVERTING TOMORROW'S DATE
        Date tomorrow = calendar.getTime();

        System.out.println("Wellcome to our service!");

        System.out.println("We are provide ticket booking service only for next day\n");

        System.out.println("Today is: "+today);
        System.out.println("You can Book ticket for : "+tomorrow+" ");


        System.out.print("\nAre you you Book ticket (Y/N): ");
        String ch = input.nextLine();

        if(ch.equals("Y")){
            Buses buses = new Buses();
        }
        else{
            return;
        }

    }
}
