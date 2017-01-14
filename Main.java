package com.company;

import java.util.Scanner;

public class Main {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

        System.out.print("Your favorite number: ");

        if (userInput.hasNextInt())
        {

            int numberEntered = userInput.nextInt();
            System.out.println("You entered " +numberEntered);


            int numberEnteredTimes2 = numberEntered + numberEntered;
            System.out.println(numberEntered +"+"+numberEntered+"="+numberEnteredTimes2);


            int numberEnteredMinus2 = numberEntered -2;
            System.out.println(numberEntered +"-2"+"="+numberEnteredMinus2);


            int numberEnteredMultiply2 = numberEntered * numberEntered;
            System.out.println(numberEntered +"*"+"="+numberEnteredMultiply2);


            int numberEntereddiv2 = numberEntered /2;
            System.out.println(numberEntered +"/2"+"="+numberEntereddiv2);


            int numberEnteredRemainder = numberEntered %2;
            System.out.println(numberEntered +"%2"+"="+numberEnteredRemainder);


           /*  numberEntered +=2;
            System.out.println(numberEntered);

            numberEntered++;
            System.out.print(numberEntered);
           */

         /*
           int numberABS = Math.abs(numberEntered);
           System.out.println(numberABS);


           int whichIsBigger = Math.max(5, 7); //7
            System.out.println(whichIsBigger);

            int whichIsSmaller = Math.min(5, 7);//5
            System.out.println(whichIsSmaller);

            double numSqrt = Math.sqrt(5.33);
            System.out.println(numSqrt);

            int numCeiling =(int) Math.ceil(5.23);
            System.out.println(numCeiling);

            int numFloor =(int) Math.floor(5.23);
            System.out.println(numFloor);

            int numRound =(int) Math.round(5.23); //if 5.23 than its 5 if 5.63 its 6
            System.out.println(numRound);

            int numRandom =(int) (Math.random() * 11);
            System.out.println("Random Number " + numRandom);
         */


        } else{
            System.out.println("Enter a integer next time");
        }
    }
}
