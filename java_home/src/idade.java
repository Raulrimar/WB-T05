import java.util.Scanner;

public class idade {
    public static void main(String[] args){/**Criação de um metodo principal main */
        String nome;
        int idade;
        double valor;
        boolean bool;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu nome? ");
        nome = sc.nextLine();

        System.out.println("Qual a sua idade? ");
        idade = sc.nextInt();

        System.out.println("informe seu salário? ");
        valor = sc.nextDouble();

        System.out.println("Seu nome é "+ nome +" você tem  " + idade + " e se salário mensal é R$"+ valor );

    }
}
