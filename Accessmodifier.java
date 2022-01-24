
 
	  class Main
	  {
		private int x=25;  
		public int y=35; 
		int z=40;
		protected int w=11;
		}  
		  
	public class Accessmodifier extends Main
		{  
		 public static void main(String args[]){  
			 Accessmodifier obj=new Accessmodifier();  
		   System.out.println(obj.y);//it prints 35  
		   //System.out.println(obj.x);//it gives compile time error since a is private variable
		   System.out.println(obj.z);//it prints 40 as it belongs to same package
		   System.out.println(obj.w);//it prints  11 as class B is extending class A 
		   
		   }  
		}

