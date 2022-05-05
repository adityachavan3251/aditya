      import java.util.*;
      public class LinkedList_remove_first_Last {
      public static void main(String[] args) {
        LinkedList<String> R = new LinkedList<String>();
        R.add("Red");
        R.add("Green");
        R.add("Black");
        R.add("Pink");
        R.add("orange");
        System.out.println("The Original linked list: " + R);
        Object firstElement = R.removeFirst();
        System.out.println("Element removed: "+ firstElement);
        Object lastElement = R.removeLast();
        System.out.println("Element removed: "+ lastElement);
        System.out.println("The New linked list: " + R);
    }
}