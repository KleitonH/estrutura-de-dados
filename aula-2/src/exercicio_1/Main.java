package exercicio_1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Alberto", "alberto@gmail.com");
        //pessoa1.nome = "Jubileu";
        pessoa1.setNome("Irineu");
        //pessoa1.email = "jubileu@gmail.com";
        pessoa1.setEmail("irineu@gmail.com");
        pessoa1.logarPessoa();
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Email: " + pessoa1.getEmail());

        Professor prof1 = new Professor();

        prof1.logarPessoa();

        Estudante e1 = new Estudante();
        e1.setNome("Ana");
        Estudante e2 = new Estudante();
        e2.setNome("Patricia");

        Turma turma1 = new Turma ("Estrutura de Dados", prof1, 30);

        turma1.inserirEstudante(e1);
        turma1.inserirEstudante(e2);

    }
}