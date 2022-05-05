import java.util.TreeSet;
public class Treeset_iterate {
    public static void main(String[] args) {
        TreeSet<String> tree_set = new TreeSet<String>();
        tree_set.add("aditya");
        tree_set.add("kunal");
        tree_set.add("vinod");
        tree_set.add("narandra");
        tree_set.add("avi");
        for (String element : tree_set) {
            System.out.println(element);
        }
    }
}