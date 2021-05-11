package Exceptions;

public class TryCatchBlock {
	public static void main (String []args)
	{
		 
	        try  
	        {  
	        int data=10/0; 
	        int ar[]= {1,2,3,4};
	        System.out.println(ar[8]);
	        }   
	        catch(ArithmeticException e)  
	        {  
	            System.out.println(e);  
	        }  
	        catch(ArrayIndexOutOfBoundsException A)
	        {
	        	System.out.println(A);
	        }
}
}
