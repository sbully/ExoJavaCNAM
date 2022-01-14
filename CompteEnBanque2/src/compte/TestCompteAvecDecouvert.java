package compte;

public class TestCompteAvecDecouvert {

	public static void main(String[] args) {
		System.out.println("------Compte Heritage ------");
        try{
        	
        	
        	CompteAvecDecouvertHeritage c1 = new CompteAvecDecouvertHeritage("Compte 1", 1000.0);
        	CompteAvecDecouvertHeritage c2 = new CompteAvecDecouvertHeritage("Compte 2", 4000.0);
            
            System.out.println("===== Etat initial =====");
            c1.afficher();
            c2.afficher();
            
            System.out.println("===== c1.retirer(800.0) =====");
            c1.retirer(800.0);
            c1.afficher();
            
            System.out.println("===== c1.virerVers(500.0, c2) =====");
            c1.virerVers(500.0, c2);
            c1.afficher();
            c2.afficher();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
        System.out.println("\n\n------Compte Composition ------");
        try{

        	CompteAvecDecouvertComposition c1 = new CompteAvecDecouvertComposition("Compte 1", 1000.0);
        	CompteAvecDecouvertComposition c2 = new CompteAvecDecouvertComposition("Compte 2", 4000.0);
            
            System.out.println("===== Etat initial =====");
            c1.afficher();
            c2.afficher();
            
            System.out.println("===== c1.retirer(800.0) =====");
            c1.retirer(800.0);
            c1.afficher();
            
            System.out.println("===== c1.virerVers(500.0, c2) =====");
            c1.virerVers(500.0, c2);
            c1.afficher();
            c2.afficher();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

	}

}
