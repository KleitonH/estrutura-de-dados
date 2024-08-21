package exercicio_1;

public class Vetor {
    private String[] elementos;
    private int tamanho;


    public int getTamanho(){
        return tamanho;
    }

    public void limpar (){
        for (int i = 0; i < elementos.length; i++){
            elementos[i] = null;
        }
    }
    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        tamanho = 0;
    }

    public void inserir(String elemento){
        if (tamanho < elementos.length){
            this.elementos[tamanho] = elemento;
            tamanho ++;
        }else {
            System.out.println("Vetor cheio, não foi possível adicionar o último item");
        }
    }

    public String verificar(int indice){
        if (indice > -1 && indice < tamanho) {
            return this.elementos[indice];
        }else {
            return ("Insira uma posição válida");
        }
    }

    public void alterar(int indice, String elemento){
        if (indice > -1 && indice < tamanho) {
            this.elementos[indice] = elemento;
        }else {
            System.out.println("Posição inválida");
        }
    }

    public void excluir(int indice){
        elementos[indice] = null;
        for(int i = indice; i < tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.elementos[tamanho - 1] = null;
        this.tamanho--;
    }

    public void aumentarCapacidade(){
        String[] novoVetor = new String[elementos.length * 2];
        for(int i = 0; i < elementos.length; i++){
            novoVetor[i] = elementos[i];
        }

        elementos = novoVetor;
    }

    @Override
    public String toString() {
        String str;
        str = "[";
        for (int i = 0; i < tamanho; i++){
            str += elementos[i];
            if (i < tamanho -1){
                str += ", ";
            }
        }
        str += "]";

        return str;
    }
}
