import java.util.*;
public class Hashset_compare_twoset{
    public static void main(String[] args) {
        HashSet<String> h_set1 = new HashSet<String>();
        h_set1.add("BMW");
        h_set1.add("LEMBORGINI");
        h_set1.add("RANGE ROVER");
        h_set1.add("JAGWAR");
        System.out.println("Frist HashSet content: "+h_set1);

        HashSet<String>h_set2 = new HashSet<String>();
        h_set2.add("JAGWAR");
        h_set2.add("RANGE ROVER");
        h_set2.add("MARUTI");
        h_set2.add("FORTUNER");
        System.out.println("Second HashSet content: "+h_set2);

        h_set1.retainAll(h_set2);
        System.out.println("HashSet content:");
        System.out.println(h_set1);
    }
}
