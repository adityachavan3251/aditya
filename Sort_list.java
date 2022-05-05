import java.util.*;
public class Sort_list{
    public static void main(String[] args) {
        List<String> s = new ArrayList<String>();
        s.add("rose");
        s.add("sunflower");
        s.add("lotus");
        s.add("jasmin");
        s.add("lavender");
        System.out.println("before sorting"+s);
        Collections.sort(s);
        System.out.println("After sorting"+s);
    }
}