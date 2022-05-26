37.Binary scarch

import java.util.Scanner;
class BInary
{
int a[]=new int[10];
int key;
void getdata()
{
Scanner sc=new Scanner(System.in);
int i;
for(i=0;i<10;i++)
{
System.out.println("Enter no");
a[i]=sc.nextInt();
}

System.out.println("enter no to search");
key=sc.nextInt();
} 

void search()
{
int i,j,mid,flag,pos
i=0;
j=9;
flag=0;
while(i<=j && flag==0)
{
mid=(i+j)/2;
if(a[mid]==key)
{
flag=1;pos=mid+1;
}
if (a[mid]>key)
j=mid-1;
}
if (a[mid]<key)
i=mid+1;
}
if (flag==0)
System.out.println("not formate");
else
Sytem.out.println("no formate"+pos);
}
}
class Demon1
{
public static void main(String args[])
{
binary search a=new binary scarch();
a.getdata();
a.search();
}
}