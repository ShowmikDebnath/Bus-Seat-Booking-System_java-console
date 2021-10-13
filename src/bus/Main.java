package bus;
import java.util.*;
import java.text.*;

public class Main
{
    
        static void Login_display(){
            System.out.println("*************************");
            System.out.println("1. Sign up");
            System.out.println("2. Log in");
            System.out.println("3. Sign out");
            System.out.println("4. All information of our service ");
            System.out.println("5. Exit");
        }
        static void Admin_display(){
            System.out.println("View history and All information:");
            System.out.println("**********************************************");
            System.out.println("1. All registared member's information:");
            System.out.println("2. All information of seat booking: ");
            System.out.println("3. All information delete: ");
            System.out.println("4. Change the fare of roots");
            System.out.println("5. Change password");
            System.out.println("6. Exit");
            System.out.println("**********************************************");
        }
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Main main = new Main();
        Admin admin_object = new Admin();
        
        String SD = admin_object.SD;
        String DS = admin_object.DS;
        String SC = admin_object.SC;
        String CS = admin_object.CS;
        String DC = admin_object.DC;
        String CD = admin_object.CD;
        
        // vector declearation
        Vector<String> name = new Vector<>();                       // registration Vector
        Vector<String> password = new Vector<>();
        Vector<String> realName = new Vector<>();
        Vector<String> phone = new Vector<>();
                                                                    // seat booker information storing
        Vector<String> pass_Name = new Vector<>();
        Vector<String> pass_password = new Vector<>();
        Vector<String> pass_realName = new Vector<>();
        Vector<String> pass_phone = new Vector<>();
        Vector<String> pass_date = new Vector<>();
        Vector<String> destination = new Vector<>();
        Vector<Integer> seat = new Vector<>();
        Vector<Integer> taka = new Vector<>();
        Vector<String> Time = new Vector<>();

        int Bus_seat[]=new int[31];     // for bus seat
        for(int i:Bus_seat){ Bus_seat[i] = 0; }   // all bus seat initializing 0 seat
        Bus_seat[1] = 4;
        
        // all element declearation

        // registration Vector

        name.add("Roni");
        name.add("Showmik");
        name.add("Mithila");
        name.add("Nabila");

        password.add("454545");
        password.add("676767");
        password.add("232323");
        password.add("898989");

        realName.add("Roni Acharjee");
        realName.add("Showmik Debnath");
        realName.add("Mithila Talukdar");
        realName.add("Nabila Zannath");

        phone.add("01959239908");
        phone.add("01765636035");
        phone.add("01729404135");
        phone.add("01700940686");

        // log in Vector
        pass_Name.add(name.get(0));
        pass_Name.add(name.get(1));
        pass_Name.add(name.get(2));
        pass_Name.add(name.get(3));

        pass_password.add(password.get(0));
        pass_password.add(password.get(1));
        pass_password.add(password.get(2));
        pass_password.add(password.get(3));

        pass_realName.add(realName.get(0));
        pass_realName.add(realName.get(1));
        pass_realName.add(realName.get(2));
        pass_realName.add(realName.get(3));

        pass_phone.add(phone.get(0));
        pass_phone.add(phone.get(1));
        pass_phone.add(phone.get(2));
        pass_phone.add(phone.get(3));

        pass_date.add(admin_object.date1);
        pass_date.add(admin_object.date1);
        pass_date.add(admin_object.date1);
        pass_date.add(admin_object.date1);

        destination.add("Sy->Dh");
        destination.add("Sy->Dh");
        destination.add("Sy->Dh");
        destination.add("Sy->Dh");

        seat.add(1);
        seat.add(1);
        seat.add(1);
        seat.add(1);

        taka.add(470);
        taka.add(470);
        taka.add(470);
        taka.add(470);
        
        Time.add(admin_object.time11);
        Time.add(admin_object.time11);
        Time.add(admin_object.time11);
        Time.add(admin_object.time11);

