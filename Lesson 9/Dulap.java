public class Dulap {

    // Lista de caracteristici definite ale unui Dulap.
    double inaltime;
    double adancime;
    double lungime;
    String culoare;

    public static void main(String[] args) {
        Dulap ward = new Dulap();
        ward.inaltime = 200.15;
        ward.adancime = 60.5;
        ward.lungime = 0.25;
        ward.culoare = "bej";

        System.out.print("Dulapul ales este unul de culoare " + ward.culoare + " cu: ");
        System.out.print(" o inaltime de  " + ward.inaltime + " centimetri");
        System.out.print(", o adancime de  " + ward.adancime + " centimetri");
        System.out.print(" si o lungime de  " + ward.lungime + " centimetri");
    }
}
