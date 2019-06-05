public class Televizor {

    // lista de caracteristici ale unui tleviror
    double diagonala;
    String producator;
    String culoare;
    int porturi;

    public static void main(String[] args) {
        Televizor tv = new Televizor();
        tv.diagonala = 50.78;
        tv.producator = "Samsung";
        tv.culoare = "alba";
        tv.porturi = 4;
        

        System.out.print("Televizorul selectat este unul produs de " + tv.producator);
        System.out.println(", are o diagonala a ecranului de " + tv.diagonala + "inch");
        System.out.println(", este de culoare" +tv.culoare);
        System.out.println(", si are disponibile " +tv.porturi +" HDMI");
        
    }
}