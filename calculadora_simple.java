import java.util.Scanner;

public class calculadora_simple {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double num1, num2;

        System.out.println("Digite um número:");

        num1 = scanner.nextInt();

        System.out.println("Digite outro número:");

        num2 = scanner.nextInt();

        System.out.println("Escolha a operação(+, -, *, /)");

        char operacao = scanner.next().charAt(0);

        switch (operacao){
            case '+':
                double soma = num1 + num2;
                System.out.println("A soma dos números é: "+soma);

                break;

            case '-':
                double sub = num1 - num2;
                System.out.println("A subtração dos números é: "+sub);

                break;

            case '*':
                double multi = num1 * num2;
                System.out.println("A multiplicação dos números é: "+multi);

                break;

            case '/':
                double div = num1 / num2;
                System.out.println("A divisão dos números é: "+div);

                break;
        }


    }
}
