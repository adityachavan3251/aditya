import java.util.*;
public class Reverse_list{
    public static void main(String[] args) {
        List<String> R = new ArrayList<String>();
        R.add("SALMAN");
        R.add("SHARUKH");
        R.add("AKSHAY");
        R.add("AJAY");
        R.add("ARYA");
        System.out.println("List before reversing :\n" + R);
        Collections.reverse(R);
        System.out.println("List after reversing :\n" + R);
    }
}