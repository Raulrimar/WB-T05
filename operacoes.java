public class operacoes {/**Uma classe é meu objeto personalizado - um molde */
    double n1,n2;

    public operacoes(double n1, double n2){

        this.n1 = n1; /**FAz referencia exatamente a esse valor */
        this.n2 = n2;
    }

    public void mostrarOperacoesNaTela(){/** prar retornar vazio */
        System.out.printf("Soma: %.2f + %.2f = %.2f \n", this.n1, this.n2,soma());

        System.out.printf("Subtração: %.2f - %.2f = %.2f \n", this.n1, this.n2,subtracao());

        System.out.printf("Multiplicação %.2f * %.2f = %2.2f");

        System.out.printf("Divisão: %.2f / %.2f = %.2f");

        System.out.printf("O resto da divisão: %.2f % %.2f = %.2f");
    } 
    /**fazendo o retor */
    public double soma(){
       double soma = this.n1 + this.n2;
       return soma;
    }

    public double subtracao(){
        return this.n1 - this.n2;
    }

    public double multiplicacao(){
        return  this.n1 * this.n2;
    }

    public double divisao(){
        return this.n1 / this.n2;
    }
}
