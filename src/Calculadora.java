import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Entrada - Usuário vai digitar dois valores
        int a, b, soma, subtracao, multiplicacao;
        double divisao;

        System.out.println("Digite o primeiro valor: ");
        a = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        b = sc.nextInt();

         soma = a + b;
         subtracao = a - b;
         multiplicacao = a * b;
         divisao = a / b;

        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da subtração: " + subtracao);
        System.out.println("Resultado da soma: " + multiplicacao);
        System.out.println("Resultado da subtração: " + divisao);


        sc.close();
    }
}
