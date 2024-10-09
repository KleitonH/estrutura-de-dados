package conteudo;

public class Main {
    public static void main(String[] args) {
        ListaLigada<Integer> numeros = new ListaLigada<>();

        numeros.inserir(5);
        numeros.inserir(10);
        numeros.inserir(15);

        numeros.imprimir();
        numeros.remover(30);
        numeros.imprimir();
    }
}
