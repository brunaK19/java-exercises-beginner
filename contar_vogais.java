import java.util.Scanner;

public class contar_vogais {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:");

        String frase = scanner.nextLine();

        int cont = 0;

        for(char f: frase.toLowerCase().toCharArray()){
            if(f == 'a' || f == 'e' || f == 'i' || f == 'o' || f == 'u'){
                cont++;
            }

        }

        System.out.println("Total de vogais: "+cont);

    }



}