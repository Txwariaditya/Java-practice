class Inhertance {

    public int add(int a, int b) {
        System.out.println("");
        return  a+b;
    }

    double add(double  a, double b) {
    System.out.println("");
    return  a+b;
    }
    

    private class Secret {
        void message() {
            System.out.println("Accessed private class from public class.");
        }
    }

    public void showSecret() {
        Secret s = new Secret();
        s.message();
    }



    public static void main(String[] args) {
        Inhertance obj = new Inhertance();
        obj.showSecret();


}
}

