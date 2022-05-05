import java.util.TreeSet;
public class Treeset_add_two {
    public static void main(String[] args) {
        TreeSet<String> tree_set1 = new TreeSet<String>();
        tree_set1.add("adi");
        tree_set1.add("rohan");
        tree_set1.add("rohit");
        System.out.println("Tree set1: "+tree_set1);
        TreeSet<String> tree_set2 = new TreeSet<String>();
        tree_set2.add("mayur");
        tree_set2.add("kunal");
        tree_set2.add("vinod");
        System.out.println("Tree set2: "+tree_set2);
        tree_set1.addAll(tree_set2);
        System.out.println("Tree set1: "+tree_set1);
    }
}