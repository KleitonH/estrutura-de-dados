package exercicio_1;

public class Teste {
    public static void main(String[] args){
        Vetor frutas = new Vetor(3);

        frutas.inserir("Maçã");
        frutas.inserir("Abacaxi");
        frutas.inserir("Melão");
        frutas.inserir("Laranja");


        frutas.alterar(2, "Limão");
        frutas.excluir(2);
        System.out.println(frutas);
        System.out.println(frutas.verificar(1));
    }
}
