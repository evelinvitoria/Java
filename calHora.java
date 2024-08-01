package teste;
import java.util.Scanner;
/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. */
public class calHora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double horaTotal;

        System.out.println("Digite a hora de inicio do Jogo(HH:MM): ");
        double hrI = sc.nextDouble();
        System.out.println("Digite a hora do final do jogo(HH:MM): ");
        double hrF = sc.nextDouble();
        horaTotal = hrI - hrF;

       System.out.println("O total de horas de jogo foi: " +horaTotal);
        
    }    
    
}
