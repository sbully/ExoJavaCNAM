package main;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Max {

	public static void main(String[] args) {
		int[] tableau = new int[]{12, 87, 56, 4, -5 , 18};
		int max = Arrays.stream(tableau).max().getAsInt();
		int index = IntStream.range(0, tableau.length)
                .filter(i -> tableau[i]== max)
                .findFirst()
                .orElse(-1);
		double moyenne = 0;
		for(int value : tableau) {
			moyenne +=value;
		}
		moyenne = moyenne / tableau.length;
		System.out.println("max = " +max);
		System.out.println("index max = "+index);
		System.out.println("moyenne = "+moyenne);
	}

}
