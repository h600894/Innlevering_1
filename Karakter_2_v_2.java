package no.hvl.no;

import static javax.swing.JOptionPane.*;

public class Karakter_2_v_2 {

	public static void main(String[] args) {
		for (int i = 1; i <=10; i++) {
			String karakterTxt = ""; 
			
			String poengTxt = showInputDialog("Poengsum :"); 
			int poeng = Integer.parseInt (poengTxt); 
			
			if (90<= poeng && poeng <=100) {
				karakterTxt = "A"; 
			}else if (80<= poeng && poeng <=89){
				karakterTxt = "B";
			}else if (60 <= poeng && poeng <= 79){
				karakterTxt = "C";
			}else if (50<= poeng && poeng <= 59) {
				karakterTxt = "D";
			}else if (40 <= poeng && poeng <= 49) {
				karakterTxt = "E";
			}else if (0<= poeng && poeng <= 39) {
				karakterTxt = "F";
			}else {
				i--;
				
				showMessageDialog(null, "Ugyldig poengsum");
				
			}
			if (!karakterTxt.equals("")) {
				showMessageDialog(null, "Din karakter er " + karakterTxt);
			}
		}
		
	}
}
