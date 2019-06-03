public class Pisica {

    // lista de caracteristici ale unei pisici
    int varsta;
    String nume;
    String culoare;

    public static void main(String[] args) {
        Pisica cat = new Pisica();
        cat.varsta = 2;
        cat.nume = "Limo";
        cat.culoare = "cenusie";

        System.out.print("Pisica este de culoare " + cat.culoare + ", o cheama " + cat.nume + " si are varsta de "
                + cat.varsta + " ani");

    }
}