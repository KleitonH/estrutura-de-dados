package exercicios;

public class Pilha {
    private String [] elementos;
    private int tamanho;

    public Pilha (int capacidade){
        this.elementos = new String[capacidade];
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

    public boolean empilhar(String e){
        if(!estaCheia()){
            this.elementos[tamanho] = e;
            tamanho ++;
            return true;
        }
        return false;
    }

    public String desempilhar() {
        if (!estaVazia()) {
            String elementoRemovido = this.elementos[tamanho - 1];
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
    public String espiar(){
        if (!estaVazia()){
            return this.elementos[tamanho - 1];
        }
        return null;
    }
}
