import java.util.Scanner;

public class ex9 {
    public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
   
    double raio, area;
    
    System.out.println("Informe o raio do círculo");
    raio = scanner.nextDouble();

    area = 3.14159 * (raio * raio);

    System.out.println("A área do círculo é " + area);

    }

}