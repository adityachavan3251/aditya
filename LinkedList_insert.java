        import java.util.LinkedList;
        public class LinkedList_insert {
        public static void main(String[] args) {
        LinkedList<String>I=new LinkedList<String>();
        I.add("vinod");
        I.add("adi");
        I.add("ravi");
        I.add("rohan");
        I.add("abhi");
        System.out.println("orignal LinkedList: "+I);
        System.out.println("add the name after vinod that is");
        I.add(1,"ganesh");
        System.out.println("the linked list:"+ I);
        }
        }
