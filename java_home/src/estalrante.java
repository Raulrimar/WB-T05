import java.util.Scanner;
public class estalrante {
    public static void main(String[] args) {
        int escolha;

      

        System.out.println("Bem-vindo ao Restaurante!");
        System.out.println("Escolha uma opção:");

        System.out.println("1. Pizza");
        System.out.println("2. Hambúrguer");
        System.out.println("3. Salada");
        
        Scanner cardapio = new Scanner(System.in);

        escolha = cardapio.nextInt();

        switch (escolha) {
            case 1:

                if(escolha == 1){
                System.out.println("O valor da pizza é R$ 30,00 (Trinta Reais)");
            }
                break;
            
            case 2:
            if(escolha == 2){
                System.out.println("O valor da Hamburguer é R$ 20,00 (Vinte Reais)");
            }
                break;
            case 3:
                if(escolha == 3){
                    System.out.println("O valor da Salada é R$ 15,00 (Quinze Reais)");
                }
                    break;
        
            default:
                break;
        }

    }
}
