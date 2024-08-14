import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double resultado = 0;
        System.out.println("Informe o primeiro número");
        double num1 = scanner.nextDouble();

        System.out.println("Informe o segundo número");
        double num2 = scanner.nextDouble();

        System.out.println("Informe a operação desejada: |+| |-| |*| |/|");
        String operacao = scanner.next();


        resultado = switch (operacao) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> resultado;
        };
        System.out.println("O resultado é " + resultado);
    }
}

