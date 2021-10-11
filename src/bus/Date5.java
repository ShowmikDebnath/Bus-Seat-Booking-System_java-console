package bus;
import java.util.Scanner;

public class Date5 extends Taka{
    String destination;
    int seat;
    int taka;
    String time;
    int seat1 = 0;
    int seat2 = 0;
    int seat3 = 0;
    int seat4 = 0;
    int seat5 = 0;
    int seat6 = 0;



    private int seat_temp;

    public Date5(String date, int seat1, int seat2, int seat3, int seat4, int seat5, int seat6, int tsd, int tds, int tsc, int tcs, int tdc, int tcd
            , String time1, String time2, String time3, String time4, String time5, String time6){
        System.out.println("\n**********Where You want to go:***********");
        System.out.println("Bus available on "+date+ " are:");
        System.out.println("1. Sylhet to Dhaka      --- "+(30 - seat1)+" ---- "+time1+" ---- "+tsd);
        System.out.println("2. Dhaka to Sylhet      --- "+(30 - seat2)+" ---- "+time2+" ---- "+tsd);
        System.out.println("3. Sylhet to Chittagong --- "+(30 - seat3)+" ---- "+time3+" ---- "+tsd);
        System.out.println("4. Chittagong to Sylhet --- "+(30 - seat4)+" ---- "+time4+" ---- "+tsd);
        System.out.println("5. Dhaka to Chittagong  --- "+(30 - seat5)+" ---- "+time5+" ---- "+tsd);
        System.out.println("6. Chittagong to Dhaka  --- "+(30 - seat6)+" ---- "+time6+" ---- "+tsd);
        System.out.println("******************************************\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 6 : ") ; int choice = sc.nextInt();
        System.out.print("Tickets : ");
        seat_temp = sc.nextInt();

        Scanner input = new Scanner(System.in);
        if(seat_temp > 0){
            switch (choice) {
                case 1:
                    if( (30 - seat1) >= seat_temp ){

                        this.destination = "Sy->Dh";
                        this.seat = seat_temp;
                        this.taka = taka_function(this.seat, tsd) ;
                        this.seat1 = seat_temp;
                        this.time = time1;

                        Payment pay = new Payment(this.destination, this.seat, this.taka); // Called the payment class
                    }
                    else{
                        System.out.println("we not have enough seat");
                    }
                    break;

                case 2:
                    if( (30 - seat2) >= seat_temp ){

                        this.destination = "Dh->Sy";
                        this.seat = seat_temp;
                        this.taka = taka_function(this.seat, tds) ;
                        this.seat2 = seat_temp;
                        this.time = time2;

                        Payment pay = new Payment(this.destination, this.seat, this.taka); // Called the payment class
                    }
                    else{
                        System.out.println("we not have enough seat");
                    }
                    break;
                case 3:
                    if( (30 - seat3) >= seat_temp ){

                        this.destination = "Sy->Ch";
                        this.seat = seat_temp;
                        this.taka = taka_function(this.seat, tsc) ;
                        this.seat3 = seat_temp;
                        this.time = time3;

                        Payment pay = new Payment(this.destination, this.seat, this.taka); // Called the payment class
                    }
                    else{
                        System.out.println("we not have enough seat");
                    }
                    break;
                case 4:
                    if( (30 - seat4) >= seat_temp ){

                        this.destination = "Ch->Sy";
                        this.seat = seat_temp;
                        this.taka = taka_function(this.seat, tcs) ;
                        this.seat4 = seat_temp;
                        this.time = time4;

                        Payment pay = new Payment(this.destination, this.seat, this.taka); // Called the payment class

                    }
                    else{
                        System.out.println("we not have enough seat");
                    }
                    break;
                case 5:
                    if( (30 - seat5) >= seat_temp ){

                        this.destination = "Dh->Ch";
                        this.seat = seat_temp;
                        this.taka = taka_function(this.seat, tdc) ;
                        this.seat5 = seat_temp;
                        this.time = time5;

                        Payment pay = new Payment(this.destination, this.seat, this.taka); // Called the payment class
                    }
                    else{
                        System.out.println("we not have enough seat");
                    }
                    break;
                case 6:
                    if( (30 - seat6) >= seat_temp ){

                        this.destination = "Ch->Dh";
                        this.seat = seat_temp;
                        this.taka = taka_function(this.seat, tcd) ;
                        this.seat6 = seat_temp;
                        this.time = time1;

                        Payment pay = new Payment(this.destination, this.seat, this.taka); // Called the payment class
                    }
                    else{
                        System.out.println("we not have enough seat");
                    }
                    break;
                default:
                    System.out.println("\nplease enter a number between 1 to 6 ");
                    break;
            }
        }
        else{
            System.out.println("Please enter a intiger number seat value");
        }
    }
}