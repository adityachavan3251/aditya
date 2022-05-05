import java.util.Collections;
import java.util.LinkedList;
public class Linklist_Swap_two_element{
    public static void main(String[] args) {
        LinkedList <String> s = new LinkedList <String> ();
        s.add("Red");
        s.add("Green");
        s.add("Black");
        s.add("Pink");
        s.add("orange");
        System.out.println("The Original linked list: " + s);
        Collections.swap(s, 0, 2);
        System.out.println("The New linked list after swap: " + s);
    }
}