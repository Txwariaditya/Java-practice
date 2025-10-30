public class ReverseFibonacci {

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static void printReverseFibonacci(int n) {
        if (n < 0) {
            return;
        }
        System.out.print(fibonacci(n) + " ");
        printReverseFibonacci(n - 1);
    }

    public static void main(String[] args) {
        int terms = 7;
        printReverseFibonacci(terms - 1);
    }
}