package interface1;

public interface FormeComparable extends Forme{

	default boolean estPlusGrand(FormeComparable f) {
		if(this.surface()>f.surface()) {
			return true;
		}
		return false;
	};
}
