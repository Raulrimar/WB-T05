import java.util.Scanner;
public class app {
    Scanner entradaDados = new Scanner(System.in);

    operacoes operacoesMatematica = new operacoes(retornaUmNumemroDigitado(entradaDados),
    retornaUmNumemroDigitado(entradaDados));

    operacoes.mostrarOperacoesNaTela();
    entradaDados.close();

    public static double retornaUmNumemroDigitado(Scanner entradaDeDados){
        System.out.println("Digite um número: ");
        double numeroDigitado = entradaDeDados.nextDouble();

        return numeroDigitado;
    }

}
