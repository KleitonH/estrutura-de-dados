package conteudo;

public class Fila {
    private String [] elementos;
    private int tamanho;

    public Fila (int capacidade){
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

    public boolean enfileirar(String e){
        if(!estaCheia()){
            this.elementos[tamanho] = e;
            tamanho ++;
            return true;
        }
        return false;
    }

    public String espiar(){
        if (!estaVazia()){
            return this.elementos[0];
        }
        return null;
    }
    public String desenfileirar(){
        if (!estaVazia()){
            String removido = this.elementos[0];
            for (int i = 1; i < tamanho; i++){
                this.elementos[i - 1] = this.elementos[i];
            }
            tamanho --;
            return removido;
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
}
