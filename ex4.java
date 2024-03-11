import java.util.Scanner;

public class ex4 {
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);
   
    String nome, endereco, telefone;
    
    System.out.println("Informe seu nome");
    nome = input.nextLine();
    
    System.out.println("Informe seu endereço");
    endereco = input.nextLine();
   
    System.out.println("Informe seu telefone");
    telefone = input.nextLine();
    
    System.out.println("Seus dados são:");
    System.out.println("nome:" + nome );
    System.out.println("endereço:" + endereco );
    System.out.println("telefone:" + telefone );

    input.close();
    }
}