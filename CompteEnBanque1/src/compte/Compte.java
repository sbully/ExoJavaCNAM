package compte;

public class Compte {
	private String nom;
	private double solde;
	
	public Compte(String nom) {
		this.nom = nom;
	}
	
	public void deposer(double montant) {
		this.solde+= montant;
	}
	
	public void retirer(double montant) {
		this.solde-=montant;
	}
	
	public void afficher() {
		System.out.println(this.nom+" - Solde:"+solde);
	}
	public void virerVers(double montant, Compte destination) {
		this.retirer(montant);
		destination.deposer(montant);
	}
}
