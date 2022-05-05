public class Runnable_interface implements Runnable
{
public void run()
{
	System.out.println("hello  aditya1 the thread is running");
}
public static void main(String args[])
{
	Runnable_interface t =new Runnable_interface();
	Thread t1=new Thread(t);
	t1.start();
	}
}
