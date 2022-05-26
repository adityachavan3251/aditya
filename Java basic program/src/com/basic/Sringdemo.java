52. String Function 

 import java.util.Scanner;
  class Sringdemo
{
  public static void main(String args)
  {
  String s1=new String();
  Scanner sc =new Scanner(System.in)
  System.out.println("Enter first number");
  s1=sc.nextLine();
  System.out.println("Enter Second number");
  s2=sc.nextLine();
  System.out.println(s1.substring(5));
  System.out.println(s1.substring(6,10));
  s3=s1.concate(s2);
  System.out.println(s3);
System.out.println(s1.indexof('y'));
System.out.println(s1.indexof('y',2));
}
}