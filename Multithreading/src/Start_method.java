public class Start_method extends Thread

{
public void run()
 {
System.out.println("my thread is running");
 }
public static void main(String args[])

{
	Start_method t1=new Start_method();
	t1.start();
 }
}
