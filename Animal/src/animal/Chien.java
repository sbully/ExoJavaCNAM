package animal;

public class Chien extends Animal {

	public Chien(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Je suis un Chien, je m'appelle "+ this.nom ;
	}
}
