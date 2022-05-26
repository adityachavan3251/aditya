34.Array programs
 
 import java.util.Scsnner;
class Array
{
public void main (String args[])
{
int a[]=new int[10];
Scanner sc=new Scanner (System.in);
 for (int i=0;i<10;i++)
{
System.out.println("enter numbers");
a[i]=sc nextInt();
}
for (i=0;i<10;i++)
System.out.println(a[i]);
}
}