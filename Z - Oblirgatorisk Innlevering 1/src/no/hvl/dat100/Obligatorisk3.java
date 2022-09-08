package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Math.*;

public class Obligatorisk3 {

	public static void main(String[] args) {
		
		String tallTxt=showInputDialog("Skriv inn heltall: ");
		int tall=parseInt(tallTxt);
		int resultat=1;
			
		for (int i=2; i<=tall; i++) {
			resultat=resultat*i;	
			// kunne også skrevet resultat*=i;
		}
			
		String resultatTxt="Verdien: "+resultat;
		showMessageDialog(null,resultatTxt);

	}
}
