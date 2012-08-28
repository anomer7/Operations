1. Export the project into Eclipse.
2. Run the build.xml
3. Copy the operators.jar from the dist folder and paste it anywhere.
4. Now using terminal enter into that directory and run the .jar file as follows:
	
	$ java -jar operations.jar <num1> <num2> <operator>
	
	Here is brief description of the command line arguments:
		
		num1: num1 should be a numerical value.
		
		num2: num2 should be a numerical value.
	
		operator: operator should be a string like this,

				for addition:		"add" or "addition"
				for subtraction:	"sub" or "subtract"
				for multiplication:	"mul" or "multiply"
				for division:		"div" or "divide"


example:
	$ java -jar operations.jar 12 10 add
	   
Output: 
	Addition of 12.0 and 10.0 is 22.0.
