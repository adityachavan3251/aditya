54. print reverse Each word to string.


  import java.util.Scanner;
   class Reverseword
{
  public static void main(String args)
  {
     Scanner sc =new Scanner(System.in);
    System.out.println("Enter String");
    name =sc.nextLine();
   int i,j,k;
  i=name.length()-1;
    while(i>=0)
    {
      j=i
      while (name.charAt(j)!='' && J>0) 
       j--;
     if(j==0)
     k=0;
     else
      k=j+1;
       while(k<=i)
     {
     System.out.println(nameAt(k));
     k++;
    }
      System.out.print("");
      i=j-1;
}
}
}