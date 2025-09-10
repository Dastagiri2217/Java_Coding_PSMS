package GFGQuestions;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to Check : ");
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println(n+" is an Prime Number");
        }
        else{
            System.out.println(n+" is not an prime number");
        }
        sc.close();
    }
}
