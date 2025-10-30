class Calculator {
    public int add(int a, int b) {
        System.out.println("Calculator: Adding two numbers");
        return a + b;
    }
}

class AdvancedCalculator extends Calculator {
    @Override
    public int add(int a, int b) {
        System.out.println("AdvancedCalculator: Adding in child class");
        return a + b + 10;
    }
}

public class Method_overriding {
    public static void main(String[] args) {
        Calculator basic = new Calculator();
        System.out.println("Basic Add: " + basic.add(5, 10));

        AdvancedCalculator adv = new AdvancedCalculator();
        System.out.println("Advanced Add: " + adv.add(5, 10));
    }
}
