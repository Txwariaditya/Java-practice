import java.util.Scanner;

public class MultiplyMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r1 = 2;
        int c1 = 3;
        int r2 = 3;
        int c2 = 3;

        int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];


        System.out.println("Enter values for first matrix (" + r1 + "x" + c1 + "):");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter values for second matrix (" + r2 + "x" + c2 + "):");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        if (c1 == r2) {
            int c[][] = new int[r1][c2];

            // Multiply
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    c[i][j] = 0; 
                    for (int k = 0; k < c1; k++) { 
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }

            System.out.println("Resultant Matrix (" + r1 + "x" + c2 + "):");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix multiplication not possible!");
        }
    }
}
