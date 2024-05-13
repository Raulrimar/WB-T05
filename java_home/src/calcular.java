import java.util.Scanner;

public class calcular {
    public static void main(String[] args) {
        int operacao;
        int operador;
        int n1;
        int n2;

        Scanner calcular = new Scanner(System.in);

        System.out.println("informe o operador matemático sendo:");
        System.out.println("1 - Adição +");
        System.out.println("2 - Subtração -");
        System.out.println("3 - Multiplicaão *");
        System.out.println("4 - Divisão /");
        operador = calcular.nextInt();
        if(operador == 1){
            System.out.println("A opção escolhida foi Adição");  
        }
        else if(operador == 2){
            System.out.println("A opção escolhida foi Subtração");  
        }
        else if(operador == 3){
            System.out.println("A opção escolhida foi Multiplicação");  
        }
        else if(operador == 4){
            System.out.println("A opção escolhida foi Divisão");  
        }        
        

    System.out.println("Informe o 1º Valor: ");
    n1 = calcular.nextInt();

    System.out.println("Informe o 2º Valor: ");
    n2 = calcular.nextInt();

   switch (operador) {
    case 1:
    if(operador == 1){
        operacao = n1 + n2;
        System.out.println("O valor da adição de "+ n1 +" e "+ n2 +" é " + operacao);  
    }         
    break;
    case 2:
    if(operador == 2){
        operacao = n1 - n2;
        System.out.println("O valor da subtração de "+ n1 +" e "+ n2 +" é " +operacao);
    }          
    break;
    case 3:
    if(operador == 3){
        operacao = n1 * n2;
        System.out.println("O valor da multipicação de "+ n1 +" e "+ n2 +" é "+ operacao);  
    }          
    break;    
    case 4:
    if(operador == 4){
        operacao = n1 / n2;
        System.out.println("O valor da divisão de "+ n1 +" e "+ n2 +" é "+operacao);
    }      
    break;
    case 5:
    if(operador != 1 & operador != 2 & operador != 3 & operador != 4){
        System.out.println("VALOR INFORMADO É INVÁLIDO!");
    }     
    break;
    default:
    if(operador != 1 & operador != 2 & operador != 3 & operador != 4){
        System.out.println("VALOR INFORMADO É INVÁLIDO!");
    }     
        break;
   }
        
    }
}
