package intro;

public class Main {

	public static void main(String[] args) {
	  System.out.println("Hello world!");	

	   String ortaMetin = "İlginizi Çekebilir";
	   String altMetin = "Vade süresi";
			   System.out.println(ortaMetin);
	
			   
		int vade = 12 ;	   
		
		double dolarDun = 18.13;
		double dolarBugun = 18.15;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
				
		if (dolarBugun<dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		} 
		
		else if (dolarBugun>dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
			
		}
		
		
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		//array
		
		String[] krediler= {"Hızlı Kredi","Maaşını Halkbaktan","Mutlu Emekli"};
		
		
		
		
		for (int i = 0; i < krediler.length; i++) {
			
			System.out.println(krediler[i]);
			
			
		} 
		
		
		}
			   
			   
			   
	}


