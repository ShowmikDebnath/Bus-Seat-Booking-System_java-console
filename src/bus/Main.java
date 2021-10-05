package bus;
import java.util.*;
import java.text.*;

public class Main
{
    String mdate0, mdate1, mdate2, mdate3, mdate4, mdate5;
    int tsd = 500;
    int tds = 500;
    int tsc = 500;
    int tcs = 500;
    int tdc = 500;
    int tcd = 500;
        
    
    Main(){

        Date mdate;
        Format formatter;
        Calendar calendar = Calendar.getInstance();

        mdate = calendar.getTime();
        formatter = new SimpleDateFormat("dd/MMM/yyyy");
        mdate0 = formatter.format(mdate);                         //date0 = today

        calendar.add(Calendar.DATE, 1);
        mdate = calendar.getTime();
        formatter = new SimpleDateFormat("dd/MMM/yyyy");
        mdate1 = formatter.format(mdate);                         //date1

        calendar.add(Calendar.DATE, 1);
        mdate = calendar.getTime();
        formatter = new SimpleDateFormat("dd/MMM/yyyy");
        mdate2 = formatter.format(mdate);                         //date2

        calendar.add(Calendar.DATE, 1);
        mdate = calendar.getTime();
        formatter = new SimpleDateFormat("dd/MMM/yyyy");
        mdate3 = formatter.format(mdate);                         //date3

        calendar.add(Calendar.DATE, 1);
        mdate = calendar.getTime();
        formatter = new SimpleDateFormat("dd/MMM/yyyy");
        mdate4 = formatter.format(mdate);                         //date4

        calendar.add(Calendar.DATE, 1);
        mdate = calendar.getTime();
        formatter = new SimpleDateFormat("dd/MMM/yyyy");
        mdate5 = formatter.format(mdate);                         //date5
        
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Main main = new Main();
        
        String date1 = main.mdate1;
        String date2 = main.mdate2;
        String date3 = main.mdate3;
        String date4 = main.mdate4;
        String date5 = main.mdate5;
        
        int tsd = 500;
        int tds = 500;
        int tsc = 700;
        int tcs = 700;
        int tdc = 300;
        int tcd = 300;
        
        String SD = "Sylhet to Dhaka      ";
        String DS = "Dhaka to Sylhet      ";
        String SC = "Sylhet to Chittagong ";
        String CS = "Chittagong to Sylhet ";
        String DC = "Dhaka to Chittagong  ";
        String CD = "Chittagong to Dhaka  ";
        
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

        pass_date.add(date1);
        pass_date.add(date1);
        pass_date.add(date1);
        pass_date.add(date1);

        destination.add("Sy->Dh");
        destination.add("Sy->Dh");
        destination.add("Sy->Dh");
        destination.add("Sy->Dh");

        seat.add(1);
        seat.add(1);
        seat.add(1);
        seat.add(1);

        taka.add(500);
        taka.add(500);
        taka.add(500);
        taka.add(500);



        for (int i = 0; i == 0 ; ){
            System.out.println("Registered people : "+ name.size());
            System.out.println("Booked seats      : "+ seat.size());
            // choice sign up , log in , log out , exit
            System.out.println("*************************");
            System.out.println("1. Sign up");
            System.out.println("2. Log in");
            System.out.println("3. Sign out");
            System.out.println("4. All information of our service ");
            System.out.println("5. Exit");
            System.out.print("Press a number between 1 to 4: "); int user = sc.nextInt();
            System.out.println("*************************\n");


            if (user == 1){                                                 // registration
                String x = sc.nextLine();                               // ajaira ekta input na dile kaz kore na
                System.out.print("User name ( new user name )      : "); String userName = sc.nextLine(); // username
                System.out.print("Password ( minimum 6 character ) : "); String pass = sc.nextLine();      // Password


                String name_temp = ""; String pass_temp = "";           // declear the temp in null


                int size = name.size();                                     // Vector size declearation

                for (int j = 0; j < size ; j++ ){
                    if(userName.equals(name.get(j))){                     // If there is a match with userName to other user name , it will be not registerd
                        System.out.println("\n\t\t\t\t\t\t\tPlease enter a new user name. This is used by other. You are not registared\n");
                        name_temp = userName;                            // if there is any mathch , the matched information will store in name_temp
                    }
                }
                if(pass.length()<6){                                // password should have minimum 6 character or it will be store in pass_temp
                    System.out.println("\n\t\t\t\t\t\t\tYour password should have minimum six character. You are not registared\n");
                    pass_temp = pass;
                }
                else if( name_temp.equals("") && pass_temp.equals("") ){     // if name_temp and pass_temp remains null then it will registared

                    name.add(userName);
                    password.add(pass);
                    System.out.print("Real name: "); String realname = sc.nextLine();     // Real name enter
                    System.out.print("Phone: ");     String ph = sc.nextLine();           // Phone enter

                    realName.add(realname);
                    phone.add(ph);

                    System.out.println("\n\t\t\t\t\t\t\tYou are registared\n");

                    System.out.println("\n\nUser name  : "+name.get(size));
                    System.out.println("Password   : "+password.get(size));
                    System.out.println("Real name  : "+realName.get(size));
                    System.out.println("Phone      : "+phone.get(size));
                    System.out.println("\n");
                    name_temp = "";                                         // name_temp and pass_temp should be changed in null
                    pass_temp = "";
                }
            }

            else if(user == 2){                                            // log in
                String y = sc.nextLine();
                System.out.print("User name: "); String name2 = sc.nextLine();
                System.out.print("password: "); String pass2 = sc.nextLine();

                String temp_name2 = "" ; String temp_pass2 = "";
                int size3 = name.size();

                if( (name2.equals("a") && (pass2.equals("1"))) ){                  // admin log in
                    System.out.println("View history and All information:");
                    System.out.println("**********************************************");
                    System.out.println("1. All registared member's information:");
                    System.out.println("2. All information of seat booking: ");
                    System.out.println("3. All information delete: ");
                    System.out.println("4. Change the fare");
                    System.out.println("5. Exit");
                    System.out.println("**********************************************");

                    for (int again = 0; again == 0; ){
                        System.out.print("Admin's choice: "); int admin_choice = sc.nextInt(); //admin choice
                        System.out.println("**********");

                        if(admin_choice == 1){                                                   // Passenger information
                            //for (int p = 0; p < size3 ; p++ ){
                            for (int p = 0; p < seat.size() ; p++ ){
                                System.out.println( "Passenger"+(p+1) + "----" + realName.get(p)+ "----" + phone.get(p) );
                            }
                        }
                        else if(admin_choice == 2){                                             // passenger economical information
                            System.out.println(" Passenger--------date----destinition---seat--taka");
                            for (int a = 0; a < seat.size() ; a++ ){
                                System.out.println( "Passenger"+(a+1) + "----" + pass_date.get(a) + "----" + destination.get(a) + "------" + seat.get(a) + "----" + taka.get(a));
                            }
                            System.out.println("\nseat size = " + seat.size());               // size of seat Vector

                            System.out.println("Do you want to search a Passenger \n 1. Yes \n 2. No "); // yes or no in searching passenger
                            int admin_ChoiceSearchUserName = sc.nextInt();

                            if(admin_ChoiceSearchUserName == 1 ){                             // admin search passenger
                                System.out.println("\n\t\t\t\t\t\t You can search Passenger information from the list ");
                                System.out.println("**************************************************************");
                                System.out.print("Passenger number: "); int admin_user = sc.nextInt();
                                System.out.println("**************************************************************");
                                System.out.println( "Passenger"+(admin_user) + "----" + pass_realName.get(admin_user-1)+ "----" + pass_phone.get(admin_user-1) );
                                System.out.println("**************************************************************");
                            }
                            else if(admin_ChoiceSearchUserName == 2){
                                System.out.println("\n\t OK \n");
                            }
                            else{
                                System.out.println("Please enter a valid number");
                            }
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
                            }
                            else{
                                System.out.println("OK");
                            }
                        }
                        else if(admin_choice==4){
                            System.out.println("1.Change Fare of "+SD); 
                            System.out.println("2.Change Fare of "+DS); 
                            System.out.println("3.Change Fare of "+SC); 
                            System.out.println("4.Change Fare of "+CS); 
                            System.out.println("5.Change Fare of "+DC); 
                            System.out.println("6.Change Fare of "+CD); 
                            System.out.print("Please enter a number between 1 to 6: ");
                            int change_fare = sc.nextInt();
                                 if(change_fare == 1){ System.out.print("Put the Fare " + SD + " = ") ; tsd = sc.nextInt(); }
                            else if(change_fare == 2){ System.out.print("Put the Fare " + DS + " = ") ; tds = sc.nextInt(); }
                            else if(change_fare == 3){ System.out.print("Put the Fare " + SC + " = ") ; tsc = sc.nextInt(); }
                            else if(change_fare == 4){ System.out.print("Put the Fare " + CS + " = ") ; tcs = sc.nextInt(); }
                            else if(change_fare == 5){ System.out.print("Put the Fare " + DC + " = ") ; tdc = sc.nextInt(); }
                            else if(change_fare == 6){ System.out.print("Put the Fare " + CD + " = ") ; tcd = sc.nextInt(); }
                            else{System.out.println("\nYou enter a wrong number. Please try again. ");}
                        }
                        else if(admin_choice==5){
                            break;
                        }
                        
                        else{
                            System.out.println("\t\t\t\t\t\t\tPlease enter a valid number ");
                        }

                        System.out.println("View history and All information:");
                        System.out.println("**********************************************");
                        System.out.println("1. All registared member's information:");
                        System.out.println("2. All information of seat booking: ");
                        System.out.println("3. All information delete: ");
                        System.out.println("4. Change the fare");
                        System.out.println("5. Exit");
                        System.out.println("**********************************************");
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

                                System.out.println("\n******You can book tickets*****\n");
                                System.out.println("When you want to go :");
                                System.out.println("1. "+date1);
                                System.out.println("2. "+date2);
                                System.out.println("3. "+date3);
                                System.out.println("4. "+date4);
                                System.out.println("5. "+date5);
                                System.out.println("6. Log out");

                                System.out.print("Enter date between 1 to 6: "); int user_date = sc.nextInt();

                                String object_date = "";
                                String object_bus = "";
                                int object_seat = 0;
                                int object_taka = 0;



                                if (user_date == 1){
                                    
                                    

                                    Date1 d1 = new Date1(date1, Bus_seat[1], Bus_seat[2], Bus_seat[3], Bus_seat[4], Bus_seat[5], Bus_seat[6], tsd, tds, tsc, tcs, tdc, tcd);
                                    Payment pay = new Payment();
                                    if(pay.confirm == 1){
                                        Bus_seat[1] += d1.seat1;
                                        Bus_seat[2] += d1.seat2;
                                        Bus_seat[3] += d1.seat3;
                                        Bus_seat[4] += d1.seat4;
                                        Bus_seat[5] += d1.seat5;
                                        Bus_seat[6] += d1.seat6;
                                        object_date = date1;
                                        object_bus = d1.destination;   // Transfer the destination (String) value from Payment class
                                        object_seat = d1.seat;         // Transfer the seat(int) value from Payment class
                                        object_taka = d1.taka;         // Transfer the taka(int) value from Payment class
                                    }
                                    else{
                                        System.out.println("Your seat is not booked");
                                    }

                                }
                                else if(user_date == 2){

		                        Date2 d2 = new Date2(date2, Bus_seat[6+1], Bus_seat[6+2], Bus_seat[6+3], Bus_seat[6+4], Bus_seat[6+5], Bus_seat[6+6], tsd, tds, tsc, tcs, tdc, tcd);
		                        Payment pay = new Payment();
		                        if(pay.confirm == 1){
		                            Bus_seat[6+1] += d2.seat1;
		                            Bus_seat[6+2] += d2.seat2;
		                            Bus_seat[6+3] += d2.seat3;
		                            Bus_seat[6+4] += d2.seat4;
		                            Bus_seat[6+5] += d2.seat5;
		                            Bus_seat[6+6] += d2.seat6;
		                            object_date = date2;
		                            object_bus = d2.destination;   // Transfer the destination (String) value from Payment class
		                            object_seat = d2.seat;         // Transfer the seat(int) value from Payment class
		                            object_taka = d2.taka;         // Transfer the taka(int) value from Payment class
		                        }
		                        else{
		                            System.out.println("Your seat is not booked");
		                        }

                                }
                                else if(user_date == 3){

		                        Date3 d3 = new Date3(date3, Bus_seat[12+1], Bus_seat[12+2], Bus_seat[12+3], Bus_seat[12+4], Bus_seat[12+5], Bus_seat[12+6], tsd, tds, tsc, tcs, tdc, tcd);
		                        Payment pay = new Payment();
		                        if(pay.confirm == 1){
		                            Bus_seat[12+1] += d3.seat1;
		                            Bus_seat[12+2] += d3.seat2;
		                            Bus_seat[12+3] += d3.seat3;
		                            Bus_seat[12+4] += d3.seat4;
		                            Bus_seat[12+5] += d3.seat5;
		                            Bus_seat[12+6] += d3.seat6;
		                            object_date = date3;
		                            object_bus = d3.destination;   // Transfer the destination (String) value from Payment class
		                            object_seat = d3.seat;         // Transfer the seat(int) value from Payment class
		                            object_taka = d3.taka;         // Transfer the taka(int) value from Payment class
		                        }
		                        else{
		                            System.out.println("Your seat is not booked");
		                        }

                                }
                                else if(user_date == 4){

		                        Date4 d4 = new Date4(date4, Bus_seat[18+1], Bus_seat[18+2], Bus_seat[18+3], Bus_seat[18+4], Bus_seat[18+5], Bus_seat[18+6], tsd, tds, tsc, tcs, tdc, tcd);
		                        Payment pay = new Payment();
		                        if(pay.confirm == 1){
		                            Bus_seat[18+1] += d4.seat1;
		                            Bus_seat[18+2] += d4.seat2;
		                            Bus_seat[18+3] += d4.seat3;
		                            Bus_seat[18+4] += d4.seat4;
		                            Bus_seat[18+5] += d4.seat5;
		                            Bus_seat[18+6] += d4.seat6;
		                            object_date = date4;
		                            object_bus = d4.destination;   // Transfer the destination (String) value from Payment class
		                            object_seat = d4.seat;         // Transfer the seat(int) value from Payment class
		                            object_taka = d4.taka;         // Transfer the taka(int) value from Payment class
		                        }
		                        else{
		                            System.out.println("Your seat is not booked");
		                        }

                                }
                                else if(user_date == 5){

		                        Date5 d5 = new Date5(date5, Bus_seat[24+1], Bus_seat[24+2], Bus_seat[24+3], Bus_seat[24+4], Bus_seat[24+5], Bus_seat[24+6], tsd, tds, tsc, tcs, tdc, tcd);
		                        Payment pay = new Payment();
		                        if(pay.confirm == 1){
		                            Bus_seat[24+1] += d5.seat1;
		                            Bus_seat[24+2] += d5.seat2;
		                            Bus_seat[24+3] += d5.seat3;
		                            Bus_seat[24+4] += d5.seat4;
		                            Bus_seat[24+5] += d5.seat5;
		                            Bus_seat[24+6] += d5.seat6;
		                            object_date = date5;
		                            object_bus = d5.destination;   // Transfer the destination (String) value from Payment class
		                            object_seat = d5.seat;         // Transfer the seat(int) value from Payment class
		                            object_taka = d5.taka;         // Transfer the taka(int) value from Payment class
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
                                    System.out.println("Name       : " + pass_Name.get(seat.size() - 1));
                                    System.out.println("Date       : " + pass_date.get(seat.size() - 1));
                                    System.out.println("destination: " + destination.get(seat.size() - 1));
                                    System.out.println("Seat       : " + seat.get(seat.size() - 1));
                                    System.out.println("Fare       : " + taka.get(seat.size() - 1));
                                    System.out.println("****************************************/n");
                                }
                            }
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
                System.out.println("   Date       " + "      Destination    "+"   Available Seat   " + " Fare ");
                System.out.println(date1 + "   " + SD + "       " + (30 - Bus_seat[1] ) + "            " + tsd );
                System.out.println(date1 + "   " + DS + "       " + (30 - Bus_seat[2] ) + "            " + tds );
                System.out.println(date1 + "   " + SC + "       " + (30 - Bus_seat[3] ) + "            " + tcs );
                System.out.println(date1 + "   " + CS + "       " + (30 - Bus_seat[4] ) + "            " + tsc );
                System.out.println(date1 + "   " + DC + "       " + (30 - Bus_seat[5] ) + "            " + tdc );
                System.out.println(date1 + "   " + CD + "       " + (30 - Bus_seat[6] ) + "            " + tcd +"\n");
                System.out.println(date2 + "   " + SD + "       " + (30 - Bus_seat[6+1] ) + "            " + tsd );
                System.out.println(date2 + "   " + DS + "       " + (30 - Bus_seat[6+2] ) + "            " + tds );
                System.out.println(date2 + "   " + SC + "       " + (30 - Bus_seat[6+3] ) + "            " + tcs );
                System.out.println(date2 + "   " + CS + "       " + (30 - Bus_seat[6+4] ) + "            " + tsc );
                System.out.println(date2 + "   " + DC + "       " + (30 - Bus_seat[6+5] ) + "            " + tdc );
                System.out.println(date2 + "   " + CD + "       " + (30 - Bus_seat[6+6] ) + "            " + tcd +"\n");
                System.out.println(date3 + "   " + SD + "       " + (30 - Bus_seat[12+1] ) + "            " + tsd );
                System.out.println(date3 + "   " + DS + "       " + (30 - Bus_seat[12+2] ) + "            " + tds );
                System.out.println(date3 + "   " + SC + "       " + (30 - Bus_seat[12+3] ) + "            " + tcs );
                System.out.println(date3 + "   " + CS + "       " + (30 - Bus_seat[12+4] ) + "            " + tsc );
                System.out.println(date3 + "   " + DC + "       " + (30 - Bus_seat[12+5] ) + "            " + tdc );
                System.out.println(date3 + "   " + CD + "       " + (30 - Bus_seat[12+6] ) + "            " + tcd +"\n");
                System.out.println(date4 + "   " + SD + "       " + (30 - Bus_seat[18+1] ) + "            " + tsd );
                System.out.println(date4 + "   " + DS + "       " + (30 - Bus_seat[18+2] ) + "            " + tds );
                System.out.println(date4 + "   " + SC + "       " + (30 - Bus_seat[18+3] ) + "            " + tcs );
                System.out.println(date4 + "   " + CS + "       " + (30 - Bus_seat[18+4] ) + "            " + tsc );
                System.out.println(date4 + "   " + DC + "       " + (30 - Bus_seat[18+5] ) + "            " + tdc );
                System.out.println(date4 + "   " + CD + "       " + (30 - Bus_seat[18+6] ) + "            " + tcd +"\n");
                System.out.println(date5 + "   " + SD + "       " + (30 - Bus_seat[24+1] ) + "            " + tsd );
                System.out.println(date5 + "   " + DS + "       " + (30 - Bus_seat[24+2] ) + "            " + tds );
                System.out.println(date5 + "   " + SC + "       " + (30 - Bus_seat[24+3] ) + "            " + tcs );
                System.out.println(date5 + "   " + CS + "       " + (30 - Bus_seat[24+4] ) + "            " + tsc );
                System.out.println(date5 + "   " + DC + "       " + (30 - Bus_seat[24+5] ) + "            " + tdc );
                System.out.println(date5 + "   " + CD + "       " + (30 - Bus_seat[24+6] ) + "            " + tcd );
                System.out.println("******************************************************************************");
            }

            else if(user == 5){                                                                             // exit
                break;
            }

            else {
                System.out.println("Please chose a number between 1 to 4 ");                            // if it is out of 1 to 4
            }
        }
    }
}
