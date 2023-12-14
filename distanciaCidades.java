import java.util.Scanner;

public class distanciaCidades {
    public static void main(String[] args) {
        int[][] distanciaEntreCidades = {
            {0, 2, 11, 6, 15, 11, 1},
            {2, 0, 7, 12, 4, 2, 15},
            {11, 7, 0, 11, 8, 3, 13},
            {6, 12, 11, 0, 10, 2, 1},
            {15, 4, 8, 10, 0, 5, 14},
            {11, 2, 3, 2, 5, 0, 14},
            {1, 15, 13, 1, 14, 14, 0}
        };

        Scanner scanner = new Scanner(System.in);
        int origem = -1;
        int destino = -1;

        do {
            System.out.println("Digite o número da cidade de origem (1-7):");
            origem = scanner.nextInt();

            System.out.println("Digite o número da cidade de destino (1-7):");
            destino = scanner.nextInt();
            
            if (origem <= 0 || origem > distanciaEntreCidades.length) {
                System.out.println("Número da cidade de origem inválido!");
            } else if (destino <= 0 || destino > distanciaEntreCidades.length) {
                System.out.println("Número da cidade de destino inválido!");
            } else if (origem == destino) {
                System.out.println("Destino não pode ser o mesmo que a origem!");
            } else {
                System.out.println("O tempo de voo é: " + distanciaEntreCidades[origem -1][destino -1] + " horas");
            }
        } while (origem != destino);

        
        
    }
}
