import java.util.*;
public class Remove {
    public static void main(String[] args) {
        List<String> D = new ArrayList<String>();
        D.add("bmw");
        D.add("maruti");
        D.add("lemborgini");
        D.add("Range rover");
        D.add("ford");
        System.out.println(D);
        D.remove(2);
        System.out.println("After DELETING THIRD element from the list:\n"+D);
    }
}
