
//O aplicație care calculeaza suma lui X si Y.
import java.util.Scanner;

public class Perimetru {
    public static void main(String[] args) {

        System.out.println("Introduceti valoarea lui X ");
        Scanner valoare = new Scanner(System.in);
        int x = valoare.nextInt();

        System.out.println("Introduceti valoarea lui Y ");
        int y = valoare.nextInt();

        int z = x + y;

        if (x == y){
            System.out.println("Ati introdus lature de aceeasi lungime, caracteristic unui patrat ce are perimetrul = cu " + z);
         }else{
             System.out.println("Ati introdus lature de lungime diferita, caracteristic unui dreptunghi ce are perimetrul = cu " + z);
         }
        
    }
}