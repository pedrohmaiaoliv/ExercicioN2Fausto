import java.util.Scanner;

public class rotasDeFerias {
	private static final int[][] temposDeVoo = {
        	{0, 2, 11, 6, 15, 11, 1},
        	{2, 0, 7, 12, 4, 2, 15},
        	{11, 7, 0, 11, 8, 3, 13},
        	{6, 12, 11, 0, 10, 2, 1},
        	{15, 4, 8, 10, 0, 5, 14},
        	{11, 2, 3, 2, 5, 0, 14},
        	{1, 15, 13, 1, 14, 14, 0}
    	};

	public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);

		do {
            System.out.println("Digite o número da cidade de origem (1-7):");
            int origem = scanner.nextInt() - 1;

            System.out.println("Digite o número da primeira cidade de descanso (1-7):");
            int descanso1 = scanner.nextInt() - 1;

            System.out.println("Digite o número da segunda cidade de descanso (1-7):");
            int descanso2 = scanner.nextInt() - 1;

            System.out.println("Digite o número da cidade de destino (1-7):");
            int destino = scanner.nextInt() - 1;

            if (origem <= 0 || origem > temposDeVoo.length || descanso1 <= 0 || descanso1 > temposDeVoo.length || descanso2 <= 0 || descanso2 > temposDeVoo.length || destino <= 0 || destino > temposDeVoo.length)
                System.out.println("Uma ou mais cidades digitadas são inválidas. Por favor, insira valores entre 1 e " + temposDeVoo.length + ".");
        	} while (origem <= 0 || origem > temposDeVoo.length || descanso1 <= 0 || descanso1 > temposDeVoo.length || descanso2 <= 0 || descanso2 > temposDeVoo.length || destino <= 0 || destino > temposDeVoo.length);

		    int tempoTotalOpcao1 = temposDeVoo[origem][descanso1] + temposDeVoo[descanso1][destino];
        	int tempoTotalOpcao2 = temposDeVoo[origem][descanso2] + temposDeVoo[descanso2][destino];

        	if (tempoTotalOpcao1 < tempoTotalOpcao2) {
            		System.out.println("A melhor rota é: Origem -> Cidade de descanso 1 -> Cidade de descanso 2 -> Destino");
            		System.out.println("Tempo total de viagem: " + tempoTotalOpcao1 + " horas");
        	} else if (tempoTotalOpcao2 < tempoTotalOpcao1) {
            		System.out.println("A melhor rota é: Origem -> Cidade de descanso 2 -> Cidade de descanso 1 -> Destino");
            		System.out.println("Tempo total de viagem: " + tempoTotalOpcao2 + " horas");
        	} else
            		System.out.println("Ambas as rotas têm o mesmo tempo total de viagem: " + tempoTotalOpcao1 + " horas");
	}
}