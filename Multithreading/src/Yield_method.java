public class Yield_method extends Thread 
{
public void run()
{
	for(int i=0;i<3;i++)
		System.out.println(Thread.currentThread().getName());
}
public static void main(String[]args)
{
	Yield_method t1=new Yield_method();
	Yield_method t2=new Yield_method();
	t1.start();
	t2.start();
	for (int i=0;i<3;i++)
	{ 
		t1.yield();
	System.out.println(Thread.currentThread().getName());
	 }
  }
}
