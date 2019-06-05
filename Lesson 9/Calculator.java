public class Calculator {

    // Lista de caracteristici definite ale unui calculator.
    String producator;
    String procesor;
    int ram;
    int hdd;

    public static void main(String[] args) {
        Calculator pc = new Calculator();
        pc.producator = "Hewlett Packard";
        pc.procesor = "Intel Q9550";
        pc.ram = 8;
        pc.hdd = 1;

        System.out.print("Calculatorul ales este un " + pc.producator + " cu: ");
        System.out.print(" un procesor " + pc.procesor);
        System.out.print(", o capacitate de memorie operativa de " + pc.ram + " GB");
        System.out.print("  si o capacitate de stocare de " + pc.hdd + " Terabyte");
    }
}
