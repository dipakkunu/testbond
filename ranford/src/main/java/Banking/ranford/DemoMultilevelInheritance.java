package Banking.ranford;


	 class Fifteen
	 {
		 public void pune(){
			 System.out.println("this is pune");


		}

	}
	 class Thirteen extends Forteen{
			 public void bangalore(){
				 System.out.println("this is bangalore");
			 }
			 public void chennai(){
				 System.out.println("this is chennai");
			 }
		  }
		 
		 class Forteen  extends  Fifteen{
			 public void mumbai(){
				 System.out.println("this is mumbai");
			 }
			 public void delhi(){
				 System.out.println("this is delhi");
			 }
		 }
		 
		 
		 public class DemoMultilevelInheritance{
			   public static void main(String[] args) {
					System.out.println("begining");
					Thirteen t1=new Thirteen();
					t1.bangalore();
					t1.chennai();
					t1.mumbai();
					t1.delhi();
					t1.pune();
					
					Forteen f1=new Forteen();
					f1.mumbai();
					f1.delhi();
					f1.pune();
					Fifteen f2=new Fifteen();
					f2.pune();



				}
		 }




