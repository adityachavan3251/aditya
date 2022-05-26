41. 2D array program


import java.util.Scanner;
class TwoD
{
public static void main(String args)
{
  Scanner sc=new Scanner();
 int a[][]=new int[5][5];
 int i,j;
for (i=0;i<5;i++)
for (j=0;J<5;j++)
{
System.out.println("enter number");
a[i][j]=sc.nextInt();
}
for (i=0;i<5;i++)
{
 for (j=0;j<3;j++)
  System.out.println(a[i][j]+" ");
System.out.println();
}
}
}