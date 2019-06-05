public class Familie {

    // lista de caracteristici al unei Familie.
    int numarDeMembri;
    int numarDeCopii;
    String ocupatiaTatei;
    String ocupatiaMamei;
    String localitate;

    public static void main(String[] args) {
        Familie fam = new Familie();
        fam.numarDeMembri = 5;
        fam.numarDeCopii = 3;
        fam.ocupatiaTatei = "bucatar";
        fam.ocupatiaMamei = "tractorist";
        fam.localitate = "Cojusna";

        System.out.print("Familia este din " + fam.localitate + ", are un numar de " + fam.numarDeMembri + " membri");
        System.out.print(", dintre care " + fam.numarDeCopii + " sunt copii");
        System.out.print(", tata fiind " + fam.ocupatiaTatei);
        System.out.print(" iar mama " + fam.ocupatiaMamei);
    }
}