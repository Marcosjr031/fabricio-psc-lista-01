import java.util.Scanner;

public class ex5 {
    public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
   
    double valor, dolar;
    
    System.out.println("Informe o valor em Dólar");
    dolar = scanner.nextDouble();
    
    valor = dolar * 4.95; 

    System.out.println("O valor em Reais é " + valor);

    }
}