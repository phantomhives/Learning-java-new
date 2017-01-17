package com.company;

/**
 * Created by shusa on 15-Jan-17.
 */

import java.util.Scanner;

public class java3 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum1;
        int sum2;
        int sum3;
        int sum4;

        System.out.print("Enter a number: ");
        number1 =input.nextInt();

        System.out.print("Enter a number: ");
        number2 =input.nextInt();

        sum1 = number1 + number2 ;
        System.out.println("Your total is: " +sum1);

        sum2 = number1 - number2;
        System.out.println("The minus is:" +sum2);

        sum3 = number1 * number2;
        System.out.println("The multiply is:" +sum3);

        sum4 = number1 / number2;
        System.out.println("The div is:" +sum4);




    }

}
