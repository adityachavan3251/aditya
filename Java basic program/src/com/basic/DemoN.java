36. Linear Search 

import java.util.Scanner;
class 
{
int a[]=new int[10];int key;
void getdata()

{
Scanner sc =new Scanner(System.in);
int i;
for (i=0;i<10;i++)
{
System.out.println("Enter number to Search ");
key=sc.nextInt();
}

void search()
{
int(i,flag=0,pos;
for(i=0;i<10 && flag==0;i++)
{
if (a[i]==key)
{
flag=1;
pos=i+1;
}
}
if(flag==!)
System.out.println("no formate"+pos);
else
System.out.println("no not formate");
}
}

class DemoN
{
public static void main(String args[])
{
leaner a=new leaner();
a.getdata();
asearch();
}
}