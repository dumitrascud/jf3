public class Troleibuz {

    // lista de caracteristici ale unui troleibuz.
    int locuri;
    int anProducere;
    String culoare;
    int parc;

    public static void main(String[] args) {
        Troleibuz tb = new Troleibuz();
        tb.locuri = 56;
        tb.anProducere = 1997;
        tb.culoare = "rosie";
        tb.parc = 3;
        

        System.out.print("Toleibuzul cautat este unul produs in anul " +tb.anProducere);
        System.out.println(", este de culoare " + tb.culoare);
        System.out.println(", are capacitatea totala de locuri " +tb.locuri);
        System.out.println(", si apartine Parcului de Troleibuze Nr.  " +tb.parc);
        
    }
}