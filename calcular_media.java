import java.util.Scanner;

public class calcular_media {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cont = 0;
        int soma = 0;
        String resposta;

        do {
            System.out.println("Digite um número:");
            int num = scanner.nextInt();

            soma += num;
            cont++;

            System.out.println("Deseja continuar? (sim/não)");
            resposta = scanner.next();

        } while (resposta.equalsIgnoreCase("sim"));

        double media = soma/cont;

        System.out.println("A média é: "+media);

    }


}

