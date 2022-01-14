package book;


public class TestLivre {

	public static void main(String[] args) {
		Livre firstBook = new Livre("Au bohneur des dames" ,1883);
		Livre secondBook = new Livre("La bête humaine" ,1890);
		Auteur auteur = new Auteur("Emile", "Zola");
		
		
		firstBook.setAuteur(auteur);
		secondBook.setAuteur(auteur);
		auteur.addLivre(firstBook);
		auteur.addLivre(secondBook);
		
		System.out.println(firstBook);
		System.out.println(secondBook);
		System.out.println(auteur);
		
	}

}
