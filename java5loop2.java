package com.company;

/**
 * Created by shusa on 19-Jan-17.
 */

import java.util.Scanner;

public class java5loop2 {

    static Scanner userInput =new Scanner(System.in);

    public static void main(String[] args)
    {
        String contYorN = "Y";

        int h =1;

        while(contYorN.equalsIgnoreCase("y"))
        {
            System.out.println(h);
            System.out.println("continue y or n?" );
            contYorN = userInput.nextLine();
            h++;
        }

        int k = 10;
        do
        {
            System.out.println(k);
            k++;
        }while(k<10);


    }
}
