package printLambda;

public class PrintLambda {

	public static void main(String[] args) {
		String test = "";
		if(args.length >0) {
			test= args[0];
		}
		else {
			test= "Pas de chaine passé en argument";
		}
		
		
		
		Printer printArg = new PrintArg();
		Printer printString = new PrintString();
		Printer printReserve = new PrintReverseString();
		
		printArg.print(test);
		printString.print(test);
		printReserve.print(test);
	}


}
