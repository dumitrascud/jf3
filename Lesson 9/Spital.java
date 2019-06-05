public class Spital {

    // lista de caracteristici ale unei spital
    int pacienti;
    int etaje;
    String adresa;
    int medici;

    public static void main(String[] args) {
        Spital hosp = new Spital();
        hosp.pacienti = 1800;
        hosp.etaje = 8;
        hosp.adresa = "Sfatul Tarii 15";
        hosp.medici = 300;

        System.out.print("Spitalul se afla pe adresa: " + hosp.adresa);
        System.out.println(", are " + hosp.medici + "angajati");
        System.out.println("si o capacitate maxima de" + pacienti + "amplasati pe toate cele" + etaje + "etaje");
    }
}