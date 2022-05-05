import org.codehaus.groovy.runtime.GStringImpl;

import java.util.HashSet;
import java.util.Iterator;
public class HashSet_iterate{
    public static void main(String[] args) {
        HashSet<String>H=new HashSet<String>();
        H.add("red");
        H.add("green");
        H.add("black");
        H.add("white");
        H.add("pink");
        H.add("yello");
        Iterator<String> p=H.iterator();
        while (p.hasNext()) {
            System.out.println(p.next());

        }
    }
}





