29. multiple Inheritance

import java.util.Scanner;
class A
{
  int a;
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter numbers");
a=sc nextInt();
class B extend A
{
  int b;
void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
b=sc int nextInt();
}

class Cextends B
{
void add()
{
System.out.println("Addition"+(a+b));
}
}

class Demo3 
{
public static void main(String args)
{
c a=new e();
a.Input();
a.getdata();
a.add();
}
}
