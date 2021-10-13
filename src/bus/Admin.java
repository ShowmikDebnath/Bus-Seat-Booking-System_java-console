package bus;
import java.util.*;
import java.text.*;
public class Admin{     
    
    String SD = "Sylhet to Dhaka      ";
    String DS = "Dhaka to Sylhet      ";
    String SC = "Sylhet to Chittagong ";
    String CS = "Chittagong to Sylhet ";
    String DC = "Dhaka to Chittagong  ";
    String CD = "Chittagong to Dhaka  ";

    static int date_choice1 = 1;                                    // admin choice
    static int date_choice2 = 1;
    static int date_choice3 = 1;
    static int date_choice4 = 1;
    static int date_choice5 = 1;
    
    static String date0;
    static String date1;
    static String date2;
    static String date3;
    static String date4;
    static String date5;
    
    static String time11;
    static String time12;
    static String time13;
    static String time14;
    static String time15;
    static String time16;
    
    static String time21;
    static String time22;
    static String time23;
    static String time24;
    static String time25;
    static String time26;
    
    static String time31;
    static String time32;
    static String time33;
    static String time34;
    static String time35;
    static String time36;
    
    static String time41;
    static String time42;
    static String time43;
    static String time44;
    static String time45;
    static String time46;
    
    static String time51;
    static String time52;
    static String time53;
    static String time54;
    static String time55;
    static String time56;
    
    static int fare11;
    static int fare12;
    static int fare13;
    static int fare14;
    static int fare15;
    static int fare16;
    
    static int fare21;
    static int fare22;
    static int fare23;
    static int fare24;
    static int fare25;
    static int fare26;
    
    static int fare31;
    static int fare32;
    static int fare33;
    static int fare34;
    static int fare35;
    static int fare36;
    
    static int fare41;
    static int fare42;
    static int fare43;
    static int fare44;
    static int fare45;
    static int fare46;
    
    static int fare51;
    static int fare52;
    static int fare53;
    static int fare54;
    static int fare55;
    static int fare56;
    
    Admin(){
        Date date;                                                                          // this is for date
        Format formatter;
        Calendar calendar = Calendar.getInstance();

        date = calendar.getTime();
        formatter = new SimpleDateFormat("dd/MMM/yyyy");
        date0 = formatter.format(date);                         //date0 = today
        this.date0 = date0;

        calendar.add(Calendar.DATE, date_choice1);
        date = calendar.getTime();
        formatter = new SimpleDateFormat("dd/MMM/yyyy");
        date1 = formatter.format(date);                         //date1
        this.date1 = date1;

        calendar.add(Calendar.DATE, date_choice2);
        date = calendar.getTime();
        formatter = new SimpleDateFormat("dd/MMM/yyyy");
        date2 = formatter.format(date);                         //date2
        this.date2 = date2;

        calendar.add(Calendar.DATE, date_choice3);
        date = calendar.getTime();
        formatter = new SimpleDateFormat("dd/MMM/yyyy");
        date3 = formatter.format(date);                         //date3
        this.date3 = date3;

        calendar.add(Calendar.DATE, date_choice4);
        date = calendar.getTime();
        formatter = new SimpleDateFormat("dd/MMM/yyyy");
        date4 = formatter.format(date);                         //date4
        this.date4 = date4;

        calendar.add(Calendar.DATE, date_choice5);
        date = calendar.getTime();
        formatter = new SimpleDateFormat("dd/MMM/yyyy");
        date5 = formatter.format(date);                         //date5
        this.date5 = date5;                                                             // this is for date
        
        this.time11 = " 10AM ";
        this.time12 = " 10AM ";
        this.time13 = " 10AM ";
        this.time14 = " 10AM ";
        this.time15 = " 10AM ";
        this.time16 = " 10AM ";
    
        this.time21 = " 10AM ";
        this.time22 = " 10AM ";
        this.time23 = " 10AM ";
        this.time24 = " 10AM ";
        this.time25 = " 10AM ";
        this.time26 = " 10AM ";
    
        this.time31 = " 10AM ";
        this.time32 = " 10AM ";
        this.time33 = " 10AM ";
        this.time34 = " 10AM ";
        this.time35 = " 10AM ";
        this.time36 = " 10AM ";
    
        this.time41 = " 10AM ";
        this.time42 = " 10AM ";
        this.time43 = " 10AM ";
        this.time44 = " 10AM ";
        this.time45 = " 10AM ";
        this.time46 = " 10AM ";
    
        this.time51 = " 10AM ";
        this.time52 = " 10AM ";
        this.time53 = " 10AM ";
        this.time54 = " 10AM ";
        this.time55 = " 10AM ";
        this.time56 = " 10AM ";
    
        this.fare11 = 470;
        this.fare12 = 470;
        this.fare13 = 700;
        this.fare14 = 700;
        this.fare15 = 480;
        this.fare16 = 480;
    
        this.fare21 = 470;
        this.fare22 = 470;
        this.fare23 = 700;
        this.fare24 = 700;
        this.fare25 = 480;
        this.fare26 = 480;
    
        this.fare31 = 470;
        this.fare32 = 470;
        this.fare33 = 700;
        this.fare34 = 700;
        this.fare35 = 480;
        this.fare36 = 480;
    
        this.fare41 = 470;
        this.fare42 = 470;
        this.fare43 = 700;
        this.fare44 = 700;
        this.fare45 = 480;
        this.fare46 = 480;
    
        this.fare51 = 470;
        this.fare52 = 470;
        this.fare53 = 700;
        this.fare54 = 700;
        this.fare55 = 480;
        this.fare56 = 480;
    }// constant value

