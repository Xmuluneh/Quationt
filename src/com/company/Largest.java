package com.company;

public class Largest {
    static boolean isPrime(int n){
        if(n<1){
            return false;
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }

            }
            return true;
        }
    }
     static int numberOfPrimes(int n){
        int max=0;
        for(int i=1;i<n;i++){
            if(isPrime(i)){
                if(i>max){
                    max=i;
                }
            }
        }
        return max;
     }
    public static void main(String[] args) {
        System.out.println("the largest prim number is:"+numberOfPrimes(100));
    }
}
