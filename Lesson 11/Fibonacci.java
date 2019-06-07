import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        Scanner capture = new Scanner (System.in);
        int n0 = 0, n1 = 1, n2, i; //fib = 5;
        System.out.println("Introduceti numarul ");
        int fib = capture.nextInt();
        System.out.print ("Sirul Fibonacci pentru "+fib +" este urmatorul: ");

        for (i = 0; i <= fib; i++){
            n2 = n1 + n0;
            System.out.print (+n2 +" ");
            n0 = n1;
            n1 = n2;
        }
//System.out.println();
    }   
}