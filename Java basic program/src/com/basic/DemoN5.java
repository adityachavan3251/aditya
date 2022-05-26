42.Addition Substraction of matrix program

import java.util.Scanner;
class Addition
{
 int a[][]=new int[5][5];
 int b[][]=new int[5][5];
 int c[][]=new int[5][5];

void getdata()
{
int i,j;
i=j=o;
 
for(i=0;i<5;i++)
for(j=0;j<5;j++)
{
System.out.println("enter number");
a[i][j] = new sc.nextInt();
}

for(i=0;i<5;i++)
for(j=0;j<5;j++)
{
System.out.println("enter numbers");
b[i][j]=sc.nextInt();
}
}
 void Add()
{
int i,j;
i=j=0;
for(i=0;i<5;i++)
for(j=0;j<5;j++)
c[i][j]=a[i][j] +  b[i][j];
}

void putdata()
{
inti,j;

i=j;
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
System.out.println(c[i][j] +"____"  );
System.out.println();
}
}
}

class DemoN5
{
public static void main(String args[])
{
Addition a=new Addition();
a.getdata();
a.Add();
a.putdata();
}
}