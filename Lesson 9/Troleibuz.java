public class Troleibuz{

    //lista de caracteristici ale unui troleibuz
    int parc;
    int anDeProductie;
    int numarDeLocuri;
    String Culoare;

public static void main (String[] args) {
    Troleibuz trol = new Troleibuz ();
    trol.parc = 3;
    trol.anDeProductie = 1998;
    trol.numarDeLocuri = 56;
    trol.Culoare = "rosie";

    System.out.print("Troleibuzul selectat apartine Parcului de Troleibuze Nr. "+trol.parc);
    System.out.print(", a fost fabricat in "+trol.anDeProductie);
    System.out.print(", are un numar total de "+trol.numarDeLocuri +" locuri");
    System.out.print(" si este de culoare "+trol.Culoare);
}
}