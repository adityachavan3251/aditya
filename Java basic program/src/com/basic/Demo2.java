28.Inheritance concept

import java.util.Scanner;
class A
{
int a,b;

   void input()
{
Scanner sc=new Scanner(System.in);
Sytem.out.println("enterfirst numbers");
a=sc nextInt();
Sytem.out.println("enter second numbers");
b=sc nextInt();
 void add()
{
System.out.println("addition="+(a+b));
}
}

class B
{
int c;
void getdata()
{
scanner sc =new Scanner(System.in);
System.out.println("Enter number");
c=sc.nextInt();
}

void display()
{
System.out.println("addition"+(a+b+c));
}
}
 class Demo2
{
Public static void main(String args[])
{
B a=new B();
A a=new A();
 A.input();
 B.getdata();
a.add();
a.display();
}
}
