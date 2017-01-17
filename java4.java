package com.company;

/**
 * Created by shusa on 17-Jan-17.
 */
public class java4 {

    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 50);

       /* Relational Operators:
                Java has 6 relational operators
                 > : Greater Than
                 < : Less than
                 == : Equal to
                 != :Not Equal To
                 >= :Greater Than Or Not Equal to
                 <= :Less than or not equal to
       */

        if (randomNumber < 25) {

            System.out.println("The random number is less than 25");
        } else if (randomNumber < 40) {
            System.out.println("the random number is greater than 40");
        } else if (randomNumber == 18) {
            System.out.println("the random number is equal to 18");
        } else if (randomNumber != 40) {
            System.out.println("the number is not equal to 40");
        } else {
            System.out.println("nothing worked");
        }

        if (!(false)) {
            System.out.println("\ni turned false into true");
        }
        if ((false) && (true)) {
            System.out.println("both r true");          //Both of them need to same

            if ((false) & (true)) {
                System.out.println("Both are true");
            }
            if ((true) | (false)) {
                System.out.println("one is true");
            }
            if ((false) ^ (true)){
                System.out.println("One is true"); //both have to different
            }

            System.out.println("The random number is " + randomNumber);

        }

    }
}
