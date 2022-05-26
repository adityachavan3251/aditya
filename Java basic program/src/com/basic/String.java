
46.Count the total numbers of vovels

 imprt java.util.Scanner(System.in);
 class String
{
  public static void main(String args)
{
  String a=new String();
  Scanner sc =new Scanner(System.in/)
  System.out.println("enter numbers");

a=sc.nextline();
int i,vowel,cons;
vowel=cons=0;
for (i=0;i<a.length();i++)
{
char ch=a.charAt(i);
if(ch!=' ')
{
if ((ch=='a')|| (ch=='e')|| (ch=='i')|| (ch=='o')|| (ch=='u'));
vowel++
else
cons++;
}
}
System.out.println("total vowals="+vowel+vowel+"total consonants="+cons);
}
}