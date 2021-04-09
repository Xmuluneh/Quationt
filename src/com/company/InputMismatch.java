package com.company;

import java.util.InputMismatchException;

public class InputMismatch {
    public static void main(String[] args) {

        java.util.Scanner scanner=new java.util.Scanner(System.in);
        boolean flag=true;
        do{
            try{
                System.out.println("Enter any Integer ");
                int number=scanner.nextInt();
                System.out.println("The entered number is "+number);
                flag=false;
            }catch (InputMismatchException ex){
                System.out.println("Please input the correct number format");
                scanner.nextLine();
            }
        }while(flag);
        long value=Long.MAX_VALUE;
        long value1=Long.MIN_VALUE;
        System.out.println(value);
        System.out.println(value+1);
        System.out.println(value1);
    }
}
