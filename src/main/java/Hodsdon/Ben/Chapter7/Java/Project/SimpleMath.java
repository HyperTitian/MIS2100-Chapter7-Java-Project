package Hodsdon.Ben.Chapter7.Java.Project;

public class SimpleMath {
	
	double divide(double numerator, double denominator) throws ArithmeticException {
		
		double result = 0.0;
		
		if(denominator == 0) {throw new ArithmeticException("Denominator cannot be zero");}
		
		else {
			
			result = numerator / denominator;
			
		}
		
		return result;
	}

}