    Admin(String Admin_can_change_all_information){
        Scanner sc = new Scanner(System.in);
        for (int again = 0; again==0; ){
            
            System.out.println("Do you want to change any fare of any roots?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("please enter a number between 1 to 2: "); 
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.println("*******************************************************************");
                System.out.println("For which root you want to change fare ");
                System.out.println("1. "+SD);
                System.out.println("2. "+DS);
                System.out.println("3. "+SC);
                System.out.println("4. "+CS);
                System.out.println("5. "+DC);
                System.out.println("6. "+CD);
                System.out.println("7. Don't want to change any fare");
                System.out.print("Enter a number between 1 to 6: "); int n2 = sc.nextInt();
                System.out.println("*******************************************************************");
                if(n2 == 1){
                System.out.print("Please enter your choiced fare amount: "); int fare = sc.nextInt();
                System.out.println("*******************************************************************");
                    this.fare11 = fare;
                    this.fare21 = fare;
                    this.fare31 = fare;
                    this.fare41 = fare;
                    this.fare51 = fare;
                }
                else if(n2 == 2){
                    System.out.print("Please enter your choiced fare amount: "); int fare = sc.nextInt();
                    System.out.println("*******************************************************************");
                    this.fare12 = fare;
                    this.fare22 = fare;
                    this.fare32 = fare;
                    this.fare42 = fare;
                    this.fare52 = fare;
                }
                else if(n2 == 3){
                        System.out.print("Please enter your choiced fare amount: "); int fare = sc.nextInt();
                        System.out.println("*******************************************************************");
                        this.fare13 = fare;
                        this.fare23 = fare;
                        this.fare33 = fare;
                        this.fare43 = fare;
                        this.fare53 = fare;
                }
                else if(n2 == 4){
                    System.out.print("Please enter your choiced fare amount: "); int fare = sc.nextInt();
                    System.out.println("*******************************************************************");
                    this.fare14 = fare;
                    this.fare24 = fare;
                    this.fare34 = fare;
                    this.fare44 = fare;
                    this.fare54 = fare;
                }
                else if(n2 == 5){
                    System.out.print("Please enter your choiced fare amount: "); int fare = sc.nextInt();
                    System.out.println("*******************************************************************");
                    this.fare15 = fare;
                    this.fare25 = fare;
                    this.fare35 = fare;
                    this.fare45 = fare;
                    this.fare55 = fare;
                }
                else if(n2 == 6){
                    System.out.print("Please enter your choiced fare amount: "); int fare = sc.nextInt();
                    System.out.println("*******************************************************************");
                    this.fare16 = fare;
                    this.fare26 = fare;
                    this.fare36 = fare;
                    this.fare46 = fare;
                    this.fare56 = fare;
                }
                else if(n2 == 7) break;
                    else{System.out.println("You enterd a wrong number. Please enter again");}
                    System.out.println("*******************************************************************");
            } // choice == 1 er if statement
            
            else if (choice == 2){
                break;
            }else{
              System.out.println("please enter 1 or 2 ");
            }
        }    
    } //Admin_can_change_all_information
}// class ends here