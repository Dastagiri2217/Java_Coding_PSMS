package GFGQuestions;

import java.util.Scanner;

public class  RotateArray90 {
    public static void printMatrix(int matrix[][],int n,int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transposeMatrix(int matrix[][],int n,int m){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public static void reverseMatrix(int matrix[][],int n,int m){
        for(int i=0;i<n;i++){
            int st = 0,end=m-1;
            while(st<end){
                int temp = matrix[i][st];
                matrix[i][st] = matrix[i][end];
                matrix[i][end] = temp;
                st++;end--;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Matrix (rowSize,colSize): ");
        int rowSize = sc.nextInt();
        int colSize = sc.nextInt();
        int matrix[][] = new int[rowSize][colSize];
        System.out.println("Enter Elements : ");
        for(int i=0;i<rowSize;i++){
            for(int j=0;j<colSize;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Before Rotation : ");
        printMatrix(matrix, rowSize, colSize);
        System.out.println("After 45* Degrees Rotation ");
        transposeMatrix(matrix,rowSize,colSize);
        printMatrix(matrix, rowSize, colSize);
        System.out.println("After (45+45)-> 90* Degrees Rotation ");
        reverseMatrix(matrix,rowSize,colSize);
        printMatrix(matrix, rowSize, colSize);
        sc.close();
    }
}
