import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {
        Scanner numeral = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(101);
        int tentativas = 0;
        int numeroColocado;

        System.out.println("Bem-vindo ao jogo de adivinhação, no qual você vai advinhar o número que eu, o Super Java, estou pensando!");

        do {
            System.out.println("Escolha um número de 1 a 100:" );
            numeroColocado = numeral.nextInt();

            if (numeroColocado < 1 || numeroColocado > 100) {
                System.out.println("Número inválido. Por favor, escolha um número de 1 a 100.");
                continue;
            }

            tentativas++;

            if (numeroColocado == numeroAleatorio) {
                System.out.println("\nParabéns, você adivinhou o número em exatamente: " + tentativas + " tentativas!");
                break;
            } else if (numeroColocado > numeroAleatorio)
                System.out.println("\nO número que você digitou é maior do que o número que eu pensei! Vamos diminuir isso aí?");
            else
                System.out.println("\nO número que você digitou é menor do que o número que eu pensei! Vamos aumentar isso aí!!");
        } while (numeroColocado != numeroAleatorio);
    }
}