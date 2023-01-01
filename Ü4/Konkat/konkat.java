// Zwei Arrays erstellen
// Dritten Array erstellen, der so groß ist, wie die beiden zusammen
// Werte des ersten Arrays und anschließend des zweiten Array hinüber kopieren
// Dritten Array ausgeben

public class konkat{


	public static void main(String[] args) {
		char[] f1 = {'k','a','j','a'};
		char[] f2 = {'s','u','n','d'};
		char[] f3 = verbinde(f1,f2);
		System.out.println(f3);
	}


	public static final char[] verbinde(char[] f1, char[] f2) {
    	char[] f3 = new char[f1.length + f2.length]; 				// f3 Array erstellen, der so groß ist, wie f1 und f2
		
		for(char index = 0; index < f1.length; index++) {			// Werte des f1 Arrays in f3 reinkopieren / anhängen 
        	f3[index] = f1[index];									
    	}
    	for(char index = 0; index < f2.length; index++) {			// Werte des f2 Arrays in f3 reinkopieren / anhängen 
        	f3[index + f1.length] = f2[index];  					// Die länge des ersten Arrays muss auf den Index addiert werden um die Position der Elemente von f2 im zusammengesetzten Array (f3) vorzugeben
    	}
    	return f3;
	}


}