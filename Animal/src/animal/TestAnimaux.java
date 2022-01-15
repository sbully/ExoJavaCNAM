package animal;

public class TestAnimaux {

	public static void main(String[] args) {
		Animal[] mesAnimaux = new Animal[] {new Chat("Minou"),new Chien("Médor"),new Cheval("Horace")};
		for(Animal animal : mesAnimaux) {
			System.out.println(animal);
		}
	}

}
