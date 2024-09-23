import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        /*
         *O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, com estes dois números você deverá obter a
         * quantidade de iterações (for) e realizar a impressão no console (System.out.print) dos números incrementados, exemplo:
         *
         *  * Se você passar os números 12 e 30, logo teremos 17 iterações (for) com ocorrências para imprimir os números: "Imprimindo o
         *    número 1", "Imprimindo o número 2" e assim por diante.
         *
         *  * Se o primeiro parâmetro for MAIOR que o segundo, você deverá lançar uma exceção customizada chamada de
         *    ParametrosInvalidosException com a seguinte mensagem: "O segundo parâmetro deve ser maior que o segundo."
         *
         *  1. Crie o projeto ""DesafioControleFluxo
         *  2. Dentro do projeto, crie a classe contador.java para realizar toda a codificação do nosso programa.
         *  3. Dentro do projeto, crie a classe ParametroInvalidoException.java que representará a exceção de negócio no sistema.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Entre com o primeiro número: ");
        int primeiroNumero = input.nextInt();
        System.out.println("Entre com o segundo número: ");
        int segundoNumero = input.nextInt();

        try {
            contador(primeiroNumero, segundoNumero);
        } catch (ParametroInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void contador(int primeiroNumero, int segundoNumero) throws ParametroInvalidoException {
        if (primeiroNumero > segundoNumero) {
            throw new ParametroInvalidoException();
        }
        int iteracoes = segundoNumero - primeiroNumero + 1;

        for (int i = 1; i < iteracoes; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
