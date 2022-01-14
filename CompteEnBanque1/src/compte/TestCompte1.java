package compte;

import java.util.*;

public class TestCompte1 {

	public static void main(String[] args) {
		System.out.println("------Partie 1 ------");
		Compte compte1 = new Compte("Compte 1");
		Compte compte2 = new Compte("Compte 2");
		compte1.deposer(500);
		compte2.deposer(1000);
		compte2.retirer(10);
		compte1.virerVers(75, compte2);
		compte1.afficher();
		compte2.afficher();
		
		
		System.out.println("\n------Partie 2 ------");
		System.out.println("------création de 10 comptes------");
		List<Compte> listCompte = new ArrayList<Compte>();
		
		for(int i=0; i<10;i++) {
			Compte compte = new Compte("Compte "+(i+1));
			compte.deposer(200+100*i);
			listCompte.add(compte);
			
		}
		for(int i=0; i<10;i++) {
			for(int j=i+1; j<10;j++) {
				listCompte.get(i).virerVers(20, listCompte.get(j));
			}
		}
		
		for(Compte compte : listCompte) {
			compte.afficher();
		}
		
	}
	
	

}

