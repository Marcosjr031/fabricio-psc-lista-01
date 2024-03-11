import java.util.Scanner;

public class ex15 {
    public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
   
    double a, b, c, calcular, raiz1, raiz2;

    System.out.println("Insira os coeficientes da equação de segundo grau Ax^2 + Bx + C:");
    System.out.print("A: ");
    a = scanner.nextDouble();
    System.out.print("B: ");
    b = scanner.nextDouble();
    System.out.print("C: ");
    c = scanner.nextDouble();

    calcular = b * b - 4 * a * c;
    
    if (calcular < 0) {
        System.out.println("A equação não tem raízes reais.");
    } else {
        raiz1 = (-b + Math.sqrt(calcular)) / (2 * a);
        raiz2 = (-b - Math.sqrt(calcular)) / (2 * a);

        System.out.println("As raízes da equação são:");
        System.out.println("Raiz 1: " + raiz1);
        System.out.println("Raiz 2: " + raiz2);
    }

    }
}
