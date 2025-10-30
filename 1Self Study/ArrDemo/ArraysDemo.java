package ArrDemo;

public class ArraysDemo {
    public static void main(String[] args) {
        
    
    // Scanner sc = new Scanner(System.in);

    // Reverse the array
    {
    int[] arr = {1,2,3,4,5,6};
    for(int len =0; len < arr.length; len++){
        System.out.print(arr[len] + " ");
    }
    System.err.println("");
    int [] rev_arr = new int[arr.length];

    int i = arr.length-1,j =0;
    while(i>=0){
        rev_arr[j] = arr[i] ;
        i--;
        j++;
    }
    for(int len =0; len < arr.length; len++){
        System.out.print(rev_arr[len] + " ");
    }
    }

    // Max and min of the array
    {
    int max =0, min=0;
    int[] demo_arr = {1,2,3,4,5,6};
    for (int len = 0; len < demo_arr.length; len++){
        if(demo_arr[len]>max){
            max = demo_arr[len];
        }
        if(demo_arr[len] < min){
            min = demo_arr[len];
        }
    }
    System.out.println("The maximum number of the given array is: " +max);
    
    System.out.println("The minimum number of the given array is: " +min);}
    }
}
