public class Televizor {

    //lista de caracteristici a unui televizor
    String culoare;
    String producator;
    double diagonala;
    String portDisponibil;

public static void main(String[] args){
    Televizor tv = new Televizor();
    tv.culoare = "alba";
    tv.producator = "Samsung";
    tv.diagonala = 31.92;
    tv.portDisponibil = "HDMI";

    System.out.print("Televizorul este unul de marca "+tv.producator);
    System.out.print(", de culoare "+tv.culoare);
    System.out.print(", are diagonala de "+tv.diagonala +" inci");
    System.out.print(" si are disponibil 3 porturi de tip "+tv.portDisponibil);


}
}