public class Pattern {

    static void printStars(int n) {
        if (n == 0) {
            return;
        }
        System.out.print("* ");
        printStars(n - 1);
    }

    static void printPattern(int rows, int currentRow) {
        if (currentRow > rows) {
            return;
        }
        printStars(currentRow);
        System.out.println();
        printPattern(rows, currentRow + 1);
    }

    public static void main(String[] args) {
        int n = 5;
        printPattern(n, 1);
    }
}