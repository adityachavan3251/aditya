8.Write a program to find sum of even & product fo odd digits

import java.util.scanner;
class Demo
{
 public static void main()String[])
{
Scanner sc=new Scanner(System.in);
int n, sum=0,p=1,digit;
System.out.println("enter the number");
n=sc nextInt();
while(n>0)
{
digit=n%10;
if (digit%2==0)
sum=sum+digit;
else
p=p*digit;
n=n/10;
System.out.println("sum="+sum+"p="+p);
}
}