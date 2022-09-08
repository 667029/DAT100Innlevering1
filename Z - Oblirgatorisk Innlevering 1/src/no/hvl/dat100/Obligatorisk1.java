package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Math.*;

public class Obligatorisk1 {

	public static void main(String[] args) {
		
		String belopTxt=showInputDialog("Din bruttoinntekt: ");
		double belop=parseInt(belopTxt);
		
		if (belop>=0) {
			{
			if (belop<164100) {
			double skattEn=belop*0;
			double nettoEn=belop-skattEn;
			String skattEnTxt="Din bruttoinntekt er: "+belop+"kr."+"\n"+"Din nettoinntekt er: "+nettoEn+"kr."+"\n"+"Din trinnskatt er: "+skattEn+"kr.";
			showMessageDialog(null,skattEnTxt);
			} else {
				if (belop<230950) {
				double skattTo=belop*0.0093;
				double nettoTo=belop-skattTo;
				String skattToTxt="Din bruttoinntekt er: "+belop+"kr."+"\n"+"Din nettoinntekt er: "+nettoTo+"kr."+"\n"+"Din trinnskatt er: "+skattTo+"kr.";
				showMessageDialog(null,skattToTxt);
				} else { 
					if (belop<580650) {
					double skattTre=belop*0.0241;
					double nettoTre=belop-skattTre;
					String skattTreTxt="Din bruttoinntekt er: "+belop+"kr."+"\n"+"Din nettoinntekt er: "+nettoTre+"kr."+"\n"+"Din trinnskatt er: "+skattTre+"kr.";
					showMessageDialog(null,skattTreTxt);
					} else {
						if (belop<935050) {
						double skattFire=belop*0.1152;
						double nettoFire=belop-skattFire;
						String skattFireTxt="Din bruttoinntekt er: "+belop+"kr."+"\n"+"Din nettoinntekt er: "+nettoFire+"kr."+"\n"+"Din trinnskatt er: "+skattFire+"kr.";
						showMessageDialog(null,skattFireTxt);
						} else {
							double skattFem=belop*0.1452;
							double nettoFem=belop-skattFem;
							String skattFemTxt="Din bruttoinntekt er: "+belop+"kr."+"\n"+"Din nettoinntekt er: "+nettoFem+"kr."+"\n"+"Din trinnskatt er: "+skattFem+"kr.";
							showMessageDialog(null,skattFemTxt);
						}
					}
				}
			}
		}
			
		} else {
			String feilMld="Kan ikke taste inn negativ inntekt.";
			showMessageDialog(null,feilMld);	
		}
	}
}
