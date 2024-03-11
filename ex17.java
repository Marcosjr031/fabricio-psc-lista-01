import java.util.Scanner;

public class ex17 {
    public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
   
    double n, z, y, valor;
    
    System.out.println("Insira quantas canetas foram compradas");
    n = scanner.nextDouble();

    System.out.println("Foi pago com uma nota de quantos reais?");
    z = scanner.nextDouble();
    
    System.out.println("De quanto foi o troco?");
    y = scanner.nextDouble();

    valor = z - y;

    System.out.println("Cada caneta custou: " + valor / n);

    }

}
