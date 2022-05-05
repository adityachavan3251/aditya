import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Linkelist_to_arraylist {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList <String> ();
        link.add("adi");
        link.add("vinod");
        link.add("abhi");
        link.add("ganesh");
        link.add("narandra");
        System.out.println("Original linked list: " + link);
        List<String> list = new ArrayList<String>(link);

        for (String str : list){
            System.out.println(str);
        }
    }
}