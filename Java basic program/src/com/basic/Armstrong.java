18. Armstrong number

import java.util.Scanner;
class Armstrong
{
int n,z,count=0;
Scanner sc =new Scanner(System.in);
System.out.println("Enter number");
n=sc.nextInt();
z=n;
while(z>0){
count=count+1;
z=z/10;
}
System.out.println("no of digit="+count);
}
}