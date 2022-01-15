package animal;

public class Animal {
protected String nom;

public Animal(String nom) {
	this.nom = nom;
}

@Override
public String toString() {
	return "Je suis un animal, je m'appelle "+ nom ;
}

}
