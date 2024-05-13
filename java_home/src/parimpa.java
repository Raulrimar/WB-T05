import java.util.Scanner;
public class parimpa {
    public static void main(String[] args) {
        int n1;
        int n2 = 2;
        int divisao;

        Scanner resto = new Scanner(System.in);

        System.out.println("Informe o valor a ser consultado: ");
        n1 = resto.nextInt();

        divisao = n1 % n2;

        if(divisao == 0){
            System.out.println("o número é PAR");
        }
        else{
            System.out.println("o número é IMPAR!");
        }

    }
}
