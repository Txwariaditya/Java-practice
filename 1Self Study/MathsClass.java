
import java.util.Scanner;

public class MathsClass {
    public static void main(String[] args) {
        // Find the Hypotonuse of Trinagle

        double per, base;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr Perpendicular and Base of the Triangle: ");

        per = sc.nextInt();
        base = sc.nextInt();

        double hyp;
        hyp = Math.pow(per,2) + Math.pow(base,2);

        System.out.println("The Hypotenuse of the given triangle is: " + Math.sqrt(hyp));
        

    }
}
