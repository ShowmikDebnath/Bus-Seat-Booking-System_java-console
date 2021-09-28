package bus;


import java.util.*;
import java.text.*;
import java.util.Scanner;
import java.util.Vector;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

//System.out.println("The index of element 5 in Vector is: " + vec.indexOf(5));  -- date khujar somoy kaze lagbe


                Scanner sc = new Scanner(System.in);

                String date0, date1, date2, date3, date4, date5;
                Date date;
                Format formatter;
                Calendar calendar = Calendar.getInstance();

                date = calendar.getTime();
                formatter = new SimpleDateFormat("dd/MMM/yyyy");
                date0 = formatter.format(date);                         //date0 = today

                calendar.add(Calendar.DATE, 1);
                date = calendar.getTime();
                formatter = new SimpleDateFormat("dd/MMM/yyyy");
                date1 = formatter.format(date);                         //date1

                calendar.add(Calendar.DATE, 1);
                date = calendar.getTime();
                formatter = new SimpleDateFormat("dd/MMM/yyyy");
                date2 = formatter.format(date);                         //date2

                calendar.add(Calendar.DATE, 1);
                date = calendar.getTime();
                formatter = new SimpleDateFormat("dd/MMM/yyyy");
                date3 = formatter.format(date);                         //date3

                calendar.add(Calendar.DATE, 1);
                date = calendar.getTime();
                formatter = new SimpleDateFormat("dd/MMM/yyyy");
                date4 = formatter.format(date);                         //date4

                calendar.add(Calendar.DATE, 1);
                date = calendar.getTime();
                formatter = new SimpleDateFormat("dd/MMM/yyyy");
                date5 = formatter.format(date);                         //date5

                Vector<String> name = new Vector<>();                           // vector declearation
                Vector<String> password = new Vector<>();
                Vector<String> realName = new Vector<>();
                Vector<String> phone = new Vector<>();
                Vector<String> email = new Vector<>();
                Vector<Integer> seat = new Vector<>();
                Vector<Integer> taka = new Vector<>();


                // all element declearation
                name.add("Roni");    password.add("454545");   realName.add("Roni Acharjee");    phone.add("01959239908"); email.add("roniach019@gmail.com");
                name.add("Showmik"); password.add("676767");   realName.add("Showmik Debnath");  phone.add("01765636035"); email.add("");
                name.add("Mithila"); password.add("232323");   realName.add("Mithila Talukdar"); phone.add("01729404135"); email.add("");
                name.add("Nabila");  password.add("898989");   realName.add("Nabila Zannath");   phone.add("01700940686"); email.add("");

                seat.add(2);
                seat.add(3);
                seat.add(4);
                seat.add(5);

                taka.add(1000);
                taka.add(1500);
                taka.add(2000);
                taka.add(2500);

                //int object_seat = 0; seat.add(object_seat);

                for (int i = 0; i == 0 ; ){
                    System.out.println("Passengers   = "+ name.size());
                    System.out.println("Booked seats = "+ seat.size());
                    // choice sign up , log in , log out , exit
                    System.out.println("*************************");
                    System.out.println("1. Sign up");
                    System.out.println("2. Log in");
                    System.out.println("3. Log out");
                    System.out.println("4. Exit");
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
                            System.out.println("\n\t\t\t\t\t\t\tYou are registared\n");
                            name.add(userName);
                            password.add(pass);
                            System.out.print("Real name: "); String realname = sc.nextLine();     // Real name enter
                            System.out.print("Phone: ");     String ph = sc.nextLine();           // Phone enter
                            System.out.print("Email: ");     String em = sc.nextLine();           // Email enter
                            realName.add(realname);
                            phone.add(ph);
                            email.add(em);
                            seat.add(0);
                            taka.add(0);
                            System.out.println("\n\nUser name  : "+name.get(size));
                            System.out.println("Password   : "+password.get(size));
                            System.out.println("Real name  : "+realName.get(size));
                            System.out.println("Phone      : "+phone.get(size));
                            System.out.println("Email      : "+email.get(size));
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

                            //int size3 = name.size();

                            System.out.println("**********");
                            System.out.println("1. all member's information:");
                            System.out.println("2. All information of economics: ");
                            System.out.println("3. All information of delete: ");
                            System.out.print("Admin's choice: "); int admin_choice = sc.nextInt(); //admin choice
                            System.out.println("**********");

                            if(admin_choice == 1){                                                   // Passenger information
                                for (int p = 0; p < size3 ; p++ ){
                                    System.out.println( "Passenger"+(p+1) + "----" + realName.get(p)+ "----" + phone.get(p) + "----" + email.get(p) );
                                }
                            }
                            else if(admin_choice == 2){                                             // passenger economical information
                                System.out.println(" Passenger--seat--taka");
                                for (int a = 0; a < seat.size() ; a++ ){
                                    System.out.println( "Passenger"+(a+1) + "----" + seat.get(a) + "----" + taka.get(a)); // somossa size bare na keno ?
                                }
                                System.out.println("\nseat size = " + seat.size());               // size of seat Vector

                                System.out.println("Do you want to search a Passenger \n 1. Yes \n 2. No "); // yes or no in searching passenger
                                int admin_ChoiceSearchUserName = sc.nextInt();

                                if(admin_ChoiceSearchUserName == 1 ){                             // admin search passenger
                                    System.out.println("\n\t\t\t\t\t\t You can search Passenger information from the list ");
                                    System.out.print("Passenger number: "); int admin_user = sc.nextInt();
                                    System.out.println( "Passenger"+(admin_user-1) + "----" + realName.get(admin_user-1)+ "----" + phone.get(admin_user-1) + "----" + email.get(admin_user-1) );
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
                                    System.out.println("You cleared all information");                // delete all information from register list
                                    name.clear();
                                    password.clear();
                                    realName.clear();
                                    phone.clear();
                                    email.clear();
                                    seat.clear();
                                    taka.clear();
                                }
                                else{
                                    System.out.println("OK");
                                }
                            }
                            else{
                                System.out.println("\t\t\t\t\t\t\tPlease enter a valid number ");
                            }
                        }
                        else{
                            for(int j = 0; j < size3; j++){                             // this for searching if there is matched in user name and password then all function will execute
                                if(name2.equals(name.get(j)) && pass2.equals(password.get(j))){
                                    System.out.println("You are registared");
                                    temp_name2 = name2;
                                    temp_pass2 = pass2;

                                    System.out.println("Your user name   :" + name.get(j));  // all information print
                                    System.out.println("Your password    :" + password.get(j));
                                    System.out.println("Your real name   :" + realName.get(j));
                                    System.out.println("Your phone       :" + phone.get(j));
                                    System.out.println("Your email       :" + email.get(j));
                                    System.out.println("\n");
                                    System.out.println("******Now you can book tickets*****\n");

                                    System.out.println("When you want to go :");
                                    System.out.println("1. "+date1);
                                    System.out.println("2. "+date2);
                                    System.out.println("3. "+date3);
                                    System.out.println("4. "+date4);
                                    System.out.println("5. "+date5);

                                    System.out.println("Enter date between 1 to 5: "); int user_date = sc.nextInt();
                                    /*
                                    if(user_date == 1){
                                        Date1 d1 = new Date1();   // Date1 er ekta class create kore 6 ta bus er jonno 6 ta method create koro
                                        int object_bus = 1;                                     // transfer bus number
                                        int object_seat = 6;                                    // need to transfer from seat object
                                        int object_taka = 3000;                                 // need to transfer taka object
                                    }
                                    else if(user_date == 2){
                                        Date2 d2 = new Date2();
                                        int object_bus = 1;                                     // transfer bus number
                                        int object_seat = 6;                                    // need to transfer from seat object
                                        int object_taka = 3000;                                 // need to transfer taka object
                                    }
                                    else if(user_date == 3){
                                        Date3 d3 = new Date3();
                                        int object_bus = 1;                                     // transfer bus number
                                        int object_seat = 6;                                    // need to transfer from seat object
                                        int object_taka = 3000;                                 // need to transfer taka object
                                    }
                                    else if(user_date == 4){
                                        Date4 d4 = new Date4();
                                        int object_bus = 1;                                     // transfer bus number
                                        int object_seat = 6;                                    // need to transfer from seat object
                                        int object_taka = 3000;                                 // need to transfer taka object
                                    }
                                    else if(user_date == 5){
                                        Date5 d5 = new Date5();
                                        int object_bus = 1;                                     // transfer bus number
                                        int object_seat = 6;                                    // need to transfer from seat object
                                        int object_taka = 3000;                                 // need to transfer taka object
                                    }
                                    else{
                                        System.out.println("Please enter 1 to 5");
                                    }
                                    */

                                    int object_bus = 1;
                                    int object_seat = 6;                                    // need to transfer from seat object
                                    int object_taka = 3000;                                 // need to transfer taka object

                                    // ami pore date , bus , seat , ar net_taka er 4 vector banie history te add dibo and oblige thereby

                                    seat.set( seat.size()-1 , object_seat );
                                    taka.set( seat.size()-1 , object_taka );

                                    Menu menu = new Menu();
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
                        System.out.print("User name:"); String name3 = sc.nextLine();
                        System.out.print("password"); String pass3 = sc.nextLine();

                        String temp_name3 = ""; String temp_pass3 = "";

                        for (int l = 0 ; l < name.size() ; l++ ) {
                            if( name3.equals(name.get(l)) && pass3.equals(password.get(l))){
                                temp_name3 = name.get(l);
                                temp_pass3 = password.get(l);
                                name.remove(l);                                                              //vec.remove(l)
                                password.remove(l);
                                realName.remove(l);
                                phone.remove(l);
                                email.remove(l);
                                seat.remove(l);
                                taka.remove(l);
                                System.out.println(name);                                                    // will remove
                                System.out.println("\n\t\t\t\t\t\t\tYour all information deleted\n");
                            }
                        }
                        if(temp_name3.equals("") && temp_pass3.equals("")){
                            System.out.println("\n\t\t\t\t\t\t\tYou are not registared\n");
                        }
                    }


                    else if(user == 4){                                                                             // exit
                        break;
                    }


                    else {
                        System.out.println("Please chose a number between 1 to 4 ");                            // if it is out of 1 to 4
                    }
                }
            }
}

