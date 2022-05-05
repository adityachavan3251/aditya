import java.util.*;

public class Hashset_to_arraylist {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<String>();
        h_set.add("adi");
        h_set.add("vinod");
        h_set.add("kunal");
        h_set.add("ganesh");
        h_set.add("avi");
        h_set.add("akshay");
        System.out.println("Original Hash Set: " + h_set);
        List<String> list = new ArrayList<String>(h_set);
        System.out.println("ArrayList contains: "+ list);
    }
}