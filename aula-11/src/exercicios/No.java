package exercicios;

public class No<T> {
    public T elemento;
    public No<T> proximo;

    public No(T elemento){
        this.elemento = elemento;
        this.proximo = null;
    }
}
