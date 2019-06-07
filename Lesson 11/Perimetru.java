
//O aplicație care calculeaza suma lui X si Y.
import java.util.Scanner;

public class Perimetru {
    public static void main(String[] args) {

        System.out.println("Introduceti lungimea primei laturi  ");
        Scanner valoare = new Scanner(System.in);
        int x = valoare.nextInt();

        System.out.println("Introduceti lungimea celei de a 2-a laturi ");
        int y = valoare.nextInt();

        int z = x + y;
        int a = x * y;

        if (x == y){
            System.out.println("Ati introdus lature de aceeasi lungime, caracteristic unui patrat ce are perimetrul = cu " + z +" si aria cu "+a);
         }else{
             System.out.println("Ati introdus lature de lungime diferita, caracteristic unui dreptunghi ce are perimetrul = cu " + z+" si aria cu "+a);
         }
        
    }
}