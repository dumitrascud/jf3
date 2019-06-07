//O aplicație care poate determina dacă o literă introdusa de la tastiera e vocală sau consoană.
import java.util.Scanner;

public class SumaXY {
    public static void main(String[] args){
    
        System.out.println("Introduceti valoarea lui X ");
            Scanner valoare = new Scanner(System.in);
            int x = valoare.nextInt();

        System.out.println("Introduceti valoarea lui Y ");
            int y = valoare.nextInt();
    
        int z = x+y;
        System.out.println("Suma lui X si Y este egala cu " +z);
        }
    }