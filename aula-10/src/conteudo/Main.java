package conteudo;

public class Main {
    public static void main(String[] args) {
        Pilha<String> livros = new Pilha(3);

        livros.empilhar("Livro 1");
        livros.empilhar("Livro 2");
        livros.empilhar("Livro 3");
        String removido = livros.desempilhar();
        livros.empilhar("Livro 4");
        System.out.println(livros);
        System.out.println(removido);
        System.out.println(livros.tamanho());
        System.out.println(livros.estaVazia());
        System.out.println(livros.estaCheia());
//        Fila docs = new Fila(3);
//        docs.enfileirar("Doc 1");
//        docs.enfileirar("Doc 2");
//        docs.enfileirar("Doc 3");
//        System.out.println(docs);
//        docs.desenfileirar();
//        System.out.println(docs.espiar());
//        System.out.println(docs);
//        docs.enfileirar("Doc 4");
//        docs.enfileirar("Doc 5");
//        docs.enfileirar("Doc 6");
//        System.out.println(docs);
    }
}