package Banking.ranford;
public class sortingstar {
	public static void main(String[] args)
	{	
	    int num=0;
		for(int i=1;i<6;i++)
		{
			for(int j=6-i;j>0;j--)
	{
				System.out.print(" ");
			}
			
			for(int j=1;j<i;j++){
				System.out.print(num +" ");
				num=num+1;
			}
			System.out.println("");
		}
/*     for(int i=5;i>0;i--)
     {
    	 for(int j=i;j>0;j--)`
    	 {
    		 System.out.print("*");
    	 }
    	 System.out.println();
     }*/

	}

}
