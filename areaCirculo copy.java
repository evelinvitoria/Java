package teste;
import java.util.Scanner;

public class areaCirculo{
    public static void main(String[] args) {
      
        Scanner ss = new Scanner(System.in);

        System.out.print("Digite o valor do raio do círculo: ");
        double raio = ss.nextDouble();

       
        double area = 3.14159 * (raio*raio);

    
        System.out.printf("A área do círculo é: %.4f%n", area);

       ss.close();
    }

}