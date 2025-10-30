import java.util.Scanner;

class Array {
       public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    

    int[] arr = new int [10];
        System.out.println("Array created of size: " + arr.length );
    
    System.out.println("Enter the elements of array: ");
    for (int i=0; i<arr.length; i++){
        arr[i] = sc.nextInt();
    }


    for (int i= 0; i<arr.length; i++){
        System.out.print( arr[i]);
    }

    System.out.println();
    int sum = 0;
    System.out.print("The sum of the array is: ");
    for (int i = 0; i<arr.length; i++){
        sum+= arr[i];
    }

    System.out.println(sum);
}
}