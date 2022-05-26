61. multithreding thread method 

1.yield 
2.sleep
3.Stop
  
  class Threadmethods
{
  public static void main (String args)
{
  A thread1=new A();
  B thread1=new B();
  C thread1=new C();
System.out.println("Thread A is Starts..");
Thread1.start();
System.out.println("Thread B is Starts..");
Thread2.Start();
System.out.println("Thread C is Starts..");
Thread3.Start();
}
}

class A extends Thread
{
  public void run()
{
  for (int i=1;i<=5;i++)
{
  if (i==1)
yield();
System.out.println("\N from thread A: i="+i);
}

class B extends Thread
{
  public void run()
{
   for (int j=1;j<=5;j++)
  {
    System.out.println("\n from Thread B: j="+j );
    if(j==3)
    stop();
}
  class C extends Thread
{
   public void run()
{
   
    for (int j=1;j<=5;j++)
  {
    System.out.println("\n from Thread C: k="+k );
    if (k==1)
    try
     {
         sleep(1000);
     }
         catch(Exception e)
   
}
   System.out.println("End of thread C" );
 }
}
