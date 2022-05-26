38. Selection Sort

import java.util.Scanner;
class  Selection
{
int a[]=new int[10];
void getdataa()
{
Scanner sc=new Scanner(System.in);
int i;
for (i=0;i<10;i++)
{
System.out.println("enter no");
a[i]=sc.nextInt();
}
}

void putdata()
{
int i;
for (i=0;i<10;i++)
System.out.println(a[i]);
}

void sort(0
{
int i,j,t;
for(i=0;i<9;i++)
for(j=i;j<10;j++)
{
if (a[i]>a[i])
{
t=a[i];
a[i]=a[j];
a[j=[t];
}
}
class DemoN2
 {
public static void main(String args[]){

selection a=new selection();
a.gaedata();
System.out.println("unsorted Array ");
a.putdata();
System.out.println("Sorted Array");
a.sort();
a.putdata();
}
}