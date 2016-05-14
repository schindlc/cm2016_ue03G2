package at.fhj.swd.confmana.calc.functions;

public class Divider {
	public double div(double first, double second){
		// insert meaningful code here and adopt dummy return
		if (second==0) throw new IllegalArgumentException("invalide imput");
		return first/second;
	}
}
