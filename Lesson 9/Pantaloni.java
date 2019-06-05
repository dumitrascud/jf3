public class Pantaloni {

    // lista de caracteristici al unui perechi de pantaloni.
    double lungime;
    String marime;
    String culoare;

    public static void main(String[] args) {
        Pantaloni pants = new Pantaloni();
        pants.lungime = 172.3;
        pants.marime = "XXL";
        pants.culoare = "albastru";

        System.out.print("Pantalonii sunt de culoare " + pants.culoare + " de marimea " + pants.marime
                + " si au lungimea de " + pants.lungime + "cm");

    }
}