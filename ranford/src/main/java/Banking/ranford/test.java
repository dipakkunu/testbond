package Banking.ranford;

public class test 
{
	static String name="deepak";
	 test(String name)
	{
		this.name=name;
		
	}
	 public void dispaly()
	 {
		 System.out.println(name);
	 }
	static int addition(int x)
	{
		return x*x;
		
	}
    
    
	public static void main(String[] args) 
	{
	test st=new test("kumar");
	
      st.dispaly();

	}

}
