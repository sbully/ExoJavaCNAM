package interface1;

public class Cercle implements FormeComparable{
	public static final double PI= 3.14159;
    private double r;
    public Cercle(double r) { 
    	this.r = r; 
    }
	@Override
	public double surface() {
		return  (PI * r * r);
	}

	@Override
	public String toString() {
		return "Cercle " + r ;
	}
}
