40.Insertion Sort

import java.util.Scanner;
class Insertion_sort
{
int a[]=new int[10];
void getdata()
{
 int i;
Scanner sc=new Scanner(System.in);
for(i=0;i<10;i++)
{
System.out.println("enter numbers");
a[i]=sc.nextInt();
}
}

void putdata()
{
int i;
for(i=0;i<10;i++)
System.out.println(a[i]);
} 

void Sort()
{
  int i,val,j

  for (i=1;i<10;i++)
{
val=a[i];
j=i-1;
while (val<a[j])
{
 a[j+1]=a[j];
j--;
if (j==-1)
break;
}
a[j+1]=val;
}
}

public static void main(Straig args)
{
  insertion_sort a=newinsertion_sort();
a.getdata();
System.out.println("unsorted array");
a.putdata();
a.sort();
System.out.println("Sorted array");
a.putdata();
}
}