package com.company;

/**
 * Created by shusa on 19-Jan-17.
 */
public class java5loop1 {

    public static void main(String[] args){

        double pi = 4.0;

        double j = 3.0;

        //4-(4/3)+(4/5)-(4/7)+.......

        while(j < 11){

            pi = pi - (pi/j) + (pi/(j+2));
            j += 4;
            System.out.println(pi);


        }
        System.out.println("Value of pi:" + Math.PI);
    }
}
