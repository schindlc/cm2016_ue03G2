package at.fhj.swd.confmana.calc.functions;

public class RootN {
	public double rtN(double first, double root)
	{
		double result = Math.pow(first, 1/root);
		return result;
	}
}
