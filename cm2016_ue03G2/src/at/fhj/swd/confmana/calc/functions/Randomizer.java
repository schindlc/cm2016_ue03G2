package at.fhj.swd.confmana.calc.functions;

/**
 * Randomizer is a class to generate a random number
 * between lower and upper bounds.
 * @author cschindler
 *
 */
public class Randomizer {
	
	private double lastRandomNumber = 0;

	public double rand(int lowerBound, int upperBound){
		
		if (lowerBound > upperBound){
			int temp = lowerBound;
			lowerBound = upperBound;
			upperBound = temp;
		} 
		lastRandomNumber = Math.random();
		double sN = (upperBound - lowerBound) * lastRandomNumber;
		return lowerBound + sN;
	}

	public double getLastRandomNumber() {
		return lastRandomNumber;
	}
}
