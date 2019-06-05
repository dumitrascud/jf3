public class CasutaDePapusi {

    // Lista de caracteristici definite ale unei Cana.
    String culoare;
    int nrDeOdai;
    double inaltime;
    double latime;

    public static void main(String[] args) {
        CasutaDePapusi homic = new CasutaDePapusi();
        homic.culoare = "roz";
        homic.nrDeOdai = 5;
        homic.inaltime = 15.25;
        homic.latime = 35.6;

        System.out.print("Casuta de papusi este de culoare " + homic.culoare + " si are: ");
        System.out.print(homic.nrDeOdai + " odai, inaltimea ei este de " + homic.inaltime + " centimetri");
        System.out.print(", iar latimea este " + homic.latime + " centimetri");
    }
}
