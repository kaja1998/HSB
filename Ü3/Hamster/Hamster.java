public class Hamster {

	//Attribute
	String name;
    int alter;
    String ort;
	int anzkoerner;
	String richtung;

    public Hamster(String name, int alter, String ort, String richtung, int anzkoerner) {
        this.name = name;
        this.alter = alter;
        this.ort = ort;
        this.anzkoerner = anzkoerner;
        this.richtung = richtung;
    }

    public void vorstellen() {
        System.out.println("Hallo, mein Name ist " + this.name + " und ich bin " + this.alter + " Jahre alt.");
        if (this.ort != null) {
            System.out.println("Ich befinde mich " + this.ort + ".");
        } else {
            System.out.println("Ich weiss nicht, wo ich bin. ");
        }
        if (this.richtung != null) {
          	System.out.println("Ich blicke nach " + this.richtung + ".");
        } else {
            System.out.println("Ich weiss nicht, in welche Richtung ich blicke.");
        }
        if (this.anzkoerner != 0) {
        	System.out.println("In meinem Maul habe ich " + this.anzkoerner + " Koerner.");
        } else {
        	System.out.println("Ich bin so hungrig, da ich keine koerner im Maul habe. Aber ich bekomme jetzt ein Korn.");
        	kornFressen();
        }
    }

    public void drehen() {

    }

    public void gehen() {

    }

    public void kornFressen() {
    	anzkoerner++;
    	System.out.println("Nom, nom, nom");
    }

}