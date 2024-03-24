public class Exercicio12 {
    public static void executar(){
     
    int[] vetor = new int[12];
 
    System.out.println("Preencha o vetor: ");
    for(int i = 0; i < 12; i++ ){
     System.out.println("Posição"+(i+1)+": ");
     vetor[i]=Prompt.lerInteiro();
    }
     
     for(int i = 0; i < 12; i++ ){
     System.out.println(vetor[i]);
    }
     
     
 
     int produto = 1;
     for(int i= 0; i<12; i++){
         if( vetor[i] != 0 && vetor[i] % 2 == 0 && vetor[i] > 0){
          produto *= vetor[i];
        }
    }
    
    System.out.println("O produto dos elementos pares positivos é: " + produto);
 
 
 
    } 
}
 