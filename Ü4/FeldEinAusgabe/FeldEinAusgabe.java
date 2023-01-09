public class FeldEinAusgabe {

	int spalten;
	int zeilen;
	char feld = '.';
	int xInSpalte;
	int xInZeile;
	char[][] matrix;

	public static void main(String[] args) {
		FeldEinAusgabe feld = new FeldEinAusgabe();
		feld.einlesen();
		feld.ausgeben();
	}

	void einlesen() {
		IO.println("Bitte geben Sie eine Zeilenanzahl ein: ");
		zeilen = IO.readInt();
		IO.println("Bitte geben Sie eine Spaltenzahl ein: ");	
		spalten = IO.readInt();
		char eingabejn;
		matrix = new char[zeilen][spalten];					// Array initialisiert und gleichzeitig deklariert
       	for(int i = 0; i < matrix.length; i++) {			// horizontale Spalten
       		for (int j = 0; j < matrix[i].length; j++) {	// vertikale Zeilen
       			matrix[i][j] = feld;						// "*" wird als Wert in die Felder gelegt  
       		}						
    	}
    	System.out.println("Eingabe von Koordinatenwerte? (j/n)");
    	eingabejn = IO.readChar();
    	while(eingabejn == 'j') {
			IO.println("An welcher Stelle soll ein X gesetzt werden (Zeile)?");
			xInZeile = IO.readInt();
			xInZeile--;										// -1, da ab 0 angefangen wird zu Zählen. So kann der Benutzer auch bsp. den Wert 10 eingeben, wenn der Array 10 lang ist
			IO.println("An welcher Stelle soll ein X gesetzt werden (Spalte)?");
			xInSpalte = IO.readInt();
			xInSpalte--;									// -1, da ab 0 angefangen wird zu Zählen. So kann der Benutzer auch bsp. den Wert 10 eingeben, wenn der Array 10 lang ist
			matrix [xInZeile][xInSpalte] = 'X';
			System.out.println("Eingabe von Koordinatenwerte? (j/n)");
			eingabejn = IO.readChar();
		}
	}  

    void ausgeben() {
    	for(int i = 0; i < matrix.length; i++) {			
    		System.out.println("");							//Absatz
       		for (int j = 0; j < matrix[i].length; j++) {	
       			System.out.print(matrix [i][j]);						 
       		}						
    	}
	}
}