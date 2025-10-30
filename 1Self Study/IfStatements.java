
import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        
        // Even Odd 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr a number: ");
        int x = sc.nextInt();
        
        if (x % 2 == 0){
            System.out.println("The number " + x + " is Eevn");
        }
        else{
            System.out.println("The number " + x + " is Odd");
        }
        
        // Laegest of two numbers 
        
        System.out.println("Enetr the number1: ");
        int y = sc.nextInt();
        System.out.println("Enetr the number2: ");
        int z = sc.nextInt();
        
        if(y == z ){
            System.out.println("The numbers are euqal");
        }
        if (y>z){
            System.out.println("The number " + x + " is greator");
        }
        else{
            System.out.println("The number " + y + " is greator");
        }
        
        //Grade Calculator
        int OOPJ, FWT, IAI, DAA;
        System.out.println("Enetr the marks of OOPJ: ");
        OOPJ = sc.nextInt();

        System.out.println("Enetr the marks of FWT: ");
        FWT = sc.nextInt();
        
        System.out.println("Enetr the marks of IAI: ");
        IAI = sc.nextInt();

        System.out.println("Enetr the marks of DAA: ");
        DAA = sc.nextInt();

        /*
        If marks ≥ 75 → "B"
        If marks ≥ 50 → "C"
        Else → "Fail".
         */

        int avg = (OOPJ + FWT + IAI + DAA)/4;
         if (avg >= 90){
            System.out.println("The grade of the student is \"A\"");
        }
         if (avg >= 75){
            System.out.println("The grade of the student is \"B\"");
        }
         if (avg >= 50){
            System.out.println("The grade of the student is \"C\"");
        }
         else{
            System.out.println("The grade of the student is \"FAIL\"");
        }
    }
}
