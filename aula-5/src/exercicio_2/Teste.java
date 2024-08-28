package exercicio_2;

public class Teste {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario(10000.00, "Roberto");
        Funcionario func2 = new Funcionario(10000.00, "Ana");
        Funcionario func3 = new Funcionario(10000.00, "Xuxa");

        Funcionario[] funcionarios = {func1, func2, func3};

        OrdenarFuncionario.ordemAlfabetica(funcionarios);
        System.out.println(funcionarios[0]);
        System.out.println(funcionarios[1]);
        System.out.println(funcionarios[2]);
    }
}
