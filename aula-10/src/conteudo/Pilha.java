package conteudo;

public class Pilha<T> {
    private T [] elementos;
    private int tamanho;

    public Pilha (int capacidade){
        this.elementos = (T[]) new Object [capacidade];
        this.tamanho = 0;
    }

    public int tamanho(){
        return this.tamanho;
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public boolean estaCheia(){
        return this.tamanho == this.elementos.length;
    }

    public boolean empilhar(T e){
        if(!estaCheia()){
            this.elementos[tamanho] = e;
            tamanho ++;
            return true;
        }
        return false;
    }

    public T desempilhar() {
        if (!estaVazia()) {
            T elementoRemovido = this.elementos[tamanho - 1];
            tamanho--;
            this.elementos[tamanho] = null;
            return elementoRemovido;
        }
        return null;
        }
        @Override
        public String toString(){
        String s = "[";
        for (int i = 0; i < tamanho; i++){
            s += elementos[i];
            if (i < tamanho - 1){
                s += ",";
            }
        }
        s += "]";
        return s;
        }

        public T espiar(){
        if (!estaVazia()){
            return this.elementos[tamanho - 1];
        }
            return null;
        }
}
