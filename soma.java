import java.util.Scanner;

public class soma {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[][] matriz = new int[2][2];
        int soma = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                System.out.print("Digite o valor para a posição [" + i + "] [" + j + "]:");
                matriz[i][j] = leitor.nextInt();
                soma += matriz[i][j];

            }

        }
        System.out.println("\nValores da matriz 3x3:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();

            System.out.println("\nA soma de todos os valores da matriz é " + soma);
        }

    }
}
