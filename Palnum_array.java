public class Palnum_array {
    public static void main(String[] args) {
        int[] array = {121, 313, 2332, 321};
        
        System.out.println("The entered array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");

        int chech_pal = 1;

        for (int idx = 0; idx < array.length; idx++) {
            int rev = 0, temp = array[idx];
            int temp1 = temp;

            while (temp1 > 0) {
                int rem = temp1 % 10;
                rev = rev * 10 + rem;
                temp1 = temp1 / 10;
            }

            if (temp != rev) {
                chech_pal = 0;
                break;
            }

        }

        if (chech_pal == 1) {
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }
}
