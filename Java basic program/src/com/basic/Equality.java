49.write a program to check equality of two Strings

 import java.util.Scanner;
 class Equality
{
public static void main(String args)
{
 String s1=new String();
 String s2=new String();
 Scanner sc =new Scanner(System.in);
 Sysrem.out.println("Enter first String");
 s1=sc.nextLine();

 Sysrem.out.println("Enter second String");
 s2=sc.nextLine();

Sysrem.out.println("case sensitive checking:");
Sysrem.out.println("no case sensitive checking:");
if (s1.equalsIgnoreCase(s2))
Sysrem.out.println("Equal String");
else
Sysrem.out.println("Not Equal String");
}
}