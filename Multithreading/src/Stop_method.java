public class Stop_method extends Thread  
{    
    public void run()  
    {   System.out.println("threads1");
        
    }    
    public static void main(String args[])  
    {    
     
        Stop_method t1=new Stop_method ();    
        Stop_method t2=new Stop_method ();   
       // Stop_method t3=new Stop_method ();   
        t1.setName("ganesh");
        t1.start();
       // t1.stop();
        
        t2.start();
     
      t2.setName("Aditya");
     // t2.stop();  
      
        System.out.println(Thread.currentThread().getName()); 
        System.out.println(t1.getName());
        System.out.println(t2.getName());
    }    
}  