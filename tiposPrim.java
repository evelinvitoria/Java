package teste;
import java.util.Scanner;

public class tiposPrim {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o seu nome? ");
        String nome = sc.nextLine();
        System.err.print("Qual o valor do seu salario? ");
        double salario = sc.nextDouble();

        System.out.println("Seu nome é " +nome+ " E seu salario é " +salario);
    }
}
