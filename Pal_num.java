import java.util.Scanner;

public class Pal_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("The entered number is: " + num);
        
        int  rev=0, temp=num;
        while(num>0){
            int rem = num % 10;
            rev = rev*10+rem;
            num = num/10;
        }

        System.out.println("REV NO: "+ rev);
        if(temp == rev){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
        
        sc.close();
    }
}
