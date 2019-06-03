public class MultipliiLui8doWhile{
    
    //afișarea primilor 40 de multipli al cifrei 8 prin intermediul ciclului "do while".
public static void main (String[] args){
    int c = 8;
    int m = 2;
    int r;

    do {
r = c * m;
System.out.println (r);
m++;
    }
    while (m <= 40);
}


}