package compte;

public class CompteAvecDecouvertComposition {
	private double decouvertMax;
	private Compte compte;

	public CompteAvecDecouvertComposition(String nom, double decouvertMax) {
		this.compte = new Compte(nom);
		this.decouvertMax = decouvertMax;
	}

	
	public void deposer(double montant) {
		this.compte.deposer(montant);
	}
	
	public void retirer(double montant) throws DecouvertException {
		if(this.compte.getSolde()-montant< -this.decouvertMax ) {
			throw new DecouvertException("Retrait de "+montant+" impossible");
		}
		this.compte.retirer(montant);
	}
	
	public void virerVers(double montant, CompteAvecDecouvertComposition destination) throws DecouvertException {
		
		this.retirer(montant);
		destination.deposer(montant);
	} 
	
	public void afficher() {
		System.out.println(this.compte.getNom()+" - Découvert max "+this.decouvertMax+" - Solde:"+this.compte.getSolde());
	}
	
	
}
