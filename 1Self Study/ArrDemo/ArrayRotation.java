package ArrDemo;

public class ArrayRotation {
        static void reverse(int[] array, int sp, int ep){
        
        while(sp <= ep){
            int temp = array[sp];
            array[sp] = array[ep];
            array[ep] = temp;
            sp ++;
            ep --;
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        // OP = [9,0,1,2,3,4,5,6,7,8]
        // R1 = [1,2,3,5,4]
        // R2 = [4,5,3,2,1]
        // R3 = [4,5,1,2,3]
        int d = 2;
        int n =arr.length;
        System.out.println("the length: "  + n);


        reverse(arr, n-d, n-1);

        reverse(arr, 0, n-1);

        reverse(arr, d, n-1);

        System.out.println("The Rotated array is: ");
        for(int i =0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
