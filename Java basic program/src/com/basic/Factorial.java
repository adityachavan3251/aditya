13. to find a factorial program

    import java.util.Scanner;
    class Factorial
{
Scanner sc=new Scanner(System.in);
  int n,fac=1;
System.out.println("Enter number");
n=sc.nextInt();
while(n>0)
{

fac=fac*n;
n=n-1;
}
System.out.println("Factorial+"+fac);
}
}