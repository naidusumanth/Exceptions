package Exceptions;

public class ThrowException {
	static void Qualified(int Marks){  
	     if(Marks<20)  
	      throw new ArithmeticException("notqualified");  
	     else  
	      System.out.println("qualified");  
	   }  
	   public static void main(String args[]){  
	      Qualified(16);  
	      System.out.println("remaining part of code ");  
	  }  

}
