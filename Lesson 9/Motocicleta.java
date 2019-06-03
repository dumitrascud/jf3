public class Motocicleta {

    // lista de caracteristici al unei Motocicleta.
    double greutate;
    int anulProducerii;
    int capacitateCilindrica;
    String marca;

    public static void main(String[] args) {
        Motocicleta bike = new Motocicleta();
        bike.marca = "Jawa 175";
        bike.anulProducerii = 7967;
        bike.capacitateCilindrica = 176;
        bike.greutate = 137.6;

        System.out.print("Motocicletaul este de marca " + bike.marca + " cu capacitatea cilindrica de "
                + bike.capacitateCilindrica + "cm3");
        System.out.print(", a fost produsa in " + bike.anulProducerii + " si cantareste" + bike.greutate + "kilograme");

    }
}