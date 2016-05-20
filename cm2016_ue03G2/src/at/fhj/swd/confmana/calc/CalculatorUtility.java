package at.fhj.swd.confmana.calc;

import org.junit.Test;

import at.fhj.swd.confmana.calc.functions.Adder;
import at.fhj.swd.confmana.calc.functions.Cosine;
import at.fhj.swd.confmana.calc.functions.Divider;
import at.fhj.swd.confmana.calc.functions.IntRotatorLeft;
import at.fhj.swd.confmana.calc.functions.IntRotatorRight;
import at.fhj.swd.confmana.calc.functions.Multiplier;
import at.fhj.swd.confmana.calc.functions.NumToInt;
import at.fhj.swd.confmana.calc.functions.NumToString;
import at.fhj.swd.confmana.calc.functions.PowerOfN;
import at.fhj.swd.confmana.calc.functions.PowerOfTwo;
import at.fhj.swd.confmana.calc.functions.Randomizer;
import at.fhj.swd.confmana.calc.functions.RootN;
import at.fhj.swd.confmana.calc.functions.Sine;
import at.fhj.swd.confmana.calc.functions.SquareRoot;
import at.fhj.swd.confmana.calc.functions.Subtractor;

public class CalculatorUtility {

	/**
	 * Functions of calculator
	 * only created on demand.  
	 */
	
	private static Adder adder;
	private static Subtractor subtractor;
	private static Multiplier multiplier;
	private static Divider divider;
	private static PowerOfTwo powerOfTwo;
	private static SquareRoot squareRoot;
	private static PowerOfN powerOfN;
	private static RootN rootN;
	private static Sine sine;
	private static Cosine cosine;
	private static NumToString numToString;
	private static NumToInt numToInt;
	private static Randomizer randomizer;
	private static IntRotatorLeft intRotatorLeft;
	private static IntRotatorRight intRotatorRight;
	
	/**
	 * creates the adder when first called and adds the two parameters 
	 * @param first  first addend 
	 * @param second second addend
	 * @return sum of first and second addend
	 */
	public static double add(double first, double second){
		if (adder == null){
			adder = new Adder();
		}
		return adder.add(first, second);
	}
	
	public static double sub(double first, double second){
		// insert meaningful code here and adopt dummy return
		return 0;
	}
	
	public static double mul(double first, double second){
		// insert meaningful code here and adopt dummy return
		if(multiplier==null) multiplier=new Multiplier();
		return multiplier.mul(first, second);
	}
	
	public static double div(double first, double second){
		// insert meaningful code here and adopt dummy return
		if(divider==null) divider=new Divider();
		return divider.div(first, second);
	
		
		
	}
	
	public static double pow2(double first){
		// insert meaningful code here and adopt dummy return
		return 0;
	}
	
	public static double sqrt(double first){
		// insert meaningful code here and adopt dummy return
		return 0;
	}
	
	public static double powN(double first, double power){
		if(powerOfN == null){
			powerOfN = new PowerOfN();
		}
		return powerOfN.powN(first, power);
	}
	
	public static double rtN(double first, double root)
	{	
		if (rootN == null)
		{
			rootN = new RootN();
		}
		return rootN.rtN(first, root);
	}
		
	
	public static double sin(double first){
		// insert meaningful code here and adopt dummy return
		if (sine == null)
			sine = new Sine();
		return sine.sin(first);
	}

	
	public static double cos(double first){
		// insert meaningful code here and adopt dummy return
		return 0;
	}
	
	public static String numToString(double first){
		// insert meaningful code here and adopt dummy return
		return null;
	}
	
	public static int numToInt(double first){
		// insert meaningful code here and adopt dummy return
		if (numToInt == null)
			numToInt = new NumToInt();
		return numToInt.numToInt(first);
	}
	
	public static double randomize(int lowerBound, int upperBound){
		if(randomizer == null){
			randomizer = new Randomizer();
		}
		return randomizer.rand(lowerBound, upperBound);
	}
	
	public static double getLastRandomNumber(){
		if(randomizer == null){
			randomizer = new Randomizer();
		}
		return randomizer.getLastRandomNumber();
	}
	
	public static int intRotateLeft(int number){
		// insert meaningful code here and adopt dummy return
		return 0;
	}
	
	public static int intRotateRight(int number){
		// insert meaningful code here and adopt dummy return
		return 0;
	}
	
}
