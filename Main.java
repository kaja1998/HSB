public class Main {

		public static void main(String[] args) {
			char eingabejn;
			Rechner taschenrechner = new Rechner();
			do{
				taschenrechner.einlesen();
				taschenrechner.ausgeben();
				System.out.println("Nochmal? (j/n) ");
				eingabejn = IO.readChar();
			}while (eingabejn != 'n');
		}
}