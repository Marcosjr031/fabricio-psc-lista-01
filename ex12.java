import java.util.Scanner;

public class ex12 {
    public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
   
    int numero, antecessor, sucessor;
    
    System.out.println("Informe um número inteiro");
    numero = scanner.nextInt();

    antecessor = numero - 1;
    sucessor = numero + 1;
    
    System.out.println("O antecessor do número é "+ antecessor);

    System.out.println("O sucessor do número é "+ sucessor);

    }

}