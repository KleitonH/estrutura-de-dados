import conteudo.Ordenacao;

public class Main {
    public static void main(String[] args) {

        int[] vetorBubble = {5, 22, 1, 106, 32, 25,6};
        int[] vetorSelection = {51, 212, 10, 6, 16, 1025, 1};
        int[] vetorInsertion ={45, 254, 848, 22, 15, 147, 5};

        System.out.println("Ordenação Bubble:");
        Ordenacao.imprimirVetor(vetorBubble);
        Ordenacao.bubbleSort(vetorBubble);
        Ordenacao.imprimirVetor(vetorBubble);
        System.out.println("Ordenação Selection:");
        Ordenacao.imprimirVetor(vetorSelection);
        Ordenacao.selectionSort(vetorSelection);
        Ordenacao.imprimirVetor(vetorSelection);
        System.out.println("Ordenação Insertion:");
        Ordenacao.imprimirVetor(vetorInsertion);
        Ordenacao.insertionSort(vetorInsertion);
        Ordenacao.imprimirVetor(vetorInsertion);
    }
}