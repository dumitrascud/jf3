public class Telefon {
    //lista de caracteristici ale unui Telefon
    String producator;
    String sistemDeOperare;
    double diagonala;

    public static void main (String[] args){
        Telefon phone = new Telefon();
        phone.producator = "Xiaomi";
        phone.sistemDeOperare = "Android";
        phone.diagonala = 5.98;

        System.out.print("Telefonul selectat este un "+phone.producator);
        System.out.print(", ruleaza un sistem de operare de tip "+phone.sistemDeOperare);
        System.out.print(" si are o diagonala a display-ului de "+phone.diagonala +"inci");


    }
}