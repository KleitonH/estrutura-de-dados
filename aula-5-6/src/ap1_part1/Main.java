package ap1_part1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Matriz matriz = new Matriz(4, 4);

    int opcao;
        do {
        System.out.println("\n----- MENU -----");
        System.out.println("1. Preencher matriz com valores aleatórios");
        System.out.println("2. Inserir elemento");
        System.out.println("3. Remover elemento");
        System.out.println("4. Exibir matriz");
        System.out.println("5. Ordenar linha com Bubble Sort");
        System.out.println("6. Ordenar coluna com Bubble Sort");
        System.out.println("7. Ordenar matriz completa com Merge Sort");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o limite superior dos valores aleatórios: ");
                int limite = scanner.nextInt();
                matriz.preencherAleatorio(limite);
                System.out.println("Matriz preenchida com valores aleatórios.");
                break;

            case 2:
                System.out.print("Digite a linha: ");
                int linha = scanner.nextInt();
                System.out.print("Digite a coluna: ");
                int coluna = scanner.nextInt();
                System.out.print("Digite o valor: ");
                int valor = scanner.nextInt();
                matriz.inserirElemento(linha, coluna, valor);
                break;

            case 3:
                System.out.print("Digite a linha: ");
                linha = scanner.nextInt();
                System.out.print("Digite a coluna: ");
                coluna = scanner.nextInt();
                matriz.removerElemento(linha, coluna);
                break;

            case 4:
                System.out.println("Matriz atual:");
                matriz.exibirMatriz();
                break;

            case 5:
                System.out.print("Digite a linha para ordenar: ");
                linha = scanner.nextInt();
                matriz.bubbleSortLinha(linha);
                System.out.println("Linha " + linha + " ordenada.");
                break;

            case 6:
                System.out.print("Digite a coluna para ordenar: ");
                coluna = scanner.nextInt();
                matriz.bubbleSortColuna(coluna);
                System.out.println("Coluna " + coluna + " ordenada.");
                break;

            case 7:
                matriz.mergeSort();
                System.out.println("Matriz completa ordenada com Merge Sort.");
                break;

            case 0:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção inválida! Tente novamente.");
                break;
        }
    } while (opcao != 0);

        scanner.close();
}
}
