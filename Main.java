package com.company;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        //prac1();
        //prac2();
        //prac3();
        //prac4();
        //prac5();
        //prac6();
        //prac7();
        //prac8();
        //prac9();
        //prac10();
        //prac11();
    }

    private static void prac11() {
        System.out.print("Enter a number: ");
        int givenNumber;
        givenNumber =input.nextInt();
        String msg ="";
        while (givenNumber!=0)
        {
            int anotherNumber = givenNumber/2;
            int reminder = givenNumber%2;

            if (reminder==0)
            {
                msg +=0;
            }else
            {
                msg +=1;
            }
            givenNumber=anotherNumber;
        }
        StringBuilder bl =new StringBuilder(msg);
        System.out.println(bl.reverse());
    }

    private static void prac10() {
        System.out.print("Enter a number: ");
        int givenNumber;
        givenNumber =input.nextInt();
        for (int row = 1; row <= givenNumber ; row++)
        {
            for (int space = (givenNumber-row); space >=1 ; space--)
            {
                System.out.print(" ");
            }
            for (int column = 1; column <= row ; column++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void prac9() {
        System.out.print("Enter a number: ");
        int givenNumber;
        givenNumber =input.nextInt();

        for (int row = givenNumber; row >=1 ; row--)
        {
            for (int space = 1; space <=(givenNumber-row) ; space++)
            {
                System.out.print(" ");
            }
            for (int column = 1; column <=row ; column++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void prac8() {
        System.out.print("Enter a number: ");
        int givenNumber;
        givenNumber =input.nextInt();

        for (int row = 1; row <=givenNumber ; row++)
        {
            for (int space = 1; space <=(givenNumber-row) ; space++)
            {
                System.out.print(" ");
            }
            for (int column = 1; column <=row ; column++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void prac7() {
        System.out.print("Enter a number: ");
        int givenNumber;
        givenNumber =input.nextInt();

        for (int row =givenNumber; row >= 1; row--)
        {
            for (int column =1; column <=row; column++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void prac6() {
        int givenNumber;
        givenNumber = input.nextInt();

        for (int row = 1; row <=givenNumber ; row++)
        {
            for (int column = 1; column <=row ; column++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void prac5() {
        System.out.println("Enter a number: ");
        int givenNumber = input.nextInt();

        for (int row = 1; row <= givenNumber ; row++)
        {
            if (row==1 || row==givenNumber)
            {
                for (int column = 1; column <=givenNumber ; column++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }else
            {
                for (int column = 1; column <= givenNumber; column++)
                {
                    if (column==1 || column==givenNumber)
                    {
                        System.out.print("*");
                    }else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }
    }

    private static void prac4() {
        int givenNumber;
        String msg = "";
        System.out.print("Enter a number: ");
        givenNumber =input.nextInt();
        int originNumber = givenNumber;

        while (givenNumber!=0)
        {
            int anotherNumber = givenNumber/10;
            int reminder = givenNumber %10;
            msg +=reminder;
            givenNumber = anotherNumber;
        }
        if (originNumber == Integer.parseInt(msg))
        {
            System.out.println("it is palindrome");
        }else
        {
            System.out.println("it is not palindrome");
        }
    }

    private static void prac3() {
        int positiveNumber = 0;
        int negetiveNumber = 0;
        int zero =0;
        int number;

        for (int i = 0; i <= 5; i++) {
            System.out.printf("Enter a number "+ (i+1)+":");
            number =input.nextInt();
            if (number>0)
            {
                positiveNumber++;
            }else if (number<0)
            {
                negetiveNumber++;
            }else
            {
                zero++;
            }
        }
        System.out.println("positivecount: "+ positiveNumber);
        System.out.println("negetivecount: "+ negetiveNumber);
        System.out.println("zero count: " + zero);
    }

    private static void prac2() {
        System.out.printf("%s%10s%10s\n","Number","Square","Cube");
        for (int i = 0; i <=10 ; i++)
        {
            System.out.printf("%d%12d%12d\n",i,(i*i),(i*i*i));
        }
    }

    private static void prac1() {
        int givenNumber;
        System.out.print("Enter a number: ");
        givenNumber =input.nextInt();
        int counter = 0;
        int  sum =0;

        while (givenNumber!=0)
        {
            int anotherNumber = givenNumber/10;
            int reminder = givenNumber%10;
            sum += reminder * Math.pow(2,counter);
            counter++;
            givenNumber = anotherNumber;
        }
        System.out.println(sum);
    }
}
