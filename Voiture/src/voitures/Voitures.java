package voitures;

public class Voitures {

	public static void main(String[] args) {
		int[][] tableauVente = new int[][]{{0,5,2,3},{4,6,5,0},{3,0,4,3},{6,2,0,7}};
		String[] tableauVendeur = new String[]{"Jean","Paul","Jeanne","Paule"};
		String[] tableauModele = new String[]{"2 Cv","205","R5","404"};
		int[] tableauPrixModele = new int[]{20000,30500,25000,22400};
		
		System.out.print("\t");
		for(String modele : tableauModele) {
			System.out.print(modele+ "\t");
		}
		System.out.println("TOTAL");
		for(int i=0; i<tableauVente.length; i++) {
			System.out.print(tableauVendeur[i]+ "\t");
			int total =0;
			for(int j=0; j<tableauVente[0].length; j++) {
				System.out.print(tableauVente[i][j]+ "\t");
				total+= tableauVente[i][j]*tableauPrixModele[j];
				
			}
			System.out.println(total);
		}
	}

}
