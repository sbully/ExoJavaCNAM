package animal;

public class Chat extends Animal {

	public Chat(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Je suis un Chat, je m'appelle "+ this.nom ;
	}
}
