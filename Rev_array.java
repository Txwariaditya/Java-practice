public class Rev_array {
    public static void main(String[] args) {
        int[] array = {2, 4, 5, 3, 6};

        // Method 1
        System.out.println("Method 1");
        int[] rev_array = new int[array.length];
        System.out.println("The Orignal array is: ");
         for (int ict = 0; ict < array.length; ict++) {
            System.out.print(array[ict] + " ");
        }
        System.err.println(" ");

        System.out.println("Array in reverse:");
        int c1=0;
        int c2 = array.length-1;
       while (c1 < array.length){
        rev_array[c1] = array[c2];
        c1++;
        c2--;
       }
        for (int ict = 0; ict < rev_array.length; ict++) {
            System.out.print(rev_array[ict] + " ");
        }
        System.out.println(" ");

        // Method 2
        System.out.println("Method 2");

        int[] new_array = {2, 4, 5, 3, 6};
        int i=0;
        int j = new_array.length-1;
        
        while(i <= j){
            int temp =new_array[i];
            new_array[i] = new_array[j];
            new_array[j] = temp;
            i++;
            j--;

        }
        for (int ctr = 0; ctr < new_array.length; ctr++) {
            System.out.print(new_array[ctr] + " ");
        }

    }
}




