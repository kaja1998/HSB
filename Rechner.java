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
	char eingabejn;


	public static void main(String[] args) {
		Rechner taschenrechner = new Rechner();
		do{
			taschenrechner.einlesen();
			taschenrechner.berechne();
			taschenrechner.ausgeben();
			System.out.println("Nochmal? (j/n) ");
			eingabejn = IO.readChar();
		}while (eingabejn != 'n');
	}


	public void einlesen() {
		System.out.println("Bitte gib eine Zahl ein");
		zahl1 = IO.readchar();
		System.out.println("Bitte gib eine weitere Zahl ein");
		zahl2 = IO.readchar();
		System.out.println("Bitte gibt einen Operator (+, -, *, /) ein");
		operator = IO.readchar();
	}

	/*
	public boolean berechne() {
 		switch(operator) {
			case '+'': 
				erg = zahl1+zahl2; 
				break;
			case '-': 
				erg = zahl1-zahl2; 
				break;
			case '*': 
				erg = zahl1*zahl2; 
				break;
			case '/': 
				erg = zahl1/zahl2; 
				break;
			default:
				defaultSystem.out.println("Falsche Eingabe des Operator-Zeichens");
				break;
			}
	}
	*/

	public boolean berechne() {
		if (operator == '+') {
			erg = zahl1+zahl2; 
			return true;
		} else {
			if (operator == '-'){
				ergebnis = zahl1-zahl2; 
				return true;
			} else {
				if (operator == '*'){
					ergebnis = zahl1*zahl2; 
					return true;
				} else {
					if (operator == '/') {
						ergebnis = zahl1/zahl2; 
						return true;
					} else {
						return false;
					}
				}
			}
		}
	}
	
	
	public void ausgeben() {
		System.out.println("Das Ergebnis ist:" + erg);
		}

}