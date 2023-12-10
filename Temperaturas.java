import java.util.Random;

public class Temperaturas {
    public static void main(String[] args) {
        Random rand = new Random();

        int[][] temperaturas = new int[4][7];
        double[] mediaPorDia = new double[7];
        double mediaGeral = 0.0;

        // Preencher a matriz com temperaturas aleatórias entre 25 e 35 graus
        for (int semana = 0; semana < temperaturas.length; semana++) {
            for (int dia = 0; dia < temperaturas[semana].length; dia++) {
                temperaturas[semana][dia] = rand.nextInt(11) + 25; // Números entre 25 e 35
            }
        }

        // Calcular a média por dia da semana
        for (int dia = 0; dia < mediaPorDia.length; dia++) {
            int soma = 0;
            for (int semana = 0; semana < temperaturas.length; semana++) {
                soma += temperaturas[semana][dia % 7]; // % 7 para garantir que dia seja entre 0 e 6
            }
            mediaPorDia[dia] = soma / 4.0; // Média das 4 semanas
            mediaGeral += mediaPorDia[dia];
        }

        // Imprimir a média por dia da semana
        System.out.println("Média de temperatura por dia da semana:");
        String[] diasSemana = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
        for (int dia = 0; dia < mediaPorDia.length; dia++) {
            System.out.println(diasSemana[dia] + ": " + mediaPorDia[dia] + "°C");
        }

        // Calcular e imprimir a média geral
        mediaGeral /= 7; // Média das médias por dia da semana
        System.out.println("\nMédia geral de temperatura: " + mediaGeral + "°C");
    }
}
