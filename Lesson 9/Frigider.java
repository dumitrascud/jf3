public class Frigider {

    // lista de caracteristici al unui Frigider.
    int inaltime;
    int latime;
    String culoare;

    public static void main(String[] args) {
        Frigider frig = new Frigider();
        frig.culoare = "alba";
        frig.inaltime = 190;
        frig.latime = 65;

        System.out.print("Frigiderul este de culoare" + frig.culoare);
        System.out.print(", are inaltimea de " + frig.inaltime + " cm");
        System.out.print(", si o adancime de " + frig.latime + " cm.");

    }
}