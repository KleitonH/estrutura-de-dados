package conteudo;

import java.util.Random;

public class mergeSorts {
    public static void imprimeVetor(int[] vetor) {
        for (int vet : vetor) {
            System.out.print(vet + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) { //Caso base -> quando forem iguais sai da recurso
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);
            merge(vetor, inicio, meio, fim);
        }
    }

    public static void merge(int[] vetor, int inicio, int meio, int fim) {
        // Passo 1: Determinar os tamanhos dos dois subarrays que serão mesclados
        int n1 = meio - inicio + 1;
        int n2 = fim - meio;

        // Passo 2: Criar arrays temporários para armazenar os subarrays
        int[] esquerda = new int[n1];
        int[] direita = new int[n2];

        // Passo 3: Copiar os dados para os arrays temporários
        for (int i = 0; i < n1; i++)
            esquerda[i] = vetor[inicio + i];
        for (int j = 0; j < n2; j++)
            direita[j] = vetor[meio + 1 + j];
        // Passo 4: Mesclar os arrays temporários de volta no array original
        int i = 0, j = 0;
        int k = inicio;
        while (i < n1 && j < n2) {
            if (esquerda[i] <= direita[j]) {
                vetor[k] = esquerda[i];
                i++;
            } else {
                vetor[k] = direita[j];
                j++;
            }
            k++;
            // Passo 5: Copiar os elementos restantes de esquerda[], se houver
            while (i < n1) {
                vetor[k] = esquerda[i];
                i++;
                k++;
            }
            // Passo 6: Copiar os elementos restantes de direita[], se houver
            while (j < n2) {
                vetor[k] = direita[j];
                j++;
                k++;
            }
        }
    }

    public static void main(String[] args) {
        int[] vetor = new int [100000000];
        Random random = new Random();
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = random.nextInt(100);
        }

//        imprimeVetor(vetor);
        double tempoInicio = System.nanoTime();
        mergeSort(vetor, 0, vetor.length - 1);
//        imprimeVetor(vetor);
        double tempoFim = System.nanoTime();
        double tempoGasto = tempoFim - tempoInicio;
        double miliSegundos = tempoGasto/ 1_000_000;
        double segundos = tempoGasto / 1_000_000_000;
        System.out.println(segundos);
    }
}