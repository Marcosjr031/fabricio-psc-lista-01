import java.util.Scanner;
public class ex2 {
    public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print ("Informe o número 1");
    int num1 = scanner.nextInt();
    System.out.print ("Informe o número 2");
    int num2 = scanner.nextInt();
    int divisão = num1 / num2;
    System.out.print ("A divisão dos números é: " + divisão);
     }
}