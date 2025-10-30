public class Pal {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 2, 3, 1};

        System.out.println("The inputed array is:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");

        int c1=0, c2 =array.length-1;
        int temp_ret = 1;
        while(c1 < c2){
            
            if (array[c1] != array[c2]){
                temp_ret=0;
                break;
            }
            
            c1++;
            c2--;
        }
        if(temp_ret == 0){
            System.out.println("FALSE");
        }
        else{
            System.out.println("TRUE");
        }
    }
}

// OPTIMIZE VERSION 
// public class Pal {
//     public static void main(String[] args) {
//         int[] array = {1, 3, 2, 2, 3, 1};

//         System.out.print("The inputed array is: ");
//         for (int num : array) {
//             System.out.print(num + " ");
//         }
//         System.out.println();

//         System.out.println(isPalindrome(array) ? "TRUE" : "FALSE");
//     }

//     public static boolean isPalindrome(int[] arr) {
//         int start = 0, end = arr.length - 1;
//         while (start < end) {
//             if (arr[start++] != arr[end--]) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }


