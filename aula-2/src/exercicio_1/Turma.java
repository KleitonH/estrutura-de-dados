package exercicio_1;

public class Turma {
    private String nome;
    private Professor professor;
    private Estudante[] estudantes;
    private int posicaoAtual = 0;


    public Turma(String nome, Professor professor, int numeroVagas) {
        this.nome = nome;
        this.professor = professor;
        estudantes = new Estudante[numeroVagas];

    }

    public void inserirEstudante(Estudante estudante){
        estudantes[posicaoAtual] = estudante;
        posicaoAtual++;
    }

    public void listarEstudantes(){
        for(int i = 0; i < posicaoAtual; i++){
            System.out.println("Aluno " + (i+1) + ":" + estudantes[i].getNome());
        }
    }
}
