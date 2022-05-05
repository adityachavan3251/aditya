public class IsDemon extends Thread
{
	public void run()
{ 
		if(Thread.currentThread().isDaemon())
{
	System.out.println("This is my demon thread");
	
}
else
{
System.out.println("This is users thread");
}
}
public static void main(String[]args)
{
	IsDemon D1=new IsDemon();
	IsDemon D2=new IsDemon();
	IsDemon D3=new IsDemon();
	
	D1.setDaemon(true);
	D1.start();
	D2.start();
	D3.start();
	System.out.println(D1.isDaemon());
   }			
}