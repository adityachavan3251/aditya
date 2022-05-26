23.Shape printing 

import java.util.Scanner;
class Primid1
{
  public static void main(String args[])
{
int n,i,s,j;
Scanner sc=new Scanner(System.in)
System.out.println("Enter numbers of rows");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
for(s=1;s<=n-i;s++)
System.out.println("_");

for(j=1;j<=i;j++)

System.out.print("*");
}
System.out.println();
}
}
}