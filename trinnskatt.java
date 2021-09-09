package no.hvl.no;


import static javax.swing.JOptionPane.*;

public class trinnskatt {

	public static void main(String[] args) {
		

		String tallTxt = showInputDialog("Inntekt"); 
		int inntekt = Integer.parseInt(tallTxt);
		double skattesats = 0;
		
		if (inntekt <= 164100)
			System.out.println("Du trenger ikke å skatte");
		else if (inntekt >= 164100 && inntekt <= 230950) {
				skattesats = 0.0093;
				System.out.println("Din skatt er " + inntekt*skattesats);
		} else if (inntekt >= 230950 && inntekt <= 580650) {
				skattesats = 0.0241; 
				System.out.println("Din skatt er " + inntekt*skattesats);
		} else if (inntekt >= 580650 && inntekt <= 934050){
				skattesats = 0.1152; 
				System.out.println("Din skatt er " + inntekt*skattesats);
		} else if (inntekt >=  934050) { 
				skattesats = 0.1452;
				System.out.println("Din skatt er " + inntekt*skattesats);
	
			}	
	}
}
