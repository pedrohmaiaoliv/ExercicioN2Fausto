import java.util.Random;

public class Temperaturas {
    public static void main(String[] args) {
        Random rand = new Random();

        int[][] vinteOitoDias = new int[4][7];
        double[] mediaPorDia = new double[7];
        double mediaGeral = 0.0;

        
        for (int semana = 0; semana < vinteOitoDias.length; semana++) {
            for (int dia = 0; dia < vinteOitoDias[semana].length; dia++) {
                vinteOitoDias[semana][dia] = rand.nextInt(11) + 25; 
            }
        }

        
        for (int dia = 0; dia < mediaPorDia.length; dia++) {
            int soma = 0;
            for (int semana = 0; semana < vinteOitoDias.length; semana++) {
                soma += vinteOitoDias[semana][dia % 7]; 
            }
            mediaPorDia[dia] = soma / 4.0; 
            mediaGeral += mediaPorDia[dia];
        }

        
        System.out.println("Média de temperatura por dia da semana:");

        String[] diasSemana = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
        for (int dia = 0; dia < mediaPorDia.length; dia++) {
            System.out.println(diasSemana[dia] + ": " + mediaPorDia[dia] + "°C");
        }

        
        mediaGeral /= 7; 
        System.out.println("\nMédia geral de temperatura: " + String.format("%.2f",mediaGeral) + "°C");
    }
}
