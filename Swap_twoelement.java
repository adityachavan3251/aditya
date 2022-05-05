import java.util.ArrayList;
import java.util.Collections;
public class Swap_twoelement {
    public static void main(String[] args) {
        ArrayList<String> s= new ArrayList<String>();
        s.add("aditya");
        s.add("pande");
        s.add("ganesh");
        s.add("kunal");
        s.add("dharam");

        System.out.println("Array list before Swap:");
        for(String a: s){
            System.out.println(a);
        }
        Collections.swap(s, 0, 2);
        System.out.println("Array list after swap:");
        for(String b: s){
            System.out.println(b);
        }
    }
}