package conteudo;

public class ListaLigada <T> {
    private No<T> inicio;

    public ListaLigada(){
        this.inicio = null;
    }

    public void inserir(T elemento){
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
    }

    public void remover(T elemento){
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
}
