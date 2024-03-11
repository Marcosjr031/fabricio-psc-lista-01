import java.util.Scanner;

public class ex13 {
    public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
   
    double valor, qtd, percentual, salariobrt, salariolqd;
    
    System.out.println("Informe o valor da sua hora de trabalho");
    valor = scanner.nextDouble();

    System.out.println("Informe a quantidade de horas trabalhadas por mês");
    qtd = scanner.nextDouble();
    
    System.out.println("Informe o percentual do desconto do INSS");
    percentual = scanner.nextDouble();

    salariobrt = valor * qtd;
    percentual = (percentual / 100) * salariobrt;
    salariolqd = salariobrt - percentual;

    System.out.println("O valor do seu salário líquido é de " + salariolqd);

    }

}