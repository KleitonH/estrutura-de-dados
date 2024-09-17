package ap1_part1;

import java.util.Random;
import java.util.Scanner;

public class Matriz {
    private int[][] matriz;
    private int linhas;
    private int colunas;

    // Construtor da matriz
    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        matriz = new int[linhas][colunas];
    }

    // Método para preencher a matriz com valores aleatórios
    public void preencherAleatorio(int limiteSuperior) {
        Random rand = new Random();
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = rand.nextInt(limiteSuperior);
            }
        }
    }

    // Método para inserir um elemento na posição especificada
    public void inserirElemento(int linha, int coluna, int valor) {
        linha -= 1;
        coluna -= 1;
        if (linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas) {
            matriz[linha][coluna] = valor;
        } else {
            System.out.println("Posição inválida.");
        }
    }

//    Método para remover um elemento de uma posição (substituir por 0)
    public void removerElemento(int linha, int coluna) {
        linha -= 1;
        coluna -= 1;
        if (linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas) {
            matriz[linha][coluna] = 0;
        } else {
            System.out.println("Posição inválida.");
        }
    }

    // Método para exibir a matriz
    public void exibirMatriz() {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Algoritmo Bubble Sort (aplicado em uma linha ou coluna)
    public void bubbleSortLinha(int linha) {
        linha -= 1;
        if (linha >= 0 && linha < linhas) {
            for (int i = 0; i < colunas - 1; i++) {
                for (int j = 0; j < colunas - i - 1; j++) {
                    if (matriz[linha][j] > matriz[linha][j + 1]) {
                        int temp = matriz[linha][j];
                        matriz[linha][j] = matriz[linha][j + 1];
                        matriz[linha][j + 1] = temp;
                    }
                }
            }
        } else {
            System.out.println("Linha inválida.");
        }
    }

    // Algoritmo Bubble Sort para colunas
    public void bubbleSortColuna(int coluna) {
        coluna -= 1;
        if (coluna >= 0 && coluna < colunas) {
            for (int i = 0; i < linhas - 1; i++) {
                for (int j = 0; j < linhas - i - 1; j++) {
                    if (matriz[j][coluna] > matriz[j + 1][coluna]) {
                        int temp = matriz[j][coluna];
                        matriz[j][coluna] = matriz[j + 1][coluna];
                        matriz[j + 1][coluna] = temp;
                    }
                }
            }
        } else {
            System.out.println("Coluna inválida.");
        }
    }

    // Algoritmo Merge Sort (aplicado a uma matriz completa como vetor)
    public void mergeSort() {
        int[] vetor = achatarMatriz();
        mergeSortRecursivo(vetor, 0, vetor.length - 1);
        reconstruirMatriz(vetor);
    }

    // Método recursivo do Merge Sort
    private void mergeSortRecursivo(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSortRecursivo(vetor, inicio, meio);
            mergeSortRecursivo(vetor, meio + 1, fim);
            merge(vetor, inicio, meio, fim);
        }
    }

    // Método auxiliar para fazer a mesclagem no Merge Sort
    private void merge(int[] vetor, int inicio, int meio, int fim) {
        int[] temp = new int[fim - inicio + 1];
        int i = inicio, j = meio + 1, k = 0;

        while (i <= meio && j <= fim) {
            if (vetor[i] <= vetor[j]) {
                temp[k++] = vetor[i++];
            } else {
                temp[k++] = vetor[j++];
            }
        }

        while (i <= meio) {
            temp[k++] = vetor[i++];
        }

        while (j <= fim) {
            temp[k++] = vetor[j++];
        }

        for (i = inicio; i <= fim; i++) {
            vetor[i] = temp[i - inicio];
        }
    }

    // Método para achatar a matriz em um vetor
    private int[] achatarMatriz() {
        int[] vetor = new int[linhas * colunas];
        int index = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                vetor[index++] = matriz[i][j];
            }
        }
        return vetor;
    }

    // Método para reconstruir a matriz a partir de um vetor ordenado
    private void reconstruirMatriz(int[] vetor) {
        int index = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = vetor[index++];
            }
        }
    }
}