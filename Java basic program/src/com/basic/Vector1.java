57. Vector function in java

   import java.util.Scanner;
   class Vector1 
{
  public static void main(String args[]);
{
   Vector list=new Vector();
 list.addElement("Aditya");
 list.addElement("Rohan");
 list.addElement("Akshay");
 list.addElement("Rohit");
 list.addElement("chetan");

 System.out.println(list);
list.instrtElementAt("mayur"1);
System.out.println(list);
System.out.println("size of vector="+list.size());
list.removeElement("Akshay");
System.out.println("After removing Akshay "+list);
list.removeElementAt(1);
System.out.println("After Removing first Index"+list);
list.removeAllElements();
System.out.println("After removing All"+list);
}
}