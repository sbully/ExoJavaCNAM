package compte;

public class CompteAvecDecouvertHeritage extends Compte{
	private double decouvertMax;
	
	public CompteAvecDecouvertHeritage(String nom, double decouvertMax) {
		super(nom);
		this.decouvertMax = decouvertMax;
	}
	
	@Override
	public void afficher() {
		System.out.println(this.getNom()+" - Découvert max "+this.decouvertMax+" - Solde:"+this.getSolde());
	}

	@Override
	public void retirer(double montant) throws DecouvertException {
		if(this.getSolde()-montant< -this.decouvertMax ) {
			throw new DecouvertException("Retrait de "+montant+" impossible");
		}
		this.solde-=montant;
	}

}
