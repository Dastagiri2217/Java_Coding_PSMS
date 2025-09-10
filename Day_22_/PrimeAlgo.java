package GFGQuestions;

import java.util.Scanner;

public class PrimeAlgo {
    public static void findPrimesuptoN(int n){
        boolean isPrime[] = new boolean[n+1];
        for(int i=2;i<=n;i++){
            isPrime[i] = true;
        }
        for(int i=2;i*i<=n;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=n;j+=i){
                    isPrime[j] = false;
                }
            }
        }
        System.out.println("The Prime Numbers from 1 to n are : ");
        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                System.out.print(" "+i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //PSM : Print the Prime numbers from 0 to N
        System.out.println("Enter the N value : ");
        int n = sc.nextInt();
        findPrimesuptoN(n);
        sc.close();
    }
}
