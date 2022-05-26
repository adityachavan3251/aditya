22. Star printing
  
  import java.util.Scanner;
class Star
{
  public static void main(String args[])
{
int n,j;
Scanner sc=new Scanner(System.in)
System.out.println("Enter numbers of rows");
n=sc.nextInt();
for (;n>1;n--)
{
for (j=1;j<=n;j++)
System.out.print("*");
}
System.out.println();
}
}
}