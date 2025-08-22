package Others;

import java.util.Scanner;

public class fibnoaciSeries {
   /*
    * 1.Fibnocai Series 
        // public static int printFibnoaciSeriesUptoN(int n){
    //     if(n<=1){
    //         return n;
    //     }
    //     else{
    //      return printFibnoaciSeriesUptoN(n-1)+printFibnoaciSeriesUptoN(n-2);
    //     }
    // }
    Time O(2^n) and Space O(n)
         2.Brute Force
         given in Main
         Time O(n) and Space O(1)
         3.Using Dp Array;
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int first = 0,second = 1;
        // int i=2;
        //  System.out.print(" "+first);
        //  System.out.print(" "+second);
        // while(i<=n){
        //     int temp = first+second; //1
        //     System.out.print(" "+temp);
        //     first = second;
        //     second = temp;
        //     i++;
        // }
        //System.out.println(" "+printFibnoaciSeriesUptoN(n)); //2
        int fib[] = new int[n];
        fib[0] = 0;fib[1] = 1;
        for(int i=2;i<n;i++){
            fib[i] = fib[i-1]+fib[i-2];
        }
        for(int i=0;i<n;i++){
        System.out.print(fib[i]+" ");
        }
    }
}
