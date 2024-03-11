import java.util.Scanner;

public class ex14 {
    public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
   
    int a, b, aux;
    
    System.out.println("Informe um valor inteiro para A");
    a = scanner.nextInt();

    System.out.println("Informe outro valor inteiro para B");
    b = scanner.nextInt();

    aux = a;
    a = b;
    b = aux;

    System.out.println("Os valores após a troca são A = " + a );
    System.out.println("Os valores após a troca são B = " + b ); 

    }
}