        for (int i = 0; i == 0 ; ){
            System.out.println("Registered people : "+ name.size());
            System.out.println("Booked seats      : "+ seat.size());
            
            Login_display();        // choice sign up , log in , log out , exit
            System.out.print("Press a number between 1 to 5: "); int user = sc.nextInt();
            System.out.println("*************************\n");


            if (user == 1){                                                 // registration
                String x = sc.nextLine();                               // ajaira ekta input na dile kaz kore na
                System.out.print("User name ( new user name )      : "); String userName = sc.nextLine(); // username
                System.out.print("Password ( minimum 6 character ) : "); String pass = sc.nextLine();      // Password


                String name_temp = ""; String pass_temp = "";           // declear the temp in null


                int size = name.size();                                     // Vector size declearation

                for (int j = 0; j < size ; j++ ){
                    if(userName.equals(name.get(j)) && userName.equals("admin")){                     // If there is a match with userName to other user name , it will be not registerd
                        System.out.println("\n\t\t\t\t\t\t\tPlease enter a new user name. This is used by other. You are not registared\n");
                        name_temp = userName;                            // if there is any mathch , the matched information will store in name_temp
                    }
                }
                if(pass.length()<6){                                // password should have minimum 6 character or it will be store in pass_temp
                    System.out.println("\n\t\t\t\t\t\t\tYour password should have minimum six character. You are not registared\n");
                    pass_temp = pass;
                }
                else if( name_temp.equals("") && pass_temp.equals("") ){     // if name_temp and pass_temp remains null then it will registared


                    System.out.print("Real name: "); 
                    String realname = sc.nextLine();     // Real name enter
                    System.out.print("Phone: 01");     
                    String ph = sc.nextLine();           // Phone enter
                    
                    if(ph.length() == 9){
                        if ( (ph.charAt(0) == '0' || ph.charAt(0) == '1' || ph.charAt(0) == '2' || ph.charAt(0) == '3' || ph.charAt(0) == '4'
                        || ph.charAt(0) == '5' || ph.charAt(0) == '6' || ph.charAt(0) == '7' || ph.charAt(0) == '8' || ph.charAt(0) == '9' ) &&
                        
                        (ph.charAt(1) == '0' || ph.charAt(1) == '1' || ph.charAt(1) == '2' || ph.charAt(1) == '3' || ph.charAt(1) == '4'
                        || ph.charAt(1) == '5' || ph.charAt(1) == '6' || ph.charAt(1) == '7' || ph.charAt(1) == '8' || ph.charAt(1) == '9' ) &&
                        
                        (ph.charAt(2) == '0' || ph.charAt(2) == '1' || ph.charAt(2) == '2' || ph.charAt(2) == '3' || ph.charAt(2) == '4'
                        || ph.charAt(2) == '5' || ph.charAt(2) == '6' || ph.charAt(2) == '7' || ph.charAt(2) == '8' || ph.charAt(2) == '9' ) &&
                        
                        (ph.charAt(3) == '0' || ph.charAt(3) == '1' || ph.charAt(3) == '2' || ph.charAt(3) == '3' || ph.charAt(3) == '4'
                        || ph.charAt(3) == '5' || ph.charAt(3) == '6' || ph.charAt(3) == '7' || ph.charAt(3) == '8' || ph.charAt(3) == '9' ) &&
                        
                        (ph.charAt(4) == '0' || ph.charAt(4) == '1' || ph.charAt(4) == '2' || ph.charAt(4) == '3' || ph.charAt(4) == '4'
                        || ph.charAt(4) == '5' || ph.charAt(4) == '6' || ph.charAt(4) == '7' || ph.charAt(4) == '8' || ph.charAt(4) == '9' ) &&
                        
                        (ph.charAt(5) == '0' || ph.charAt(5) == '1' || ph.charAt(5) == '2' || ph.charAt(5) == '3' || ph.charAt(5) == '4'
                        || ph.charAt(5) == '5' || ph.charAt(5) == '6' || ph.charAt(5) == '7' || ph.charAt(5) == '8' || ph.charAt(5) == '9' ) &&
                        
                        (ph.charAt(6) == '0' || ph.charAt(6) == '1' || ph.charAt(6) == '2' || ph.charAt(6) == '3' || ph.charAt(6) == '4'
                        || ph.charAt(6) == '5' || ph.charAt(6) == '6' || ph.charAt(6) == '7' || ph.charAt(6) == '8' || ph.charAt(6) == '9' ) &&
                        
                        (ph.charAt(7) == '0' || ph.charAt(7) == '1' || ph.charAt(7) == '2' || ph.charAt(7) == '3' || ph.charAt(7) == '4'
                        || ph.charAt(7) == '5' || ph.charAt(7) == '6' || ph.charAt(7) == '7' || ph.charAt(7) == '8' || ph.charAt(7) == '9' ) &&
                        
                        (ph.charAt(8) == '0' || ph.charAt(8) == '1' || ph.charAt(8) == '2' || ph.charAt(8) == '3' || ph.charAt(8) == '4'
                        || ph.charAt(8) == '5' || ph.charAt(8) == '6' || ph.charAt(8) == '7' || ph.charAt(8) == '8' || ph.charAt(8) == '9' ) 
                        )
                        {
                            String full_number = "01" + ph;
                            name.add(userName);
                            password.add(pass);
                            realName.add(realname);
                            phone.add(full_number);

                            System.out.println("\n\t\t\t\t\t\t\tYou are registared\n");

                            System.out.println("\n\nUser name  : "+name.get(size));
                            System.out.println("Password   : "+password.get(size));
                            System.out.println("Real name  : "+realName.get(size));
                            System.out.println("Phone      : "+phone.get(size));
                            System.out.println("\n");
                        } //ph.length() == 9
                        else{
                            System.out.println("Please entered a valid number. You are not registerd.");
                        }
                    } // if(ph.length() == 9)
                    else{
                        System.out.println("You entered a wrong number. You are not registared.");
                    }
                    
                    name_temp = "";                                         // name_temp and pass_temp should be changed in null
                    pass_temp = "";
                }   // else if( name_temp.equals("") && pass_temp.equals("") )
            }  //user == 1

            else if(user == 2){                                            // log in
                String y = sc.nextLine();
                System.out.print("User name: ");  String name2 = sc.nextLine();
                System.out.print("password: ");   String pass2 = sc.nextLine();

                String temp_name2 = "" ; String temp_pass2 = "";
                int size3 = name.size();
                
                Admin_pass newpass1 = new Admin_pass("2");

                if( (name2.equals("a") && (pass2.equals(newpass1.admin_pass_real))) ){                  // admin log in
                    main.Admin_display();       // admin's option

                    for (int again = 0; again == 0; ){
                        System.out.print("Admin's choice: "); int admin_choice = sc.nextInt(); //admin choice
                        System.out.println("**********");

                        if(admin_choice == 1){                                                   // Passenger information
                            //for (int p = 0; p < size3 ; p++ ){
                            for (int p = 0; p < name.size() ; p++ ){
                                System.out.println( "Member"+(p+1) + "----" + realName.get(p)+ "----" + phone.get(p) );
                            }
                        }
                        else if(admin_choice == 2){                                             // passenger economical information
                            System.out.println(" Passenger--------date----destinition---seat--taka---user name");
                            for (int a = 0; a < seat.size() ; a++ ){
                                System.out.println( "Passenger"+(a+1) + "----" + pass_date.get(a) + "----" + destination.get(a) + "------" + seat.get(a) + "----" + taka.get(a) + "----" + pass_Name.get(a));
                            }
                            System.out.println("\nseat size = " + seat.size());               // size of seat Vector
                        }

                        else if(admin_choice == 3){
                            System.out.println("Do you want to delete all information\n 1. Yes \n 2. not");
                            int add_all_delete = sc.nextInt();
                            if(add_all_delete == 1){
                                System.out.println("You cleared all information");             // delete all information from register list
                                name.clear();
                                password.clear();
                                realName.clear();
                                phone.clear();

                                pass_Name.clear();
                                pass_password.clear();
                                pass_realName.clear();
                                pass_phone.clear();
                                pass_date.clear();
                                destination.clear();
                                seat.clear();
                                taka.clear();
                                Time.clear();
                            }
                            else{
                                System.out.println("OK");
                            }
                        }
                        else if(admin_choice==4){                           // Admin change information
                            Admin admin_change = new Admin("choice");
                        }
                        
                        else if(admin_choice==5){                           // password change for admin
                            Admin_pass newpass = new Admin_pass();
                        }
                        
                        else if(admin_choice==6){
                            break;
                        }
                        
                        else{
                            System.out.println("\t\t\t\t\t\t\tPlease enter a valid number ");
                        }

                        main.Admin_display();       // admin's option
                    }
                }
                else{                                                           // Passenger seat booking
                    for(int j = size3-1; j>=0; j--){                            // this for searching if there is matched in user name and password then all function will execute
                        if(name2.equals(name.get(j)) && pass2.equals(password.get(j))){
                            System.out.println("You are registared");
                            temp_name2 = name2;
                            temp_pass2 = pass2;

                            System.out.println("Your user name   :" + name.get(j));  // all information print
                            System.out.println("Your password    :" + password.get(j));
                            System.out.println("Your real name   :" + realName.get(j));
                            System.out.println("Your phone       :" + phone.get(j));
                            System.out.println("\n");

                            for (int pass_again=0; pass_again==0 ; ) {

                                System.out.println("\nDo you want to buy tickets?\n 1. Yes \n 2. No");
                                int buy_ticket = sc.nextInt();
                                
                            if(buy_ticket == 1){
                                System.out.println("When you want to go :");
                                System.out.println("1. "+admin_object.date1);
                                System.out.println("2. "+admin_object.date2);
                                System.out.println("3. "+admin_object.date3);
                                System.out.println("4. "+admin_object.date4);
                                System.out.println("5. "+admin_object.date5);
                                System.out.println("6. Log out");

                                System.out.print("Enter date between 1 to 6: "); int user_date = sc.nextInt();

                                String object_date = "";
                                String object_bus  = "";
                                int object_seat    = 0 ;
                                int object_taka    = 0 ;
                                String object_time = "";



                                if (user_date == 1){

                                    Date1 d1 = new Date1(admin_object.date1, Bus_seat[1], Bus_seat[2], Bus_seat[3], Bus_seat[4], Bus_seat[5], Bus_seat[6]
                                    , admin_object.fare11, admin_object.fare12, admin_object.fare13, admin_object.fare14, admin_object.fare15, admin_object.fare16
                                    , admin_object.time11, admin_object.time12, admin_object.time13, admin_object.time14, admin_object.time15, admin_object.time16);
                                    
                                    Payment pay = new Payment();
                                    if(pay.confirm == 1){
                                        Bus_seat[1] += d1.seat1;
                                        Bus_seat[2] += d1.seat2;
                                        Bus_seat[3] += d1.seat3;
                                        Bus_seat[4] += d1.seat4;
                                        Bus_seat[5] += d1.seat5;
                                        Bus_seat[6] += d1.seat6;
                                        object_date = admin_object.date1;
                                        object_bus = d1.destination;   // Transfer the destination (String) value from Payment class
                                        object_seat = d1.seat;         // Transfer the seat(int) value from Payment class
                                        object_taka = d1.taka;         // Transfer the taka(int) value from Payment class
                                        object_time = d1.time;
                                    }
                                    else{
                                        System.out.println("Your seat is not booked");
                                    }

                                }
                                else if(user_date == 2){

		                        Date2 d2 = new Date2(admin_object.date2, Bus_seat[6+1], Bus_seat[6+2], Bus_seat[6+3], Bus_seat[6+4], Bus_seat[6+5], Bus_seat[6+6]
		                        , admin_object.fare21, admin_object.fare22, admin_object.fare23, admin_object.fare24, admin_object.fare25, admin_object.fare26
		                        , admin_object.time21, admin_object.time22, admin_object.time23, admin_object.time24, admin_object.time25, admin_object.time26);
		                        
		                        Payment pay = new Payment();
		                        if(pay.confirm == 1){
		                            Bus_seat[6+1] += d2.seat1;
		                            Bus_seat[6+2] += d2.seat2;
		                            Bus_seat[6+3] += d2.seat3;
		                            Bus_seat[6+4] += d2.seat4;
		                            Bus_seat[6+5] += d2.seat5;
		                            Bus_seat[6+6] += d2.seat6;
		                            object_date = admin_object.date2;
		                            object_bus = d2.destination;   // Transfer the destination (String) value from Payment class
		                            object_seat = d2.seat;         // Transfer the seat(int) value from Payment class
		                            object_taka = d2.taka;         // Transfer the taka(int) value from Payment class
		                            object_time = d2.time;
		                        }
		                        else{
		                            System.out.println("Your seat is not booked");
		                        }

                                }
                                else if(user_date == 3){

		                        Date3 d3 = new Date3(admin_object.date3, Bus_seat[12+1], Bus_seat[12+2], Bus_seat[12+3], Bus_seat[12+4], Bus_seat[12+5], Bus_seat[12+6]
		                        , admin_object.fare31, admin_object.fare32, admin_object.fare33, admin_object.fare34, admin_object.fare35, admin_object.fare36
		                        , admin_object.time31, admin_object.time32, admin_object.time33, admin_object.time34, admin_object.time35, admin_object.time36);
		                        
		                        Payment pay = new Payment();
		                        if(pay.confirm == 1){
		                            Bus_seat[12+1] += d3.seat1;
		                            Bus_seat[12+2] += d3.seat2;
		                            Bus_seat[12+3] += d3.seat3;
		                            Bus_seat[12+4] += d3.seat4;
		                            Bus_seat[12+5] += d3.seat5;
		                            Bus_seat[12+6] += d3.seat6;
		                            object_date = admin_object.date3;
		                            object_bus = d3.destination;   // Transfer the destination (String) value from Payment class
		                            object_seat = d3.seat;         // Transfer the seat(int) value from Payment class
		                            object_taka = d3.taka;         // Transfer the taka(int) value from Payment class
		                            object_time = d3.time;
		                        }
		                        else{
		                            System.out.println("Your seat is not booked");
		                        }

                                }
                                else if(user_date == 4){

		                        Date4 d4 = new Date4(admin_object.date4, Bus_seat[18+1], Bus_seat[18+2], Bus_seat[18+3], Bus_seat[18+4], Bus_seat[18+5], Bus_seat[18+6]
		                        , admin_object.fare41, admin_object.fare42, admin_object.fare43, admin_object.fare44, admin_object.fare45, admin_object.fare46
		                        , admin_object.time41, admin_object.time42, admin_object.time43, admin_object.time44, admin_object.time45, admin_object.time46);
		                        
		                        Payment pay = new Payment();
		                        if(pay.confirm == 1){
		                            Bus_seat[18+1] += d4.seat1;
		                            Bus_seat[18+2] += d4.seat2;
		                            Bus_seat[18+3] += d4.seat3;
		                            Bus_seat[18+4] += d4.seat4;
		                            Bus_seat[18+5] += d4.seat5;
		                            Bus_seat[18+6] += d4.seat6;
		                            object_date = admin_object.date4;
		                            object_bus = d4.destination;   // Transfer the destination (String) value from Payment class
		                            object_seat = d4.seat;         // Transfer the seat(int) value from Payment class
		                            object_taka = d4.taka;         // Transfer the taka(int) value from Payment class
		                            object_time = d4.time;
		                        }
		                        else{
		                            System.out.println("Your seat is not booked");
		                        }

                                }
                                else if(user_date == 5){

		                        Date5 d5 = new Date5(admin_object.date5, Bus_seat[24+1], Bus_seat[24+2], Bus_seat[24+3], Bus_seat[24+4], Bus_seat[24+5], Bus_seat[24+6]
		                        , admin_object.fare51, admin_object.fare52, admin_object.fare53, admin_object.fare54, admin_object.fare55, admin_object.fare56
		                        , admin_object.time51, admin_object.time52, admin_object.time53, admin_object.time54, admin_object.time55, admin_object.time56);
		                        Payment pay = new Payment();
		                        if(pay.confirm == 1){
		                            Bus_seat[24+1] += d5.seat1;
		                            Bus_seat[24+2] += d5.seat2;
		                            Bus_seat[24+3] += d5.seat3;
		                            Bus_seat[24+4] += d5.seat4;
		                            Bus_seat[24+5] += d5.seat5;
		                            Bus_seat[24+6] += d5.seat6;
		                            object_date = admin_object.date5;
		                            object_bus = d5.destination;   // Transfer the destination (String) value from Payment class
		                            object_seat = d5.seat;         // Transfer the seat(int) value from Payment class
		                            object_taka = d5.taka;         // Transfer the taka(int) value from Payment class
		                            object_time = d5.time;
		                        }
		                        else{
		                            System.out.println("Your seat is not booked");
		                        }

                                }

                                //System.out.println("Are you sure you want to book seat na kita moja kkorray ?? ");
                                Payment pay = new Payment();
                                System.out.println(pay.confirm);
                                if(pay.confirm == 1 && object_seat > 0 && object_taka > 0){
                                    pass_Name.add(name.get(j));                         // add log in Vector
                                    pass_password.add(password.get(j));
                                    pass_realName.add(realName.get(j));
                                    pass_phone.add(phone.get(j));

                                    pass_date.add ( object_date );
                                    destination.add ( object_bus );
                                    seat.add ( object_seat );
                                    taka.add ( object_taka );
                                    Time.add ( object_time );

                                    System.out.println("You seat is booked");
                                }
                                else if(user_date==6){
                                    break;
                                }
                                else{
                                    System.out.println("Your seat is not booked");
                                }

                                //System.out.println(1+" number bus = "+Bus_seat[1]); // delete korte hobe
                                if(pay.confirm == 1 && object_seat > 0 && object_taka > 0) {
                                    System.out.println("****************************************");
                                    System.out.println("You enterd:");
                                    System.out.println("Name       : " + pass_Name.get(pass_Name.size() - 1));
                                    System.out.println("Date       : " + pass_date.get(pass_date.size() - 1));
                                    System.out.println("destination: " + destination.get(destination.size() - 1));
                                    System.out.println("Time       :" + Time.get(Time.size() - 1));
                                    System.out.println("Seat       : " + seat.get(seat.size() - 1));
                                    System.out.println("Fare       : " + taka.get(taka.size() - 1));
                                    System.out.println("****************************************/n");
                                }
                            }// if buy_ticket == 1
                            else if(buy_ticket == 2){
                                System.out.println("OK");
                                break;
                            }
                            else{
                                System.out.println("**************************************************");
                                System.out.println("Please enter 1 or 2. other wise it will not work");
                                System.out.println("**************************************************");
                            }
                                
           
                            } //pass again
                        }
                    }
                    if(temp_name2.equals("") && temp_pass2.equals("")){
                        System.out.println("\n\t\t\t\t\t\t\tYou are not registared. Please register first.\n");
                    }
                }
            }


            else if(user == 3){                                                                  // log out
                System.out.println("If you want to delete your all information deleted put your name and password");
                String z = sc.nextLine();
                System.out.print("User name  : "); String name3 = sc.nextLine();
                System.out.print("password   : "); String pass3 = sc.nextLine();

                String temp_name3 = ""; String temp_pass3 = "";

                for (int l = 0 ; l < name.size() ; l++ ) {
                    if( name3.equals(name.get(l)) && pass3.equals(password.get(l))){
                        temp_name3 = name.get(l);
                        temp_pass3 = password.get(l);

                        name.remove(l);                                                              //vec.remove(l)
                        password.remove(l);
                        realName.remove(l);
                        phone.remove(l);

                        System.out.println(name);                                                    // will remove
                        System.out.println("\n\t\t\t\t\t\t\tYour all information deleted\n");
                    }
                }
                if(temp_name3.equals("") && temp_pass3.equals("")){
                    System.out.println("\n\t\t\t\t\t\t\tYou are not registared\n");
                }
            }
            
            else if(user == 4){
                
                System.out.println("******************************************************************************");
                System.out.println("   Date       " + "  Destination     "+"   Available Seat    " + "   Time " + "            Fare \n");
                System.out.println( admin_object.date1 + "   " + SD + "       " + (30 - Bus_seat[ 1] ) + "            " + admin_object.time11 + "            " + admin_object.fare11 );
                System.out.println( admin_object.date1 + "   " + DS + "       " + (30 - Bus_seat[ 2] ) + "            " + admin_object.time12 + "            " + admin_object.fare12 );
                System.out.println( admin_object.date1 + "   " + SC + "       " + (30 - Bus_seat[ 3] ) + "            " + admin_object.time13 + "            " + admin_object.fare13 );
                System.out.println( admin_object.date1 + "   " + CS + "       " + (30 - Bus_seat[ 4] ) + "            " + admin_object.time14 + "            " + admin_object.fare14 );
                System.out.println( admin_object.date1 + "   " + DC + "       " + (30 - Bus_seat[ 5] ) + "            " + admin_object.time15 + "            " + admin_object.fare15 );
                System.out.println( admin_object.date1 + "   " + CD + "       " + (30 - Bus_seat[ 6] ) + "            " + admin_object.time16 + "            " + admin_object.fare16 + "\n");
                System.out.println( admin_object.date2 + "   " + SD + "       " + (30 - Bus_seat[ 7] ) + "            " + admin_object.time21 + "            " + admin_object.fare21 );
                System.out.println( admin_object.date2 + "   " + DS + "       " + (30 - Bus_seat[ 8] ) + "            " + admin_object.time22 + "            " + admin_object.fare22 );
                System.out.println( admin_object.date2 + "   " + SC + "       " + (30 - Bus_seat[ 9] ) + "            " + admin_object.time23 + "            " + admin_object.fare23 );
                System.out.println( admin_object.date2 + "   " + CS + "       " + (30 - Bus_seat[10] ) + "            " + admin_object.time24 + "            " + admin_object.fare24 );
                System.out.println( admin_object.date2 + "   " + DC + "       " + (30 - Bus_seat[11] ) + "            " + admin_object.time25 + "            " + admin_object.fare25 );
                System.out.println( admin_object.date2 + "   " + CD + "       " + (30 - Bus_seat[12] ) + "            " + admin_object.time26 + "            " + admin_object.fare26 + "\n");
                System.out.println( admin_object.date3 + "   " + SD + "       " + (30 - Bus_seat[13] ) + "            " + admin_object.time31 + "            " + admin_object.fare31 );
                System.out.println( admin_object.date3 + "   " + DS + "       " + (30 - Bus_seat[14] ) + "            " + admin_object.time32 + "            " + admin_object.fare32 );
                System.out.println( admin_object.date3 + "   " + SC + "       " + (30 - Bus_seat[15] ) + "            " + admin_object.time33 + "            " + admin_object.fare33 );
                System.out.println( admin_object.date3 + "   " + CS + "       " + (30 - Bus_seat[16] ) + "            " + admin_object.time34 + "            " + admin_object.fare34 );
                System.out.println( admin_object.date3 + "   " + DC + "       " + (30 - Bus_seat[17] ) + "            " + admin_object.time35 + "            " + admin_object.fare35 );
                System.out.println( admin_object.date3 + "   " + CD + "       " + (30 - Bus_seat[18] ) + "            " + admin_object.time36 + "            " + admin_object.fare36 + "\n");
                System.out.println( admin_object.date4 + "   " + SD + "       " + (30 - Bus_seat[19] ) + "            " + admin_object.time41 + "            " + admin_object.fare41 );
                System.out.println( admin_object.date4 + "   " + DS + "       " + (30 - Bus_seat[20] ) + "            " + admin_object.time42 + "            " + admin_object.fare42 );
                System.out.println( admin_object.date4 + "   " + SC + "       " + (30 - Bus_seat[21] ) + "            " + admin_object.time43 + "            " + admin_object.fare43 );
                System.out.println( admin_object.date4 + "   " + CS + "       " + (30 - Bus_seat[22] ) + "            " + admin_object.time44 + "            " + admin_object.fare44 );
                System.out.println( admin_object.date4 + "   " + DC + "       " + (30 - Bus_seat[23] ) + "            " + admin_object.time45 + "            " + admin_object.fare45 );
                System.out.println( admin_object.date4 + "   " + CD + "       " + (30 - Bus_seat[24] ) + "            " + admin_object.time46 + "            " + admin_object.fare46 + "\n");
                System.out.println( admin_object.date5 + "   " + SD + "       " + (30 - Bus_seat[25] ) + "            " + admin_object.time51 + "            " + admin_object.fare51 );
                System.out.println( admin_object.date5 + "   " + DS + "       " + (30 - Bus_seat[26] ) + "            " + admin_object.time52 + "            " + admin_object.fare52 );
                System.out.println( admin_object.date5 + "   " + SC + "       " + (30 - Bus_seat[27] ) + "            " + admin_object.time53 + "            " + admin_object.fare53 );
                System.out.println( admin_object.date5 + "   " + CS + "       " + (30 - Bus_seat[28] ) + "            " + admin_object.time54 + "            " + admin_object.fare54 );
                System.out.println( admin_object.date5 + "   " + DC + "       " + (30 - Bus_seat[29] ) + "            " + admin_object.time55 + "            " + admin_object.fare55 );
                System.out.println( admin_object.date5 + "   " + CD + "       " + (30 - Bus_seat[30] ) + "            " + admin_object.time56 + "            " + admin_object.fare56 );
                System.out.println("******************************************************************************");
            }

            else if(user == 5){                                                                             // exit
                break;
            }

            else {
                System.out.println("Please chose a number between 1 to 5 ");                            // if it is out of 1 to 4
            }
        }
    }
}