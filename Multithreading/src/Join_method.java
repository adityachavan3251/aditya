public class Join_method extends Thread  
{    
    public void run()  
    {    
        for(int i=1; i<=4; i++)  
        {    
            try  
            {    
                Thread.sleep(500);    
            }
            
            catch(Exception e){System.out.println(e);} 
        
            System.out.println(i);    
        } 
    }
    
    
    public static void main(String args[])  
    {   
        
        Join_method t1 = new Join_method();    
        Join_method t2 = new Join_method();    
        Join_method t3 = new Join_method();    
        
        t1.start();   
        
        try  
        {    
            t1.join();    
        }catch(Exception e){System.out.println(e);}    
  
        t2.start();   
        t3.start();    
    }    
}  