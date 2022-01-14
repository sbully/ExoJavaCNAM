package interface1;

public class Main {

	public static void main(String[] args) {
		FormeComparable[] tableau = {
        new Carre(2),
        new Cercle(2),
        new Carre(3),
    };
		
		for(FormeComparable forme : tableau) {
			System.out.println(forme + "; surface = "+forme.surface());
		}
		
		System.out.println(tableau[0].toString() + " est plus grand que "+tableau[1] +" ? "+tableau[0].estPlusGrand(tableau[1]) );
		
		
	}

}
