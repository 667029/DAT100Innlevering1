package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Math.*;

public class Obligatorisk2 {

	public static void main(String[] args) {
		
		
		for (int i=1; i<=10; i++) {
		
		String poengTxt, A, B, C, D, E, F, feil;
		poengTxt=showInputDialog("Tast inn din poengsum (Heltatt fra 100 til 0): ");
		A="Karakter A";
		B="Karakter B";
		C="Karakter C";
		D="Karakter D";
		E="Karakter E";
		F="Karakter F";
		feil="Du har tastet inn ugylidig poengsum, prøv igjen.";
		int poeng=parseInt(poengTxt);
				
		while ((poeng>100)||(poeng<0)) { 
			showMessageDialog(null,feil);
			poengTxt=showInputDialog("Tast inn din poengsum (Heltatt fra 100 til 0): ");
			poeng=parseInt(poengTxt);
		}
		
		if ((poeng<=100)&&(poeng>=90)) {
			showMessageDialog(null,A);
		} else if ((poeng<=89)&&(poeng>=80)) {
			showMessageDialog(null,B);
		} else if ((poeng<=79)&&(poeng>=60)) {
			showMessageDialog(null,C);
		} else if ((poeng<=59)&&(poeng>=50)) {
			showMessageDialog(null,D);
		} else if ((poeng<=49)&&(poeng>=40)) {
			showMessageDialog(null,E);
		} else {
			showMessageDialog(null,F);
					
				
			}
		}
	}
} 
