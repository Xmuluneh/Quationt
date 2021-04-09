package com.company;

public class Main {

    public static void main(String[] args) {
        java.util.Scanner scanner=new java.util.Scanner(System.in);
        System.out.println( "Enter two numbers");
        int number_1=scanner.nextInt();
        int number_2=scanner.nextInt();
        try{
            int result=operation(number_1,number_2);
            System.out.println("the operation is done:"+result);
        }
        catch (ArithmeticException ex){
            System.out.println("Integer can't be divide by zero");

        }
        System.out.println("Execution is continues");


    }
    static int operation(int n1,int n2){
        if(n2==0){
            throw  new ArithmeticException("n2 can't be zero");
        }
            return n1/n2;


    }

}
