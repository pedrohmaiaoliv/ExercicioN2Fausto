import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {

        Scanner numeral = new Scanner(System.in);
        int numeroAleatorio = new Random() .nextInt(101);
        int tentativas = 0;
        int numeroColocado;

        System.out.println("Bem vindo ao jogo de advinhação, no qual você vai advinhar o numero que eu o Super Java, estou pensando!");

        do {
            System.out.println("escolha um numero de 1 a 100:" );
            numeroColocado = numeral.nextInt();
            tentativas++;

            if (numeroColocado == numeroAleatorio) {
                System.out.println("\nParabéns você advinhou o numero em exatamente: " + tentativas + " tentativas!");
                break;
            }
            else if (numeroColocado > numeroAleatorio) {
                System.out.println("\nO Numero voce digitou é maior do que o numero que eu pensei! bora diminuir isso ai?");
            }
            else if (numeroColocado < numeroAleatorio) {
                System.out.println("\nO Numero que voce digitou é Menor do que o numero que eu pensei! aumenta isso ai!!");
            }

        } while (numeroColocado != numeroAleatorio);
    }

}