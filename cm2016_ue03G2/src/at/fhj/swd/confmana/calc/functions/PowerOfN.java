package at.fhj.swd.confmana.calc.functions;

import java.lang.Math;

public class PowerOfN {
	/**
	 * The exponent of a base says how many times to use the number in a multiplication
	 * @param first base 
	 * @param power exponent
	 * @return result of first^power
	 */

	public double powN(double first, double power){
		return Math.pow(first, power);
	}
}
