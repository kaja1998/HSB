/* Pseudocode
void einlesen()
	operator einlesen
 	zahl1 einlesen
 	zahl2 einlesen
boolean berechne()
	rechnet das Ergebnis aus und speichert es in erg
 	return true wenn alles ok, return false im Fehlerfall
void ausgeben()
 	Ausgabe der Rechnung
main()
	Wiederholung bis Nutzer „n“ eingibt 
*/

public class Rechner {

	// Attribute
	double zahl1;
	double zahl2;
	char operator;
	double erg;


	public void einlesen() {
		System.out.println("Bitte gib eine Zahl ein");
		zahl1 = IO.readDouble();
		System.out.println("Bitte gib eine weitere Zahl ein");
		zahl2 = IO.readDouble();
		System.out.println("Bitte gibt einen Operator (+, -, *, /) ein");
		operator = IO.readChar();
	}


	public boolean berechne() {
 		switch(operator) {
			case '+': 
				erg = zahl1+zahl2; 
				return true;
			case '-': 
				erg = zahl1-zahl2; 
				return true; 
			case '*': 
				erg = zahl1*zahl2; 
				return true;
			case '/': 
				erg = zahl1/zahl2;
				return true; 
			}
		return false;
	}


	/*
	public boolean berechne() {
		if (operator == '+') {
			erg = zahl1+zahl2; 
			return true;
		} else {
			if (operator == '-'){
				erg = zahl1-zahl2; 
				return true;
			} else {
				if (operator == '*'){
					erg = zahl1*zahl2; 
					return true;
				} else {
					if (operator == '/') {
						erg = zahl1/zahl2; 
						return true;
					} else {
						return false;
					}
				}
			}
		}
	}
	*/
	
	
	public void ausgeben() {
		if (berechne()) {
			System.out.println("Das Ergebnis ist:" + erg);
		} else {
			System.out.println("Fehlerhafte Eingabe");
		}
	}
}