package at.fhj.swd.confmana.calc.functions;

public class SquareRoot {
	
	// Calculates the square root from a double value
	public double sqrt(double value){
		if(value < 0)
			throw new IllegalArgumentException();

		return Math.sqrt(value);
	}
}
