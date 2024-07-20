import java.util.ArrayList;
import java.util.Scanner;

public class mostrar_pares {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String resposta;

        ArrayList <Integer> pares = new ArrayList<Integer>();

        do {
            System.out.println("Digite um número:");
            int num = scanner.nextInt();

            if(num%  2 == 0){
                pares.add(num);
            }

            System.out.println("Deseja continuar? (sim/não)");
            resposta = scanner.next();

        } while (resposta.equalsIgnoreCase("sim"));

        System.out.println("Números pares digitados: "+pares);


    }
}
