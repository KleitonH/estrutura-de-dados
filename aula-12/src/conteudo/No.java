package conteudo;

public class No <T> {
    public T dado;
    No<T> anterior;
    No<T> proximo;

    public No(T dado){
        this.dado = dado;
        this.anterior = null;
        this.proximo = null;
    }
}
