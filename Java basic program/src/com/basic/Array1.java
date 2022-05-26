
35.write aprogram to accept an array from user and find sum of elements of the array

import java.util.Scsnner;
class Array1
{
public void main (String args[])
{
int size,i,sum=0;
System.out.println("enter Size of numbers);
size=sc.nextInt();
int a[]=new int [size];
for (i=0;i<size;i++)
{
System.out.println("Enter numbers");
a[i]=sc.nextInt();
}
for (i=0;i<size;i++)
sum= sum+a[i];
Sustem.out.println("sum"+sum);
}
}