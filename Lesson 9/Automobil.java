public class Automobil {
    // Lista de caracteristici definite ale unui automobil.
    String producator;
    String marca;
    String tipCombustibil;
    int anDeProductie;
    int pret;

    public static void main(String[] args) {
        Automobil masina = new Automobil();
        masina.producator = "Volkswagen";
        masina.marca = "Amaroc";
        masina.tipCombustibil = "diesel";
        masina.anDeProductie = 2015;
        masina.pret = 12000;

        System.out.print("Masina aleasa este un " + masina.producator + " " + masina.marca);
        System.out.print(", produs in " + masina.anDeProductie);
        System.out.print(", utilizeaza combustibil de tip " + masina.tipCombustibil);
        System.out.print("  si costa: " + masina.pret + " de euro");
    }
}
