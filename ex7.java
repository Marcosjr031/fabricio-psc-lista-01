import java.util.Scanner;

public class ex7 {
    public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
   
    double salario, reajustado;
    
    System.out.println("Informe seu salário");
    salario = scanner.nextDouble();

    reajustado = (salario * 7/100) + salario;

    System.out.println("Seu salario reajustado é " + reajustado);

    }
}