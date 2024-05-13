import java.util.Scanner;

public class dieta {
    public static void main(String[] args) {
        int calDia = 2400;
        String ali1;
        int vali1;
        String ali2;
        int vali2;
        String ali3;
        int vali3;
       
        
        Scanner alimentos = new Scanner(System.in);

        Scanner calorias = new Scanner(System.in);

        System.out.println("Infrome a quantidade de calorias gasta no dia");
        calDia = calorias.nextInt();
        calorias.close();

        System.out.println("informe o nome do alimento:");
        ali1 = alimentos.nextLine();
        
        System.out.println("calorias"+calDia+ " e " +ali1);

    }
}
