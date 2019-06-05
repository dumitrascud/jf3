public class Telefon {

    // lista de caracteristici ale unui telefon
    double diagonala;
    String producator;
    String OS;

    public static void main(String[] args) {
        Telefon phone = new Telefon();
        phone.diagonala = 5.98;
        phone.producator = "Nokia";
        phone.OS = "Windows Phone 8.1";
        

        System.out.print("Telefonul selectat este unul produs de " + phone.producator);
        System.out.println(", are o diagonala a displayului de " + phone.diagonala + "inch");
        System.out.println(" si ruleaza un Sistem de Operare" +phone.OS);
    }
}