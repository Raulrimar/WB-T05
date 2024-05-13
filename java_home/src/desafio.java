import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A;
        int B;
        int X;
        
        System.out.println("informe o 1º valor: ");
        A = entrada.nextInt();

        System.out.println("informe o 2º valor: ");
        B = entrada.nextInt();

        X = A + B;

        System.out.println("a soma de " + A + " e " + B + " é " + X);

        if (A > B){
            System.out.println("O valor de A é maior que o valor de B");
        }
        else if(A < B){
            System.out.println("O valor de B é maior que o Valor de A");
        }
        else if(A == B){
            System.out.println("Os valore são iguais");
        }
        }

    }
