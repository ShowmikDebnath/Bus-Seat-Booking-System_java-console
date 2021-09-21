package bus;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Buses{

    Buses() throws IOException {

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

        for(int i=1; i<=6; i++){
            available[i] = 30;
        }

        for(int x=1; x==1; ){
            System.out.println("1. Destination");
            System.out.println("2. Pessenger");
            System.out.println("3. Billing Details");
            System.out.println("4. Exit");

            for(x=1; x==1; ){
                System.out.println("Enter your Choice: ");
                choice = in.readLine();

                if(choice.equals("1")){
                    int print = 1;

                    System.out.println("\t   Root      \t\t\tPrice\t\t\tAvailable sit");
                    System.out.println("1. Dhaka-Sylhet        \t\t\t420\t\t\t"+available[1]);
                    System.out.println("2. Sylhet-Dhaka        \t\t\t420\t\t\t"+available[2]);
                    System.out.println("3. Chattagram-Sylhet   \t\t\t420\t\t\t"+available[3]);
                    System.out.println("4. Sylhet-Chattagram   \t\t\t420\t\t\t"+available[4]);
                    System.out.println("5. Dhaka-Chattagram    \t\t\t420\t\t\t"+available[5]);
                    System.out.println("6. Chattagram-Dhaka    \t\t\t420\t\t\t"+available[6]);


                    if((available[1]==0) && (available[2]==0) && (available[3]==0) && (available[4]==0) && (available[5]==0) && (available[6]==0)){
                        System.out.println("Sorry, We don't have available seats for all Destination!");
                        x=0;
                    }

                    else{
                        for(x=1; x==1; ){
                            System.out.println("Enter Passenger Name: ");
                            ticketS[z][0]=in.readLine();

                            x=0;

                            for(int l=0; l<z; l++){
                                if(ticketS[l][0].equalsIgnoreCase(ticketS[z][0])){
                                    System.out.println("Soory, Passenger name have already used!");
                                    x=1;
                                }
                            }
                        }

                        // INPUT FOR DESTINATION

                        for(x=1; x==1; ){
                            System.out.println("Enter Destination Number: ");
                            to=Integer.parseInt(in.readLine());

                            if(to<1 || to>6){
                                System.out.println("Invalid Input!");
                                x=1;
                            }

                            // IF AVAILAVLE SEAT IS ZERO

                            for(int d=1; d<=5; d++){
                                if(to==d){
                                    if(available[to]==0){
                                        System.out.println("Sorry, we don't have avaiable seat!");
                                        x=1;
                                    }
                                    x=0;
                                }
                            }
                        }

                        String dest[]={" ", "Dhaka-Sylhet", "Sylhet-Dhaka", "Chattagram-Sylhet", "Sylhet-Chattagram", "Dhaka-Chattagram", "Chattagram-Dhaka"};
                        double fare[]={0, 420, 420, 420, 420, 420, 420};

                        //convert int to str.
                        ticketS[z][1]=dest[to];
                        ticketD[z][0]=fare[to];


                        //input passenger number

                        for(x=1; x==1; ){
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

                        //ticketI[z][1]=0;
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


            }
        }






    }



}
