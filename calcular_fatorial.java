import java.util.Scanner;

public class calcular_fatorial {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");

        int num = scanner.nextInt();
        int fatorial = 1;

        for(int i = 1; i <= num; i++){
            fatorial *= i;
        }

        System.out.println("O fatorial de "+num+" é:"+fatorial);
    }
}
