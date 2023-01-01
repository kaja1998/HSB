/* Pseudocode
void einlesen()
	höhe einlesen >1
	breite einlesen >1, <10
	zeichen zur Füllung einlesen
void verarbeiten()
main()
*/


public class Rechteck {

//Attribute
	int breite;
	int hoehe;
	String zeichen;

//Werte einlesen
	public void einlesen() {
		IO.println("Bitte gib eine Breite (>1 und <10) ein:");
		breite = IO.readInt(); 
		IO.println("Bitte gib eine Hoehe (>1) ein:");
		hoehe = IO.readInt();  
		IO.println("Bitte waehle ein Zeichen (+, -, *, .) fuer die Fuellung:");
		zeichen = IO.readString();
	}

	public void verarbeitung() {
        if ((breite>1) && (breite<10) && (hoehe>1)) {		//Breite >1, und <10, Höhe >1
			for(int i=0; i<breite; i++){					// Zählt von 0 bis "Breite" hoch und erhöht immer um eins
				System.out.print("*");						// Printet dabei immer ein * aus
			} 
			System.out.println();							//Absatz
		
			for(int i=0; i<hoehe-2; i++){					//Bsp: Höhe 5 und Breite auch 5;	Zählt von 0 bis bsp. 3 hoch (bei einer Höhe von 5)
				for(int j=0; j<breite; j++){				//Zählt von 0 bis 5 hoch
				
					if(j==0 || j==breite-1){				//Wenn 0 oder 5 (Da er bei null anfängt zu zählen "-1"), dann *
						System.out.print("*");				
					} else{
						System.out.print(zeichen);			//ansonsten printet er das eingegebene Zeichen aus
					}
				} 
			System.out.println();
			}

			for(int i=0; i<breite; i++){					//Zählt von 0 bis Breite hoch und erhöht immer um eins
				System.out.print("*");						// printet dabei immer ein * aus
			} 
        } else {
            System.out.println("Geben Sie für die Breite einen Wert groeßer 1 und kleiner 10 ein. Für die Hoehe bitte einen Wert groeßer 1");
        }
	}
}