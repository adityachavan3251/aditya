9.write aprogram to find x rece to y     

import java.util.Scanner;
Class Product
{
public static void main(String args[])
{
int x,y,p=1;
 Scanner sc =new scanner(System.in);
System.out.println("Enter Base");
x=sc nextInt();
System.out.println("Enter product");
y=sc nextInt();

while(y>0)
{
p=p*x;
y--;
}
System.out.println("value="+p);
}
}