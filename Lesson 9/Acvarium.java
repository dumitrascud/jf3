public class Acvarium {

    // lista de caracteristici al unui Acvarium.
    String capacitate;
    String culoare;
    byte numarDePesti;
    String locatie;

    // golire, curatare, umplere, populare.
    public static void main(String[] args) {
        Acvarium acv = new Acvarium();
        acv.capacitate = "15 L";
        acv.culoare = "maro";
        acv.numarDePesti = 4;
        acv.locatie = "salon";

        System.out.print("Acvariumul Dumneavoastra are capacitatea de " + acv.capacitate);
        System.out.print(", este de culoare " + acv.culoare);
        System.out.print(", gazduieste " + acv.numarDePesti + "pesti");
        System.out.print(" si este situat in " + acv.locatie);
    }
}