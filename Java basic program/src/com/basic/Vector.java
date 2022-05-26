56. vector in java


 import java.util.Scanner;
 class Vector
{
  public static void main(String args)
{
  Vector a=new Vector();
  a.addElement("aditya");
  a.addElement("Ganesh");
  a.addElement("kunal");
  a.addElement("kiran");
  a.addElement("amol");
 
   System.out.println("the list of vector is :"+ a);

a.insertElementAt("RAvi",2);
System.out.println("new list is":a);
}
}

