//43.multiplicat of two matrix program
package com.basic;

import java.util.Scanner;
class Addition
{
 int a[][]=new int[6][6];
 int b[][]=new int[6][6];
 int c[][]=new int[6][6];

void getdata()
{
int i,j;
void getdata()
Scanner sc=new Scanner(System.in);
System.out.println("enter number for multiply ");
for(i=0;i<5;i++)
for(j=0;j<5;j++)
{
System.out.println("enter numbers");
a[i][j]=sc.nextInt();
}
for(i=0;i<5;i++)
for(j=0;j<5;j++)
{
System.out.println("enter numbers");
b[i][j]=sc.nextInt();
}
}

void putdata()
{
System.out.println("enter  first numbers");
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
System.out.println(a[i][j] +"____"  );
System.out.println();
}
System.out.println("enter  second numbers");
for(i=0;i<5;i++)
System.out.println("Second matrix is");
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
System.out.println(b[i][j] +"____" );
System.out.println();
}

void multiply()
{
int k;
for(i=0;i<5;i++)
for(j=0;j<5;j++)
{
  c[i][j]=0;
for ()k=0;k<3;k++)
c[i][j]=c[i][j] + a[i][k]*b[k][j];
}
System.out.println("multiply is :");
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
System.out.println(c[i][j] +"____" );
System.out.println();
}
}
}
class Demo6
{
public static void main(String args[])
{
Multiply  a=new Multiply();
a.getdata();
a.putdata();
a.Multiply
}
}
