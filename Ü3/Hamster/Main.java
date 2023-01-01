public class Main {

		public static void main(String[] args) {
			Hamster hamster1 = new Hamster("hamster1", 2, "in der Ecke, oben links", "Sueden", 5);
			Hamster hamster2 = new Hamster("hamster2", 5, null, null, 0);
			hamster1.vorstellen();
			System.out.println();
        	hamster2.vorstellen();
		}
}