public class Sleep_method extends Thread  
{    
    public void run()  
    {    
        for(int i=1;i<5;i++)  
       {    
           try  
           {  
                Thread.sleep(1000);  
            }catch(InterruptedException e){System.out.println(e);}    
            System.out.println("hello adi");
            try  
            {  
                 Thread.sleep(1000);  
             }catch(InterruptedException e){System.out.println(e);}    
             System.out.println("hello kunal");   
           }       

    }
    public static void main(String args[])  
    {    
    	
    	Thread t1=new Thread();  
        Sleep_method t2=new Sleep_method();   
       
        t1.start(); 
        t2.start();
         
    }    
}  