package ArrDemo;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);


        int row, column;
        
        System.out.println("Enter the number of rows in the array: ");
        row = sc.nextInt();
        System.out.println("Enter the number of columns in the array: ");
        column = sc.nextInt();
        
        int[][] array1 = new int[row][column];
        int[][] array2 = new int[row][column];
        int[][] array3 = new int[row][column];

        System.out.println("Enter the elements of the array1: ");
        for(int i =0; i< row; i++ ){
            for(int j = 0; j < column; j++){
                array1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the array2: ");
        for(int i =0; i< row; i++ ){
            for(int j = 0; j < column; j++){
                array2[i][j] = sc.nextInt();
            }
        }

        //  |1 2 3|   |1 2 3|
        //  |4 5 6| + |4 5 6|
        //  |7 8 9|   |7 8 9|       
        //Sum of the Array
        for(int i =0; i< row; i++ ){
            for(int j = 0; j < column; j++){
               array3[i][j] = array1[i][j]+array2[i][j]; 
            }
        }
         // Print the sum array
        if(row == column){
            System.out.println("Sum of the two arrays is: ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print(array3[i][j] + " ");
                }
                System.out.println();
            }
        }
        else{System.out.println("Sum of the given arrays is not posstible");}

        sc.close();

    }
}
