55.  String buffer in java

 import java.util.Scanner;
 class Sringb
{
  public static void main(StringBuffer();
  {
    SringBuffer str=new StringBuffer();
    Scanner sc=new Scanner (System.in);
    str.append(sc.nextLine());
    str.setCharAt(3,'u');
    System.out.println(str);
    str.insert(3,"ABCD");
    System.out.println(str);
    str.setLength(20);
    System.out.println(str);
  }
}