import java.util.Scanner;

public class ex20 {
    public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
    
    double ipi, cod1, valor1, qtd1, cod2, valor2, qtd2, porcentagem, valorTotal1, valorTotal2, valorTotal;
   
    System.out.println("Insira o valor do IPI");
    ipi = scanner.nextDouble();

    System.out.println("Insira o código da primeira peça");
    cod1 = scanner.nextDouble();

    System.out.println("Insira o valor da primeira peça");
    valor1 = scanner.nextDouble();
    
    System.out.println("Insira a qtd da primeira peça");
    qtd1 = scanner.nextDouble();

    System.out.println("Insira o código da segunda peça");
    cod2 = scanner.nextDouble();

    System.out.println("Insira o valor da segunda peça");
    valor2 = scanner.nextDouble();

    System.out.println("Insira a qtd da segunda peça");
    qtd2 = scanner.nextDouble();

    porcentagem = ipi / 100;

    valorTotal1 = (porcentagem + valor1) * qtd1;

    valorTotal2 = (porcentagem + valor2) * qtd2;

    valorTotal = valorTotal1 + valorTotal2;

    System.out.println("O valor total a ser pago é de: " + valorTotal );

    }

}