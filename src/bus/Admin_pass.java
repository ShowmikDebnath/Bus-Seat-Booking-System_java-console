package bus;
import java.util.Scanner;
public class Admin_pass{

    static String admin_pass = "1";
    static String admin_pass_real;

    Admin_pass(){
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\tPlease enter a new password: ");
        this.admin_pass = sc.nextLine();
        this.admin_pass_real = this.admin_pass;
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t~~~~ Admin's Password Change Successfully. ~~~~");
    }

    Admin_pass(String x){
        this.admin_pass_real = this.admin_pass;
    }
}