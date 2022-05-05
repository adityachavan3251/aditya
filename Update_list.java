import java.util.ArrayList;
import java.util.List;

public class Update_list{
    public static void main(String[]args)

    {
        List<String> L = new ArrayList<String>();
        L.add("aditya");
        L.add("vonod");
        L.add("kunal");
        L.add("narandra");
        System.out.println(L);
        L.set(2, "akshay");
        System.out.println(L);
       }
     }

