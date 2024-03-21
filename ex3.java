package faculdade;

import java.util.Scanner;

import teste.soma;

/*- Crie um programa que solicite ao usuário 5 números inteiros e armazene-os em um vetor.
Em seguida, calcule e imprima a média desses números.
 */
public class ex3 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int [] vetor = new int[5];
       int soma = 0;

        for(int i=0; i<5; i++){
            System.out.println("Digite um numero inteiro: ");
            vetor[i] = sc.nextInt();
            soma += vetor[i];
        }
      System.out.println("A media é: " +soma/vetor.length);
      
    }
}
