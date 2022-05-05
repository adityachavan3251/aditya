    import java.util.Collections;
    import java.util.LinkedList;
    import java.util.Iterator;
    public class Linkelist_iterate_reverse {
    public static void main(String[] args) {
        LinkedList<String>R =new LinkedList<String>();
        R.add("ms dhoni");
        R.add("virat kohli");
        R.add("rohit sharma");
        R.add("hardik pandya");
        R.add("bumra");
        R.add("klrahul");

        System.out.println("the orignal liste is " + R);
         Iterator it = R.iterator();
        Collections.reverse(R);
        System.out.println("the element is reversed order:");
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

       }
    }
