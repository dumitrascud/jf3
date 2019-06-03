public class Cana {

    // Lista de caracteristici definite ale unei Cani.
    String culoare;
    String imprimeu;
    double capacitate;

    public static void main(String[] args) {
        Cana ceasca = new Cana();
        ceasca.culoare = "Alba";
        ceasca.imprimeu = "floare";
        ceasca.capacitate = 0.25;

        System.out.print("Cana aleasa este ceasca " + ceasca.culoare + " cu: ");
        System.out.print(" imprimeu de tip " + ceasca.imprimeu);
        System.out.print(", si o capacitate de " + ceasca.capacitate + " litri");
    }
}
