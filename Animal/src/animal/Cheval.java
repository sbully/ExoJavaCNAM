package animal;

public class Cheval extends Animal {

	public Cheval(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Je suis un Cheval, je m'appelle "+ this.nom ;
	}
}
