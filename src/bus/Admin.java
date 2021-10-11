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
            System.out.println("What do you want to change ?");
            System.out.println("1. Date");
            System.out.println("2. Time");
            System.out.println("3. Fare");
            System.out.println("4. exit");
            System.out.print("please enter a number between 1 to 4: "); 
            int choice = sc.nextInt();
        
            if (choice == 1){
                //
            }
            if (choice == 2){
                //
            }
            if (choice == 3){
                //
            }
            if (choice == 4){
                break;
            }else{
              System.out.println("Please enter 1 to 4\n Otherwise it will not work");
            }
        }//for loops ends here
    } //Admin_can_change_all_information
}// class ends here