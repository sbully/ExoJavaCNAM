package book;

public class Livre {
 private String titre;
 private int publicationDate;
 private Auteur auteur;
 
public Livre(String titre, int publicationDate) {
	this.titre = titre;
	this.publicationDate = publicationDate;
}

public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public int getPublicationDate() {
	return publicationDate;
}
public void setPublicationDate(int publicationDate) {
	this.publicationDate = publicationDate;
}
public void setAuteur(Auteur auteur) {
	this.auteur = auteur;
}

@Override
public String toString() {
	return "Livre \""+ titre + "\" (" +(auteur==null ? "":auteur.getNom()+" "+auteur.getPrenom()+" ")+ publicationDate + ")";
}
 
}
