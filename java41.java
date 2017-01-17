package com.company;

/**
 * Created by shusa on 17-Jan-17.
 */
public class java41 {

    public static void main(String[] args){

        int valueOne =1;
        int valueTwo =2;

        int biggestValue =(valueOne > valueTwo) ? valueOne : valueTwo;

        System.out.println(biggestValue);

        char theGrade = 'B';

        switch (theGrade){
            case 'a' :
            case 'A' :
                System.out.println("great job");
                break;
            case 'b' :
            case 'B' :
                System.out.println("Good job");
                break;
            case 'c' :
            case 'C' :
                System.out.println("ok");
                break;
            case 'd':
            case 'D':
                System.out.println("bad");
                break;
            case 'f' :
            case 'F' :
                System.out.println("faild");
                break;
                default:
                    System.out.println("you failed");
                    break;


        }

    }
}
