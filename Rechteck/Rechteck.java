/* Pseudocode
void einlesen()
	höhe einlesen >1
	breite einlesen >1, <10
	zeichen zur Füllung einlesen
void verarbeiten()
main()
*/


public class Rechteck {

	int breite;
	int hoehe;
	String zeichen;

	public void einlesen() {
		IO.println("Bitte gib eine Breite (>1 und <10) ein:");
		breite = IO.readInt(); 
		IO.println("Bitte gib eine Hoehe (>1) ein:");
		hoehe = IO.readInt();  
		IO.println("Bitte waehle ein Zeichen (+, -, *, .) fuer die Fuellung:");
		zeichen = IO.readString();
	}

	public void verarbeitung() {
        if ((breite>1) && (breite<10) && (hoehe>1)) {
			for(int i=0; i<breite; i++){
				System.out.print("*");
			} 
			System.out.println();
		
			for(int i=0; i<hoehe-2; i++){
				for(int j=0; j<breite; j++){
				
					if(j==0 || j==breite-1){
						System.out.print("*");
					} else{
						System.out.print(zeichen);
					}
				} 
			System.out.println();
			}

			for(int i=0; i<breite; i++){
				System.out.print("*");
			} 
        } else {
            System.out.println("Geben Sie für die Breite einen Wert groeßer 1 und kleiner 10 ein. Für die Hoehe bitte einen Wert groeßer 1");
        }
	}
}