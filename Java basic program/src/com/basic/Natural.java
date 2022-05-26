7.Program to print first N Natural numbers

class Natural
{
Public static void main(String args[])
{
Scanner sc=new scanner(System.in);
int i,n;
System.out.println("enter the numbers")
n=sc.nextInt();
int i=1;
while(i<=n)
{
System.out.println(i);
i=i+1;
}
}