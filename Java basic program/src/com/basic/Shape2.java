24. Shape printing

 import java.util.Scanner;
class Shape2
{
  public static void main(String args[])
{
int n,i,b,j;
Scanner sc=new Scanner(System.in)
System.out.println("Enter numbers of rows");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
for(b=1;b<i;b++)
System.out.println("_");

for(j=1;j<=n+1-i;j++)

System.out.print("*");
System.out.println();
}
}
}