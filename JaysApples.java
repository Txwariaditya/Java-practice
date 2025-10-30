import java.util.*;

public class JaysApples {

    
    public static int minApple(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;
        Arrays.sort(arr);
        int count = 1;  
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 1, 1};
        System.out.println(minApple(arr1)); 

    }
}