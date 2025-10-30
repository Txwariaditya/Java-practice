
import java.util.SortedSet;
import java.util.TreeSet;


public class Sets {
    // public static void main(String[] args) {
    //     HashSet<Integer> set = new HashSet<>();

    //     set.add(10);
    //     set.add(20);
    //     set.add(30);

    //     System.out.println(set);

    //     set.remove(10);
    //     System.out.println(set);

    //     for (int num : set) {
    //         System.out.println(num);
    //     }
    // }



    public static void main(String[] args) {
        SortedSet <Integer> ss= new TreeSet<>();

        ss.add(25);
        ss.add(25);
        ss.add(15);
        ss.add(125);
        ss.add(50);
        ss.add(60);
        ss.add(70);

        ss.remove(70);

        System.out.println(ss);

    }
}