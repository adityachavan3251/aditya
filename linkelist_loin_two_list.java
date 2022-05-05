import groovy.lang.GString;

import java.util.Collections;
import java.util.LinkedList;
public class linkelist_loin_two_list {
    public static void main(String[] args) {
        LinkedList<String>j=new LinkedList<String>();
        j.add("adi");
        j.add("rohan");
        j.add("rohit");
        j.add("karunesh");
        j.add("abhi");
        j.add("chetan");
        System.out.println("the first linked list:"+j);

        LinkedList<String>t=new LinkedList<String>();
        t.add("vinod");
        t.add("avi");
        t.add("ganesh");
        t.add("kunal");

        System.out.println("The second linked list:"+t);

        LinkedList<String> c =new LinkedList<String>();
        c.addAll(j);
        c.addAll(t);
        System.out.println("two list are added heare:"+c);

    }
}
