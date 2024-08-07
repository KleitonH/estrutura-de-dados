import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double resultado;
        System.out.println("Informe o primeiro número");
        double num1 = scanner.nextDouble();

        System.out.println("Informe o segundo número");
        double num2 = scanner.nextDouble();

        resultado = somar(num1, num2);
        System.out.println("Resultado: " + resultado);
    }
        public static double somar(double num1, double num2){
            return num1 + num2;

    }
}

