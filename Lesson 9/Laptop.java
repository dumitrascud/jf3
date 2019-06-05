public class Laptop {

    // lista de caracteristici al unui laptop.
    double diagonala;
    int ram;
    int hdd;
    String culoare;

    public static void main(String[] args) {
        Laptop lap = new Laptop();
        lap.culoare = "negru";
        lap.ram = 4;
        lap.hdd = 500;
        lap.diagonala = 15.6;

        System.out.print("Laptopul este de culoare " + lap.culoare + " diagonala de " + lap.diagonala);
        System.out.print(", are capacitatea de stocare de " + lap.hdd + " Gb");
        System.out.print(", si un volum de memorie operativa de " + lap.ram + " cm.");

    }
}