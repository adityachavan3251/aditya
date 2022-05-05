import java.util.TreeSet;
import java.util.Iterator;
public class Treeset_reverse {
    public static void main(String[] args) {
        TreeSet<String> t_set = new TreeSet<String>();
        t_set.add("BMW");
        t_set.add("LEMBORGINI");
        t_set.add("FORTUNER");
        t_set.add("RANGE ROVER");
        t_set.add("FORD");
        System.out.println("Original tree set:" + t_set);
        Iterator it = t_set.descendingIterator();
        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}