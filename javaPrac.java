package com.company;

/**
 * Created by shusa on 25-Jan-17.
 */
public class javaPrac {

    public static void main(String[] args) {
//        System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));
//        System.out.printf("The character %c has the value %d%n", 'B', ((int) 'B'));
//        System.out.printf("The character %c has the value %d%n", 'C', ((int) 'C'));
//        System.out.printf("The character %c has the value %d%n", 'a', ((int) 'a') );
//        System.out.printf("The character %c has the value %d%n", 'b', ((int) 'b') );
//        System.out.printf("The character %c has the value %d%n", '0', ((int) '0'));
//        System.out.printf("The character %c has the value %d%n", '$', ((int) '$'));


        System.out.println("Number    Square    Cube");

        for (int number = 0; number <= 10; number++)
        {
            int number1= (int) Math.pow(number, 2);
            int number2= (int) Math.pow(number, 3);

              System.out.printf("%02d        %3d      %4d%n",number,number1, number2) ;
        }




    }
}
