package Banking.ranford;

public class D {


	static void sum(int a,long b){System.out.println("int arg  invoked");}  
	static void sum(long a,int b){System.out.println("long arg method invoked");}  

	public static void main(String args[]){  
		D obj=new D();  
		obj.sum(20,20L);//now int arg sum() method gets invoked 
		obj.sum(20L, 24);
	}  



}


