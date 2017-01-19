package com.company;

/**
 * Created by shusa on 19-Jan-17.
 */
public class java5loop {

    public static void main(String[] args){

        int i =1;

        while(i <=20){

            if(i == 3){
                i+=2;                                      // if i++ than it will start from 4 ;
                continue;
            }

            System.out.println(i);
            i++;

            if((i%2) == 0) {
                i++;

                if(i >10){
                    break;
                }
            }
        }

    }
}
