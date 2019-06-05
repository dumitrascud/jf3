public class Curea {

    int lungime;
    String culoare;
    int numarDeGauri;

    public static void main(String[] args) {
        Curea belt = new Curea();
        belt.lungime = 220;
        belt.culoare = "maro";
        belt.numarDeGauri = 14;

        System.out.print("Cureaua Dumneavoastra are o lungime de " + belt.lungime);
        System.out.print(", este de culoare " + belt.culoare);
        System.out.print(", si are " + belt.numarDeGauri + " gauri");

    }
}