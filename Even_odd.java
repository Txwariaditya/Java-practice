import java.util.Scanner;

class Even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sumEven = 0, sumOdd = 0;

        System.out.print("Even numbers: ");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                sumEven += num;
            }
        }
        System.out.println("\nSum of even numbers: " + sumEven);

        System.out.print("Odd numbers: ");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
                sumOdd += num;
            }
        }
        System.out.println("\nSum of odd numbers: " + sumOdd);

        sc.close();
    }
}
