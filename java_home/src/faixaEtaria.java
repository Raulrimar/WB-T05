import java.util.Scanner;

public class faixaEtaria {
    public static void main(String[] args) {
        String nome;
        int anoNascimento;
        int anoAtual = 2024;
        int idade;
    Scanner calculo = new Scanner(System.in);

    System.out.println("Informe o seu nome: ");
    nome = calculo.nextLine();

    System.out.println("informe o ano de seu nascimento: ");
    anoNascimento = calculo.nextInt();

    idade = anoAtual - anoNascimento;

    switch (idade) {
        case 1:
            if (idade > 10 & idade < 16);
            System.out.println("Você é adolecente");            
            break;
        case 2:
        
    
        default:
            break;
    }

    }
}
