package Statements;

import java.util.Scanner;

public class EventAdvisor {
    public static void main(String[] args) {
        double temp;

        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter the todays temperature value in °C in your City:  ");
        temp = inp.nextDouble();
        if (temp >= -30 && temp <= 50) {
            if (temp <5){
                System.out.println("You may ski today.");
            }
            else if (temp<=25){
                if (temp<=15){
                    System.out.println("You may go to cinema today.");
                }
                if (temp>=10){
                    System.out.println("You may have picnic today.");
                }

            }
            else {
                System.out.println("You may swim today.");
            }



        }
        else{
            System.out.println("Your temperature value is extraordinary. Probably, the weather in your city today is extremely hot or cold. You shall stay at home today.");
        }

    }
}