//
import java.util.Scanner;

public class Litere {
    public static void main(String[] args) {
        Scanner caracter = new Scanner(System.in);

        System.out.println("Tastati o litera de la A la Z de la tastiera ");

        char litera = caracter.next().charAt(0);

        switch (litera) {
        case 'a':
            System.out.println("Caracterul este vocala: " + litera);
            break;

        case 'e':
            System.out.println("Caracterul este vocala: " + litera);
            break;

        case 'i':
            System.out.println("Caracterul este vocala: " + litera);
            break;

        case 'o':
            System.out.println("Caracterul este vocala: " + litera);
            break;

        case 'u':
            System.out.println("Caracterul este vocala: " + litera);
            break;

            case 'A':
            System.out.println("Caracterul este vocala: " + litera);
            break;

        case 'E':
            System.out.println("Caracterul este vocala: " + litera);
            break;

        case 'I':
            System.out.println("Caracterul este vocala: " + litera);
            break;

        case 'O':
            System.out.println("Caracterul este vocala: " + litera);
            break;

        case 'U':
            System.out.println("Caracterul este vocala: " + litera);
            break;

        default:
            System.out.println("Caracterul este o consoana: " + litera);
        }
        
    }
}

