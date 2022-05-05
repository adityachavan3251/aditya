public class SetDaemon
{
public void run()
{
	if(Thread.currentThread().isDaemon())
	{
		System.out.println("Demon thread is working");
		}
	
	else
	{
		System.out.println("user thread is working");
		
	 }
  }
public static void main(String[]args)
{
    SetDaemon s1=new SetDaemon();
    SetDaemon s2=new SetDaemon();
    SetDaemon s3=new SetDaemon();
    
   s1.SetDaemon(true);
   System.out.println("the demon thread"+s1);
   t1.start();
    
   
   }
}
    
    

