package printLambda;

public class PrintReverseString implements Printer {

	
	public void print(String str) {
		String newStr = "";
		for(int i=0; i< str.length(); i++) {
			newStr = str.charAt(i)+newStr;
		}
		System.out.println("A l'envers : "+newStr);
	}

}
