import java.util.Iterator;
import java.util.LinkedList;
public class linkelist_iterate_startposition {
    public static void main(String[] args) {
        LinkedList<String> s = new LinkedList<String>();
        s.add("Red");
        s.add("Green");
        s.add("Black");
        s.add("White");
        s.add("Pink");
        Iterator p = s.listIterator(1);
        while (p.hasNext()) {
            System.out.println(p.next());
        }
    }
}
