package Exceptions;

import javax.activity.InvalidActivityException;

public class CustomException {
	 static void Qualified(int Marks)throws InvalidActivityException{  
	     if(Marks<20)  
	      throw new InvalidActivityException("notqualified");  
	     else  
	      System.out.println("qualified ");  
	   }  
	     
	   public static void main(String args[]){  
	      try{  
	      Qualified(14);  
	      }catch(Exception A){System.out.println("Exception in: "+A);}  
	  
	  }  
	}  

