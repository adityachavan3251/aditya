47. find the total numbers fo  words

  import java.util.Scanner;
  class Countorder
{
  public static void main(String args[])
{
  String s=new String();int i,count=1;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter string name");
  s= sc.nextline();
int i count=1;

  for (i=0;i<s.length();i++)
{
  if (s.charAt(i)=='' && s.charAt(i+1)!='')
  count=count+1;
}
  System.out.println("total words="+count);
}
}
