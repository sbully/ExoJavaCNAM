package compte;

public class Compte {
	private String nom;
	protected double solde;
	
	public Compte(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}

	public double getSolde() {
		return solde;
	}

	public void deposer(double montant) {
		this.solde+= montant;
	}
	
	public void retirer(double montant) throws DecouvertException {
		this.solde-=montant;
	}
	
	public void afficher() {
		System.out.println(this.nom+" - Solde:"+solde);
	}
	public void virerVers(double montant, Compte destination) throws DecouvertException {
		this.retirer(montant);
		destination.deposer(montant);
	}
	
}
