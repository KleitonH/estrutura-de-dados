package conteudo;

public class ListaDuplamenteLigada <T> {
    private No<T> inicio;
    private No<T> fim;

    public ListaDuplamenteLigada(){
        this.inicio = null;
        this.fim = null;
    }

    public void inserirNoFim(T dado){
        No<T> novoNo = new No<>(dado);
        if(inicio == null){//Verificando se a lista está vazia
            inicio = novoNo;
            fim = novoNo;
        } else{
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
    }

    public void inserirNoInicio(T dado) {
            No<T> novoNo = new No<>(dado);

            if (inicio == null){
                inicio = novoNo;
                fim = novoNo;
            }else {
                novoNo.proximo = inicio;
                inicio.anterior = novoNo;
                inicio = novoNo;
            }
        }

    public void removerPorValor(T dado){
        if (inicio == null){
            System.out.println("Lista vazia");
            return;
        }

        No<T> atual = inicio;

        while(atual != null){
            if (atual.dado.equals(dado)){
                if (atual == inicio){
                    inicio = atual.proximo;
                    if (inicio != null) inicio.anterior = null;
                }else if (atual == fim){
                    fim = atual.anterior;
                    if (fim != null) fim.proximo = null;
                }else {
                    atual.anterior.proximo = atual.proximo;
                    atual.proximo.anterior = atual.anterior;
                }
                return;
            }
            atual = atual.proximo;
        }
    }

    public void imprimir(){
        No<T> atual = inicio;

        if (inicio == null){
            System.out.println("Lista vazia.");
        }else {
            while(atual != null){
                System.out.print(atual.dado + " ");
                atual = atual.proximo;
            }
            System.out.println();
        }
    }
}
