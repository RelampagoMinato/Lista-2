import java.util.Scanner;

public class Exercicio15 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[5];
        
        System.out.println("Digite o 1º número: ");
        vetor[0] = leitor.nextInt();
        
        for (int i = 1; i < 5; i++) {
            System.out.println("Digite o próximo número: ");
            int numero = leitor.nextInt();
            if (numero > vetor[i - 1]) {
                vetor[i] = numero;
            } else {
                System.out.println("Número inválido. Digite um número maior que o anterior.");
                i--; 
            }
        }
        
        System.out.println("Vetor preenchido: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }
        
        leitor.close();
    }
}
