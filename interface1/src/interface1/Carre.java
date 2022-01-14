package interface1;

public class Carre implements FormeComparable{
	private double c;
	
    public Carre(double c) { 
    	this.c = c; 
    }

	@Override
	public double surface() {
		return c * c;
	}

	@Override
	public String toString() {
		return "Carre " + c ;
	}
	
}
