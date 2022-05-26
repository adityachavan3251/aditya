31.  Method Ocverriding
   
 claas A
{
void massage()
{
System.out.println("This is method overriding");
}
}

class B exyends()
{
void massage()
{
System.out.println("This is my methodss");
}
}

class Demo5 
{
public static void main(String args[])
{
B a=new B();
a.massage();
}
}