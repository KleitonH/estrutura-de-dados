package conteudo;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteLigada<Integer> lista = new ListaDuplamenteLigada<>();
        lista.imprimir();
        lista.inserirNoFim(5);
        lista.inserirNoFim(10);
        lista.imprimir();
        lista.inserirNoInicio(4);
        lista.imprimir();
        lista.removerPorValor(4);
        lista.imprimir();

    }
}
