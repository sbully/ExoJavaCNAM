package book;

import java.util.*;

public class Auteur {
	private String nom;
	private String prenom;
	private List<Livre> listLivre = new ArrayList<Livre>();
	
	
	public Auteur(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void addLivre(Livre livre) {
		this.listLivre.add(livre);
	}
	private String getStringListLivre() {
		String stringListLivre="";
		if(!listLivre.isEmpty()) {
			for(Livre livre : listLivre) {
				stringListLivre+= "\t - \""+livre.getTitre()+"\" ("+livre.getPublicationDate()+")\n";
			}
		}
		return stringListLivre;
	}
	
	@Override
	public String toString() {
		return (nom +" " + prenom + "\n"+getStringListLivre());
	}

}
