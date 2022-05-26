44.Strings programs in java
 
  import java.util.Scanner;
  class String_input
{
  public static void main(String args[])
{
 String name =new String();
 String Add=new String();
Scanner sc=new Scanner(System.in);
 System.out.println("enter your name");
 name=sc.next();
 Add=sc.next();
 System.out.println("name=" +name+"Addition="+Add);
}
}