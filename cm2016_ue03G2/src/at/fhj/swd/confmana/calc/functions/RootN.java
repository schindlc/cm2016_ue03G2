package at.fhj.swd.confmana.calc.functions;

public class RootN {
	public double rtN(double first, double root)
	{
		if (first < 0)
		{
			throw new IllegalArgumentException("invalid input");
		}
		else
		{
			double result = Math.pow(first, 1/root);
			return result;
		}
	}
}
