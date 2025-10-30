package ArrDemo;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    int row, column;
        
    System.out.println("Enter the number of rows in the array: ");
    row = sc.nextInt();
    System.out.println("Enter the number of columns in the array: ");
    column = sc.nextInt();
        
    int[][] array = new int[row][column];
    int[][] arrayTrans = new int[row][column];

    System.out.println("Enter the elements of the array: ");
    for(int i =0; i< row; i++ ){
        for(int j = 0; j < column; j++){
            array[i][j] = sc.nextInt();
        }
    }
    //|1 2 3|   |1 4 7|
    //|4 5 6| = |2 5 8|
    //|7 8 9|   |3 6 9|
    for(int i =0; i< row; i++ ){
        for(int j = 0; j < column; j++){
            arrayTrans[j][i] = array[i][j];
        }
    }
    System.out.println("Orignal Array is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose Array is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arrayTrans[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
}
}
