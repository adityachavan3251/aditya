14. Write a program to find All prime number between 1 To 100
 
class Prime1
{
  Public static void main(String args[])
{
  int i,count,j;
for (i=1;i<=100;i++)
{
count=0;
for(j=0;j<=i;j++) 
{
if(i%j==0)
count++;
}
if(count==2)
System.out.println(i);
}
}
}