package pedidos;
//Adicionar Novo Pedido: Adicione um novo pedido à fila de pedidos pendentes.
//Atender Pedido: Remova o pedido mais antigo da fila de pedidos pendentes e exiba qual pedido foi atendido.
//Cancelar Pedido: Remova o pedido mais antigo da fila de pedidos pendentes, adicione-o à pilha de pedidos cancelados e exiba qual pedido foi cancelado.
//Restaurar Pedido: Remova o último pedido cancelado da pilha e insira-o de volta à fila de pedidos pendentes. Exiba o pedido restaurado.
//Imprimir Pedidos Pendentes: Imprima todos os pedidos presentes na fila de pedidos pendentes, exibindo seu ID e descrição.
//Imprimir Pedidos Cancelados: Imprima todos os pedidos presentes na pilha de pedidos cancelados, exibindo seu ID e descrição.

public class Fila {
    private Object elementos;
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

