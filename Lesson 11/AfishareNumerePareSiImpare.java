
//O aplicație care calculeaza perimetrul si aria unui patrat sau a unui dreptunghi lui X si Y.
import java.util.Scanner;

public class AfishareNumerePareSiImpare {
    public static void main(String[] args) {

        System.out.println("Introduceti numarul  ");
        Scanner numar = new Scanner(System.in);
        int x = numar.nextInt(), i;

        for (i = 1; i <=x; i++) {
    if (i % 2 == 0){
                System.out.print("Numerele pare sunt: " +i +" ");

    }else{System.out.println("Numerele impare sunt: " +i + " ");

    }
}

    }
}