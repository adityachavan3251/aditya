//10.program with constructor        --------Default constructor--------
package com.basic;

import java.util.Scanner;
class Add
{
int a=0,b=0;
add(int x,int y)
{
a=x;
b=y;
}
void input()
{

Scanner sc=new Scanner(System.in);
System.out.println("enter first number");
a=sc nextInt();
System.out.println("enter first number");
b=sc nextInt();
}
 
void display()
{
System.out.println("a="+a +b="+b);
}

void output()
{
int c;
c=a+b;
System.out.println("addition"+c);
}
public static void main(String args[])
{
add a=new add();
a.input();
a.display();
a.output();
 }
}