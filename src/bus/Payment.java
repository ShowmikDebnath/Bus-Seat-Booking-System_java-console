package bus;
import java.util.Scanner;
public class Payment{
    Scanner sc = new Scanner(System.in);
    String destination;
    int seat;
    int taka;
    int confirm;

    Payment(String destination, int seat, int taka){
        this.destination = destination;
        this.seat = seat;
        this.taka = taka;
    }
    Payment(){
        this.confirm = 1; // if payment is complete press 1
    }
}
