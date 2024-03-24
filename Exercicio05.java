public class Exercicio05 {

    public static void executar(){
        int[] vetor = new int[5];
        
        System.out.println("Preencha o vetor com valores: ");
        for(int i = 0; i < 5; i++){
            System.out.println("Posição" + (i+1) +":");
            vetor[i] = Prompt.lerInteiro();

    }
        System.out.println("Digte um valor para N:");
        int n = Prompt.lerInteiro();

        
        int cont = 0; 
        for(int i = 0; i < 5; i++ ){
            if(vetor[i] == n){
                cont= cont+1;
            }
        }
        
            System.out.println("Valor de N: "+ n + " apareceu " + cont + " vezes.");

   
    }
}