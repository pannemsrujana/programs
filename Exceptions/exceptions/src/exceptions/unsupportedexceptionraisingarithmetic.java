package exceptions;

import java.util.Scanner;

public class unsupportedexceptionraisingarithmetic {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
        System.out.println("enter i value");
        int i=s.nextInt();
        System.out.println("enter j value");
        int j=s.nextInt();
        try
        {
        	int k=i/j;
        	System.out.println("answer"+k);
        }
        catch(ArithmeticException e) {
        	 throw new UnsupportedOperationException("zero cannot divide any number");
        }
	}

}
