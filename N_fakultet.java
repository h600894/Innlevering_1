package no.hvl.no;

import static javax.swing.JOptionPane.*; 

public class N_fakultet {
	
	static int factorial (int n) {
		if (n == 0)
			return 1; 
		
		return n*factorial (n-1); 
	}

	public static void main(String[] args) {
		
		int tall = Integer.parseInt(showInputDialog("Gi et tall"));
		
		System.out.println("Fakultet av " + tall + " er " + factorial(tall));


	}

}
