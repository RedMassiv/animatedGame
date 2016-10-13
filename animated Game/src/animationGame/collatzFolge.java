package animationGame;

public class collatzFolge {

	public static void main(String[] args) {
		//int n = 27;  //Variable setzen
		//System.out.println("Starte Collatz Folge mit Startwert " + n);
		int hoherWert=0;
		for (int i=1;i<1000000000;i++){
			long n = i;  //Variable setzen
			int schritte = 0;
			//System.out.println("Starte Collatz Folge mit Startwert " + n);
			while ( n > 1) {
				if ( n%2 == 0) {  //prüfen ob ungerade
				n = n /2;         //wenn ja dann durch 2 teilen
				}
				else {			  //wenn zahl nicht gerade dann
					n = 3*n+1;        //3n+1
				}
				//System.out.println(n);   //atuellen Wert ausgeben
				schritte++;
			}
			//System.out.println(i + " Collatz-Länge: " + schritte);   //atuellen Wert ausgeben 
			//System.out.println(n);   //atuellen Wert ausgeben
			if (schritte>hoherWert) {
				hoherWert=schritte;
				System.out.println(i + " neues Collatz-Maximum: " + hoherWert);
			}
		}
		System.out.println("Fertig!");
		
	}

}
