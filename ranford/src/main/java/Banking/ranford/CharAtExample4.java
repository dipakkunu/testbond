package Banking.ranford;


public class CharAtExample4 
{  
	
    public static void main(String[] args) 
    { 
    
        String str = "deepak kumar sahoo";          
        for (int i=0; i<str.length(); i++) 
        {  
            if(i%2!=0) { 
        
           System.out.println("Char at "+i+" place "+str.charAt(i));  
          
          }  
        }  
    }  
}  