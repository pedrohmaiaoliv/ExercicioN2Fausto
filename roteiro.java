import java.util.Scanner;

public class roteiro {
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
        int primeiro = -1;
        int segundo = -1;
        
		

        do {
			System.out.println("Bem vindo a Aplicação que escolhe o seu melhor roteiro de viagem!");

			System.out.println("Digite entre 1 e 7 o número da cidade de origem (1) :");
			origem = scanner.nextInt();

			System.out.println("Digite entre 1 e 7 o número da primeira cidade de descanso: ");
			primeiro = scanner.nextInt();

			System.out.println("Digite entre 1 e 7 o número da segunda cidade de descanso: ");
			segundo = scanner.nextInt();

			System.out.println("Digite entre 1 e 7 o número da cidade de destino: ");
			destino = scanner.nextInt();

			if (origem <= 0 || origem > distanciaEntreCidades.length || primeiro <= 0 || primeiro > distanciaEntreCidades.length || segundo <= 0 || segundo > distanciaEntreCidades.length || destino <= 0 || destino > distanciaEntreCidades.length)
				System.out.println("Uma ou mais cidades digitadas são inválidas. Por favor, insira valores entre 1 e " + distanciaEntreCidades.length + ".");
        	} while (origem <= 0 || origem > distanciaEntreCidades.length || primeiro <= 0 || primeiro > distanciaEntreCidades.length || segundo <= 0 || segundo > distanciaEntreCidades.length || destino <= 0 || destino > distanciaEntreCidades.length);

		    int tempoTotalOpcao1 = distanciaEntreCidades[origem -1][primeiro -1] + distanciaEntreCidades[primeiro -1][destino -1];
        	int tempoTotalOpcao2 = distanciaEntreCidades[origem -1][segundo -1] + distanciaEntreCidades[segundo -1][destino -1];

        	if (tempoTotalOpcao1 < tempoTotalOpcao2) {
            		System.out.println("A melhor rota é: partir da cidade de origem, passsar pela cidade de descanso 1, e depois ir até o destino!");
            		System.out.println("Tempo total de viagem: " + tempoTotalOpcao1 + " horas");
        	} else if (tempoTotalOpcao2 < tempoTotalOpcao1) {
            		System.out.println("A melhor rota é: partir da cidade de origem, passsar pela cidade de descanso 2, e depois ir até o destino!");
            		System.out.println("Tempo total de viagem: " + tempoTotalOpcao2 + " horas");
        	} else
            		System.out.println("Ambas as rotas têm o mesmo tempo total de viagem: " + tempoTotalOpcao1 + " horas");
	}
}
