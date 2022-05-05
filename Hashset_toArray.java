import java.util.HashSet;
public class Hashset_toArray {
    public static void main(String[] args) {
        HashSet<String> H =new HashSet<String>();
        H.add("maruti");
        H.add("bmw");
        H.add("fotuner");
        H.add("rangerover");
        H.add("ford");
        System.out.println("orignal hashset:" + H);


        String[] new_array= new String[H.size()];
        H.toArray(new_array);
        System.out.println("Array element:");
        for (String element :new_array){
            System.out.println(element);
        }

    }
}

