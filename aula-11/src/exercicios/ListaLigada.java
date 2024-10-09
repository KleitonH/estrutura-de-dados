package exercicios;

public class ListaLigada <T> {
    private No<T> inicio;
    private int tamanho;

    public ListaLigada(){
        this.inicio = null;
        this.tamanho = 0;
    }

    public void adicionarNoInicio(T elemento){
        No<T> novoNo = new No<>(elemento);
        if(this.inicio == null){
            inicio = novoNo;
        }else {
            return;
        }

    }
    public void adicionarNoFim(T elemento){
        No<T> novoNo = new No<>(elemento);

        if(this.inicio == null){
            inicio = novoNo;
        }else{
            No<T> noAtual = inicio;

            while (noAtual.proximo != null){
                noAtual = noAtual.proximo;
            }
            noAtual.proximo = novoNo;

        }
        tamanho++;
    }

    public void removerPorValor(T elemento){
        if (this.inicio == null) { // Verificando se a lista está vazia
            System.out.println("Lista vazia.");
            return;
        }
        if (inicio.elemento.equals(elemento)){ //Verifica se o primeiro elemento é o que será eliminado
            this.inicio = this.inicio.proximo;
            return;
        }
        No<T> atual = inicio;
        No<T> anterior = null;

        while(atual != null && atual.elemento != elemento){
            anterior = atual;
            atual = atual.proximo;
        }

        if (atual == null){
            System.out.println("Não encontrado.");
            return;
        }
        anterior.proximo = atual.proximo;
        tamanho --;
    }

    public void imprimir(){
        if(inicio == null){
            System.out.println("Lista vazia.");
            return;
        }
        No<T> noAtual = inicio;

        while (noAtual != null){
            System.out.print(noAtual.elemento + " ");
            noAtual = noAtual.proximo;
        }
        System.out.println();
    }

    public int tamanhoTotal(){
        if (tamanho == 0){
            System.out.println("A lista está vazia");

        } else if (tamanho > 0) {
            System.out.printf("O tamanho total da lista é de %d posições", tamanho);
        }
    }
}
