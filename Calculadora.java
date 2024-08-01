package teste;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int quantidadeNumeros = scanner.nextInt();

        double[] numeros = new double[quantidadeNumeros];

        System.out.println("Digite os números:");

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        System.out.print("Escolha a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        double resultado = calcular(operacao, numeros);

        System.out.println("O resultado da operação é: " + resultado);

        scanner.close();
    }

    static double calcular(char operacao, double[] numeros) {
        double resultado = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            switch (operacao) {
                case '+':
                    resultado += numeros[i];
                    break;
                case '-':
                    resultado -= numeros[i];
                    break;
                case '*':
                    resultado *= numeros[i];
                    break;
                case '/':
                    resultado /= numeros[i];
                    break;
                default:
                    System.out.println("Operação inválida.");
                    return Double.NaN; 
            }
        }

        return resultado;
    }
}
