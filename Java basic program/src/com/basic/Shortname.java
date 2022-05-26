53.Print short name in String

 import java.util.Scanner;
class Shortname
{
  public static void main(String args)
  {
    int i,j,x;
    char c,d;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter String");
    name =sc.nextLine();
    i=0;
    j=name.length()-1;
    while (name.charAt(j)!=(''))
    j--;
    x=j;
    while(i<j)
{
   if(i==0)
   System.out.println(name.charAt(i)+".");
   else 
{
  c=name.charAt(i);
  d=name.charAt(i+1);
  if(c=='')&& d!=".");
  System.oout.println(d+".");
 }
i++;
System.out.println(name.substring(x));
}
}
}