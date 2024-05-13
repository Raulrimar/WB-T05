import java.util.Scanner;

public class dobro {
    public static void main(String[] args) {
        int num;
        int dobro;
        Scanner total = new Scanner(System.in); 

        System.out.print("Informe um némero para que seja calculado o seu dobro: ");
        num = total.nextInt();

        dobro = num * 2;

        System.out.println("O dobro de " + num + " é " + dobro);     

    
    }
}
