//Passenger class updated
package bus;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Passenger{

    private static int x;

    Passenger() throws IOException {

        Buses.info();
    }

    public static void info() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner input = new Scanner(System.in);
        String user, pass, yn, search, again, choice;
        int to=0, y=1, z=0, end=0, r=1;

        int available[] = new int[7];
        int ticketI[][] = new int[100][3];
        String ticketS[][] = new String[100][3];
        double ticketD[][] = new double[100][3];

                    //Input passenger number
                        int print = 1;
                        for(int x=1; x==1; ){
                            System.out.println("How many passenger are you: ");
                            ticketI[z][0]=Integer.parseInt(in.readLine());


                            //Substact the availavle sit number
                            for(int p=1; p<=5; p++){
                                if(to==p){
                                    print=1;
                                    available[to]=available[to]-ticketI[z][0];

                                    // IF THE SUBSTACTED AVAILAVLE SEAT IS  "<0", DISPLAY ERROR

                                    if(available[to]<0){
                                        System.out.println("Sorry, we don't have seat available for "+ticketI[z][0]+" persions");
                                        available[to] = available[to]+ticketI[z][0];
                                        System.out.println("We only have "+available[to]+" seat available");
                                        x=1;
                                        print=0;
                                    }
                                    else{
                                        x=0;
                                    }
                                }
                            }
                        }

                        ticketI[z][1]=0;
                        ////
                        if(print == 1){
                            System.out.println("Paseemger Details");
                            System.out.println("Passenger Name: "+ticketS[z][0]);
                            System.out.println("Passenger Destination: "+ticketS[z][1]);
                            System.out.println("Fare : "+ticketD[z][0]);
                            System.out.println("No of Passenger : "+ticketI[z][0]);

                            double discout = (ticketD[z][0]-(ticketD[z][0]*0.2))*ticketI[z][1];
                            ticketD[z][2]=(ticketI[z][0]-ticketI[z][1])*ticketD[z][0]+discout;
                            x=0;
                            System.out.println("Total Fare: "+ticketD[z][2]);
                        }
                        z++;
                    }

                }


            
        





                


    







