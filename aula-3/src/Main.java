public class Main {
    public static void main(String[] args) {
        String[] livros;
        int tamanho = 0;
        livros = new String[3];
        livros[0] = "Estrututara de dados";
        tamanho++;
        livros[1] = "Java como Programar";
        tamanho++;
        //livros[3] = "Teste";//

        int[] numeros = {9,5,7,22,10};

        for(int i = 0; i < tamanho; i++){
            System.out.println(livros[i]);
        }
        for(int numero : numeros){
            System.out.println(numero);
        }

        int[][] matriz = new int[3][2];

        matriz[0][0] = 1;
        matriz[2][1] = 0;

        System.out.println(matriz[2][1]);
    }
}