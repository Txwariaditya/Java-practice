package ArrDemo;

public class SecondBiggest {
    public static void main(String[] args) {
        // arr = [7,2,9,2,4,0,,8,5,2,3,9]
        int large = 0;
        // int secLarge = 0;

        int[] arr = {8,7,8,7,7,2,5,0,9,8,5,6,2};

        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j= 0; j < n; j++){
                if(arr[i]>large){
                    large = arr[i];
                }
            }
            
        }
        System.out.println(large);
    }

}
