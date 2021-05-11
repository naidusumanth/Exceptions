package Exceptions;

public class FinallyBlock {
	public static void main(String []args)
	{
		try{  
			   int data=25; 
			   int arr[]= {2,3,4,5};
			   System.out.println(arr[4]);
			   System.out.println(data);  
			  }  
			  catch(ArithmeticException e){
				  System.out.println(e);
				  }  
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println(a);
		}
			  finally{
				  System.out.println("finally block");
				  }  
			  System.out.println("remaing code is excuted");  
			  }  
}
