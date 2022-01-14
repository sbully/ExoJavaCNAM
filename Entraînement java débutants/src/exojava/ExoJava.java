package exojava;

public class ExoJava {

	public static void main(String[] args) {
		int[] myArray = new int[]{1,5,4,12,16,1};
		ExoJava ex = new ExoJava();
		System.out.println("--------------------------");
		System.out.println("comparer 1er et dernier element du tableau [1,5,4,12,16,1] ");
		System.out.println(ex.CompareElement(myArray));
		System.out.println("--------------------------");
		System.out.println("multiplier ou diviser chiffre entré 10");
		ex.DivideOrMultiplier(10);
		System.out.println("--------------------------");
		System.out.println("pyramide chiffre 5:");
		ex.DrawPyramid(5);
		System.out.println("--------------------------");
		System.out.println("Convertion binaire vers décimal:");
		System.out.println(ex.ConvertToDecimal("11111111"));

	}
	private boolean CompareElement( int[] array) {
		if(array[0]==array[array.length-1]) {
			return true;
		}else{ 
			return false;
		}
	}
	
	private void DivideOrMultiplier(int numb) {
		
		System.out.println("le nombre est égale à "+numb);
		
		if(numb !=1) {
			if(numb%2 == 0) {
				DivideOrMultiplier(numb/2);
				
			}
			else {
				DivideOrMultiplier(numb*3+1);
			}
		}
	}
	
	private void DrawPyramid(int numb) {
		for(int i=1; i<=numb; i++) {
			for(int j=i; j>0;j--) {		
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println();
		}		
	}

	private int ConvertToDecimal(String binaryString) {
		int decimal = 0;
		int lenght = binaryString.length();
		for(int i=0;i< binaryString.length(); i++) {
			decimal += (int) (Character.getNumericValue(binaryString.charAt(i))*Math.pow(2,(lenght-(i+1))));
		}
		return decimal;
		
	}
	
}
