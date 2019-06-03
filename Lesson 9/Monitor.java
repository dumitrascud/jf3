public class Monitor {

    // lista de caracteristici al unui Monitor.
    double diagonala;
    int rezolutieVerticala;
    int rezolutieOrizontala;
    String culoare;

    public static void main(String[] args) {
        Monitor monic = new Monitor();
        monic.culoare = "argintiu";
        monic.rezolutieOrizontala = 1920;
        monic.rezolutieVerticala = 1080;
        monic.diagonala = 24.1;

        System.out.print("Monitorul este de culoare " + monic.culoare + " cu diagonala de " + monic.diagonala);
        System.out.print(", are o rezolutie de " + monic.rezolutieOrizontala + "x" + monic.rezolutieVerticala);

    }
}