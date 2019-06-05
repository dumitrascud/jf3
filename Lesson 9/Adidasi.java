public class Adidasi {
    // Lista de caracteristici definite ale unei perechi de adidasi.
    int marime;
    String producator;
    String culoare;
    byte pret;

    public static void main(String[] args) {
        Adidasi crose = new Adidasi();
        crose.marime = 43;
        crose.producator = "Nike";
        crose.culoare = "rosie";
        crose.pret = 125;

        System.out.print("Marimea croselor alese este " + crose.marime);
        System.out.print(", producatorul croselor este " + crose.producator);
        System.out.print(", sunt de culoare " + crose.culoare);
        System.out.print("  si costa: " + crose.pret + " de dolari");
    }
}
