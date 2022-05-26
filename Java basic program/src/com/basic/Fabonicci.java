17.Fibinacci Serirs 

import java.util.Scanner;
class Fabonicci
{
   Scanner sc =new Scanner(System.in)
  int x=0,y=1,z=0,n;
System.out.println("Enter max value");
n=sc.nextInt();
  while(z<=n)
{
System.out.println(z);
x=y;
y=z;
z=x+y;
}
}