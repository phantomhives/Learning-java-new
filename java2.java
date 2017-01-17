package com.company;
/**
 * Created by shusa on 15-Jan-17.
 */

import java.util.Scanner;

public class java2 {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter Your Number: ");

        if(userInput.hasNextInt()){

            int numberEntered =userInput.nextInt();
            System.out.println("You Entered: " + numberEntered);

            int numberEnteredTimes2 = numberEntered + numberEntered;
            System.out.println(numberEnteredTimes2);

            int numberABC = Math.abs(numberEntered);
            System.out.println(numberABC);

            int numberCelling =(int) Math.ceil(5.55);
            System.out.println(numberCelling);

            int numberFloor =(int) Math.floor(5.323);
            System.out.println(numberFloor);

            int numberRound =(int) Math.round(5.66);
            System.out.println(numberRound);

            int numberRandom =(int) (Math.random() * 22);
            System.out.println(numberRandom);

        }else {
            System.out.println("enter a integer number");
        }


    }
}
