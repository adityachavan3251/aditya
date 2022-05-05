public class Set_priority extends Thread  
{    
    public void run()  
    {    
        System.out.println(" The Priority of thread is: "+Thread.currentThread().getPriority());    
    }    
    public static void main(String args[])  
    {      
        Set_priority t1=new Set_priority();    
       
        t1.setPriority(Thread.MAX_PRIORITY);    
        t1.start();    
    }    
}  