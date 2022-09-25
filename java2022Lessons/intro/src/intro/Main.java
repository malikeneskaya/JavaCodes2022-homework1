package intro;

public class Main {
	
	public static void main(String[] args) {
	 System.out.println("Hello DuNYA!!");
	 
	 // değişken isimlendirmeleri java'da camelCase yazılır.
	 String ortaMetin ="Ilginizi cekebilir";
	 String altMetin  = "Vade süresi";
	 
	 System.out.println(ortaMetin);
	 
	 //integer
	 int vade = 12;
	 
	 double dolarDun = 18.25;
	 double	dolarBugun = 18.30;
	 
	 boolean dolarDustuMu = false;
	 
	 String okYonu = "";
	 
	 if (dolarBugun<dolarDun) {  //false		 
		okYonu = "down.svg";
		System.out.println(okYonu);
	} else if (dolarBugun>dolarDun) {
		okYonu = "up.svg";
		System.out.println(okYonu);		
	}
	 else {
		okYonu = "equal.svg";
		System.out.println(okYonu);		
	}	 

	 //array
	 
	 String[] krediler = {"Hizli Kredi","Maasini Halkbanktan Alan","Mutlu Emekli"};
	 		 
	 for (int i = 0; i < krediler.length; i++) {		 
		 System.out.println(krediler[i]);
		
	}
	 
	 
	 
	}

}
