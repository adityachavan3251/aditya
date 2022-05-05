public class Extending_thread_class extends Thread  
{    
    public void run()  
    {    
        System.out.println("hello aditya  thread is running");    
    }    
    public static void main(String args[])  
    {    
        Extending_thread_class A=new Extending_thread_class();    
       
        A.start();    
    }    
}   
