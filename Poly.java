public class Poly {
    

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double add(double a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Poly calc = new Poly();
        System.out.println(calc.add(5, 10));         
        System.out.println(calc.add(5, 10, 15));
        System.out.println(calc.add(2.5, 3.0));      
        System.out.println(calc.add(2.5, 3));
    }
}


