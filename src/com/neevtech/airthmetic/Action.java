package com.neevtech.airthmetic;


public class Action{
	
	public static void main(String arg[]){

		Operations opr = new Operations();
		
		float num1,num2;
		String operator;

		if(arg.length < 4){

			num1 = Float.parseFloat(arg[0]);
			num2 = Float.parseFloat(arg[1]);
			operator = arg[2];
				
			if( operator.equalsIgnoreCase("add") || operator.equalsIgnoreCase("addition") )
				opr.add(num1,num2);
			else if( operator.equalsIgnoreCase("sub") || operator.equalsIgnoreCase("subtract") )
				opr.subtract(num1,num2);
			else if( operator.equalsIgnoreCase("mul") || operator.equalsIgnoreCase("multiply") )
				opr.multiply(num1,num2);
			else if( operator.equalsIgnoreCase("div") || operator.equalsIgnoreCase("divide") )
				opr.divide(num1,num2);
			else
				System.out.println("Not a valid operator.");

		} else{
			System.out.println("Too Few Arguments for Operation.");
		}
	}
}
