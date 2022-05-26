39. Bubble Sort program

imoprt java.util.Scanner;
class Bubble
{
  int a[]=new int [10];
void getdata()
{
Scanner sc=new Scanner();
for (i=0;i<10;i++)
{
 System.out.println("enter no");
a[i]=sc.nextInt();
}
void putdata()
{
int i;
for (i=0;i<10;i++)
System.out.println(a[i]);

void 
{
   int i,j,t;
for(i=0;i<10;i++}
for(j=0;j<9-i;j++)
{
if(a[i];>a[j+1])
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
}

class DemoN3
{
public statuc void main(String args[])
{
bubble a=new bubble();
a.getdata();
System.out.println("unsorted Array");
a.putdata();
}
}
