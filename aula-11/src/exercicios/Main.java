package exercicios;

public class Main {
    public static void main(String[] args) {
        ListaLigada<Integer> numeros = new ListaLigada<>();

        numeros.adicionarNoFim(5);
        numeros.adicionarNoFim(10);
        numeros.adicionarNoFim(15);

        numeros.imprimir();
        numeros.removerPorValor(30);
        numeros.imprimir();
        numeros.tamanhoTotal();
    }
}
